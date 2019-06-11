package com.selfstudy.librarymanagement.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="provinces")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Long idProvince;
    private String name;

    @OneToMany(targetEntity = Student.class)
    private List<Student> students;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Long idProvince) {
        this.idProvince = idProvince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
