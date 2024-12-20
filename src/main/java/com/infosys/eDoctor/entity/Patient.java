package com.infosys.eDoctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {

    @Id
    private int patientId;
    private String patientName;
    private String mobileNo;
    private String email;
    private String password;
    private String bloodGroup;
    private String gender;
    private int age;
    private String address;

    //Request
    private String requestStatus;

    // Default constructor
    public Patient() {
    }

    // Parameterized constructor
    public Patient(int patientId, String patientName, String mobileNo, String email,
                   String password, String bloodGroup, String gender, int age, String address) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    // Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
