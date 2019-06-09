package com.selfstudy.librarymanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;


    @Size(min=2, max= 10)
    private String firstName;


    @Size(min=2, max= 10)
    private String lastName;


    @Size(min=9, max= 10)
    private String idStudent;

    @NotEmpty
    @Email(message = "Email should be valid")
    private String email;


    @Pattern(message = "Phone number should begin by 0 and must have 10 characters",regexp="(^\\+?[0]\\)?([0-9]{9}$))")
    private String phone;


    @Size(min=2, max= 10)
    private String city;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
