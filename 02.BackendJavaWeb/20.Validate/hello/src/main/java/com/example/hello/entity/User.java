package com.example.hello.entity;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "firstName")
    private String firstName;

    @Size(min = 2, max = 30)
    @Column(name = "lastName")
    private String lastName;

    @Min(18)
    @Column(name = "age")
    private int age;

    @Email(message = "Email should be valid")
    @Column(name = "email")
    private String email;

    @Pattern(message = "Phone number should begin by 0 and must have 10 characters",regexp="(^\\+?[0]\\)?([0-9]{9}$))")
    @Column(name = "phone")
    private String phone;

    public User() {}

    public User(String firstName, String lastName, int age, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setLastName(String lastNam) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

}