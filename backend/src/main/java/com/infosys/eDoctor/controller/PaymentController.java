package com.infosys.eDoctor.controller;

import com.infosys.eDoctor.DTO.AppointmentDTO;
import com.infosys.eDoctor.entity.Appointment;
import com.infosys.eDoctor.service.AppointmentService;
import com.infosys.eDoctor.service.PaymentService;
import com.itextpdf.text.DocumentException;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.itextpdf.text.DocumentException;
import com.infosys.eDoctor.service.InvoiceService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/create-checkout-session")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> createCheckoutSession(@RequestBody Map<String, Object> payload) {
        try {
            // Extract appointmentId and amount from the payload
            int appointmentId = (int) payload.get("appointmentId");
            double amount = Double.parseDouble(payload.get("amount").toString());

            // Fetch the appointment by appointmentId
            Optional<Appointment> optionalAppointment = appointmentService.getAppointmentEntity(appointmentId);

            if (optionalAppointment.isPresent()) {
                Appointment appointment = optionalAppointment.get();

                // Update the payment status to PAYMENT_PENDING
                appointment.setAppointmentStatus("Scheduled And Paid");
                appointmentService.updateAppointment(appointment);

                // Create Stripe checkout session with the dynamic amount
                String sessionUrl = paymentService.createCheckoutSession(appointment.getAppointmentId(), amount);

                Map<String, String> response = new HashMap<>();
                response.put("sessionUrl", sessionUrl);
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Appointment not found.");
            }
        } catch (StripeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to create checkout session: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid request payload: " + e.getMessage());
        }
    }

    @GetMapping("/success")
    public ResponseEntity<?> handleSuccess(@RequestParam("session_id") String sessionId) {
        try {
            Session session = paymentService.verifyPayment(sessionId);
            String appointmentId = session.getMetadata().get("appointmentId");

            Optional<Appointment> optionalAppointment = appointmentService.getAppointmentEntity(Integer.parseInt(appointmentId));

            if (optionalAppointment.isPresent()) {
                Appointment appointment = optionalAppointment.get();
                appointment.setAppointmentStatus("PAYMENT_CONFIRMED");
                appointmentService.updateAppointment(appointment);

                // Generate invoice
                double amount = session.getAmountTotal() / 100.0; // Convert from cents to actual currency
                byte[] pdfBytes = invoiceService.generateInvoice(appointment, amount);

                return ResponseEntity.ok()
                        .header("Content-Type", "application/pdf")
                        .header("Content-Disposition", "attachment; filename=invoice-" + appointmentId + ".pdf")
                        .body(pdfBytes);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Appointment not found.");
            }
        } catch (StripeException | DocumentException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to process payment or generate invoice: " + e.getMessage());
        }
    }

    @GetMapping("/verify-and-generate-invoice/{sessionId}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> verifyAndGenerateInvoice(@PathVariable String sessionId) {
        try {
            Session session = paymentService.verifyPayment(sessionId);

            if (session != null && "complete".equals(session.getStatus())) {
                String appointmentId = session.getMetadata().get("appointmentId");
                double amount = Double.parseDouble(session.getMetadata().get("amount"));

                Optional<Appointment> optionalAppointment = appointmentService.getAppointmentEntity(Integer.parseInt(appointmentId));

                if (optionalAppointment.isPresent()) {
                    Appointment appointment = optionalAppointment.get();
                    appointment.setAppointmentStatus("PAYMENT_CONFIRMED");
                    appointmentService.updateAppointment(appointment);

                    byte[] pdfBytes = invoiceService.generateInvoice(appointment, amount);

                    return ResponseEntity.ok()
                            .header("Content-Type", "application/pdf")
                            .header("Content-Disposition", "inline; filename=invoice-" + appointmentId + ".pdf")
                            .body(pdfBytes);
                }
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Appointment not found.");
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid or incomplete payment session");
        } catch (StripeException | DocumentException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to process payment or generate invoice: " + e.getMessage());
        }
    }
}
