package com.infosys.eDoctor.service;

import com.infosys.eDoctor.entity.Appointment;
import com.infosys.eDoctor.entity.Doctor;
import com.infosys.eDoctor.entity.Patient;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class InvoiceService {

    public byte[] generateInvoice(Appointment appointment, double amount) throws DocumentException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, out);
            document.open();

            // Add header
            Font headerFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph header = new Paragraph("Medical Appointment Invoice", headerFont);
            header.setAlignment(Element.ALIGN_CENTER);
            document.add(header);
            document.add(new Paragraph(" ")); // Add spacing

            // Add invoice details
            Font normalFont = new Font(Font.FontFamily.HELVETICA, 12);
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

            // Invoice number and date
            document.add(new Paragraph("Invoice No: INV-" + appointment.getAppointmentId(), normalFont));
            document.add(new Paragraph("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), normalFont));
            document.add(new Paragraph(" "));

            // Patient and Doctor details
            Patient patient = appointment.getPatient();
            Doctor doctor = appointment.getDoctor();

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);

            // Patient Details
            addTableCell(table, "Patient Details", boldFont);
            addTableCell(table, "Doctor Details", boldFont);
            addTableCell(table, "Name: " + patient.getPatientName(), normalFont);
            addTableCell(table, "Name: Dr. " + doctor.getDoctorName(), normalFont);
            addTableCell(table, "ID: " + patient.getPatientId(), normalFont);
            addTableCell(table, "ID: " + doctor.getDoctorId(), normalFont);
            document.add(table);
            document.add(new Paragraph(" "));

            // Appointment Details
            PdfPTable appointmentTable = new PdfPTable(2);
            appointmentTable.setWidthPercentage(100);
            addTableCell(appointmentTable, "Appointment Date", boldFont);
            addTableCell(appointmentTable, appointment.getAppointmentDate().toString(), normalFont);
            addTableCell(appointmentTable, "Status", boldFont);
            addTableCell(appointmentTable, appointment.getAppointmentStatus(), normalFont);
            addTableCell(appointmentTable, "Amount Paid", boldFont);
            addTableCell(appointmentTable, "₹" + String.format("%.2f", amount), normalFont);
            document.add(appointmentTable);

            // Add footer
            document.add(new Paragraph(" "));
            Paragraph footer = new Paragraph("Thank you for choosing our services!", normalFont);
            footer.setAlignment(Element.ALIGN_CENTER);
            document.add(footer);

        } finally {
            document.close();
        }

        return out.toByteArray();
    }

    private void addTableCell(PdfPTable table, String text, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text, font));
        cell.setPadding(5);
        table.addCell(cell);
    }
}