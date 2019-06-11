package com.test.hotelmanagement.entity;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @NotEmpty
    private String idEmployee;

    private String position;

    @NotEmpty
    @Size(min=2, max= 50)
    private String fullName;

    @NotEmpty(message="YYYY-MM-DD")
    private String dateOfBirth;

    @NotEmpty
    private String gender;

    @Pattern(message = "Phone number should begin by 0 and must have 10 characters",regexp="(^\\+?[0]\\)?([0-9]{9}$))")
    private String phone;

    @NotEmpty
    private String numberIdenti;

    @NotEmpty
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty
    private String address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumberIdenti() {
        return numberIdenti;
    }

    public void setNumberIdenti(String numberIdenti) {
        this.numberIdenti = numberIdenti;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


