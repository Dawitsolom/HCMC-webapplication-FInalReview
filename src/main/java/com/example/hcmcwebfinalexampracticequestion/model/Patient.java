package com.example.hcmcwebfinalexampracticequestion.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @NotNull
    @Column(nullable=false)
    private String patientNo;
    @NotNull
    @Column(nullable=false)
    private Boolean anOutPatient;
    @NotNull
    @Column(nullable=false)
    private String fullName;
    @Email
    private String emailAddress;
    private String contactPhoneNumber;
    @NotNull
    @Column(nullable=false)
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDate dateOfBirth;

    public Patient() {
    }

    public Patient(Long patientId, String patientNo, Boolean anOutPatient, String fullName, String emailAddress, String contactPhoneNumber, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.patientNo = patientNo;
        this.anOutPatient = anOutPatient;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public Boolean getAnOutPatient() {
        return anOutPatient;
    }

    public void setAnOutPatient(Boolean anOutPatient) {
        anOutPatient = anOutPatient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isPatientOut()
    {
        return this.anOutPatient;
    }

    public int age(){
        return 5;
    }
}
