package com.edumanage.studentstaff.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(name = "roll_number", unique = true)
    private String rollNumber;

    private String department;

    @Column(name = "fee_status")
    private String feeStatus;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getFeeStatus(){
        return feeStatus;
    }
    public void setFeeStatus(String feeStatus){
        this.feeStatus = feeStatus;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
}
