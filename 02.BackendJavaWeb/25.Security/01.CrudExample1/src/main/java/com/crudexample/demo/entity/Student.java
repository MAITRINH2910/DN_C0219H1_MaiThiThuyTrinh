package com.crudexample.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Stu;

    @NotEmpty
    @Size(min =2, max=30)
    @Column(name ="firstName")
    private String firstName;

    @NotEmpty
    @Size(min=2, max=30)
    @Column(name="lastName")
    private String lastName;

    @Email
    @NotEmpty
    private String email;

    @Pattern(message="Phone number should begin 0 and must have 10 characters",regexp="(^\\+?[0]\\)?([0-9]{9}$))")
    private String phone;

    @NotEmpty
    private String city;

    @NotEmpty
    private String district;

    public int getId_Stu() {
        return id_Stu;
    }

    public void setId_Stu(int id_Stu) {
        this.id_Stu = id_Stu;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }



}
