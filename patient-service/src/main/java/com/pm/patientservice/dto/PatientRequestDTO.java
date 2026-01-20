package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class PatientRequestDTO {
    @NotBlank(message = "Name is Required")
    @Size(max = 100, message = "Name cannot exceed 100 Characters")
    private String name;

    @NotBlank(message = "Email is Required")
    @Email(message = "Email Should be valid")
    private String email;

    @NotBlank(message = "Address is Reuired")
    private String address;

    @NotBlank(message = "Date of birth is Required")
    private String dateOfBirth;

    @NotBlank(groups= CreatePatientValidationGroup.class,message = "Registered Date is Required")
    private String registeredDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
