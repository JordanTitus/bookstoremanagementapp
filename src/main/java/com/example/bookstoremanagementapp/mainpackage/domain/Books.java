package com.example.bookstoremanagementapp.mainpackage.domain;
import jakarta.persistence.*;
@Entity
public class Books {
    @Id
    @Column(name = "projectManagerId")
    private String projectManagerId;
}
