# E-Doctor - Outpatient Medical Appointment Management System

## Overview
E-Doctor is a comprehensive medical appointment management system built with Spring Boot and React. The system facilitates seamless interaction between patients, doctors, and administrators, enabling efficient healthcare service management through a user-friendly web interface.

## Features

### For Patients
- Account creation and management
- Doctor search and appointment booking
- Appointment status tracking
- Feedback submission for doctors
- Medical history management
- Secure payment processing via Stripe
- Password reset functionality with email OTP

### For Doctors
- Profile management
- Availability scheduling
- Appointment management
- Patient history access
- Real-time appointment status updates
- Email notifications for appointment changes

### For Administrators
- Complete system oversight
- User management (doctors and patients)
- Statistics and analytics dashboard
- Appointment monitoring
- System-wide availability management

## Technical Architecture

### Backend Technologies
- **Framework**: Spring Boot
- **Security**: Spring Security with BCrypt password encryption
- **Database**: JPA/Hibernate
- **Email Service**: JavaMailSender
- **Payment Integration**: Stripe API
- **Cross-Origin**: CORS enabled for local development

### API Endpoints

#### User Management
- `/addUser` - Register new user
- `/loginUser` - User authentication
- `/forgot-password` - Password reset initiation
- `/reset-password` - Password reset completion

#### Doctor Management
- `/doctor/addDoctor` - Register new doctor
- `/doctor/getDoctor/{doctorId}` - Fetch doctor details
- `/doctor/getAllDoctors` - List all doctors
- `/doctor/updateDoctor` - Update doctor information
- `/doctor/deleteDoctor/{doctorId}` - Remove doctor

#### Patient Management
- `/patient/addPatient` - Register new patient
- `/patient/getPatient/{patientId}` - Fetch patient details
- `/patient/getAllPatients` - List all patients
- `/patient/updatePatient` - Update patient information
- `/patient/deletePatient/{patientId}` - Remove patient

#### Appointment Management
- `/appointments` - CRUD operations for appointments
- `/appointments/doctor` - Doctor-specific appointments
- `/appointments/patient` - Patient-specific appointments
- `/appointments/date` - Date-based appointment lookup

#### Feedback System
- `/feedback` - Submit feedback
- `/feedback/doctor/{doctorId}` - Doctor-specific feedback
- `/feedback/patient/{patientId}` - Patient-specific feedback

#### Payment Processing
- `/api/payment/create-checkout-session` - Initialize payment
- `/api/payment/success` - Handle successful payments

### Security Features
- Password encryption using BCrypt
- Session-based authentication
- CSRF protection
- Secure password reset flow
- Role-based access control

## Installation and Setup

### Prerequisites
- Java JDK 11 or higher
- Maven
- MySQL Database
- Node.js and npm (for frontend)
- Stripe account for payment processing
