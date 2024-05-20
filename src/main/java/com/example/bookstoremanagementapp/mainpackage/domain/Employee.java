package com.example.bookstoremanagementapp.mainpackage.domain;
import jakarta.persistence.*;
@Entity
@Table (name="Employee")
public class Employee {
    @Id
    private String EmployeeId;

    @Column(name = "Email")
    private String e_email;

    @Column(name = "Name")
    private String e_name;

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getEmail() {
        return e_email;
    }

    public String getName() {
        return e_name;
    }

}
