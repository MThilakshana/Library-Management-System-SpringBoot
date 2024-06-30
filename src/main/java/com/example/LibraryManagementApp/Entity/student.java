package com.example.LibraryManagementApp.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
public class student {

    @Id
    @Column(name = "Student_ID")
    private String studentId;

    @Column(name = "Student_Name")
    private String studentName;

    @Column(name = "Student_Email")
    private String studentEmail;

    @Column(name = "Contact_No")
    private String contactNo;

    @Column(name = "Student_NIC")
    private String studentNic;

    @Column(name = "Total_Fine")
    private BigDecimal totalFineAmount;

    @Column(name = "Status")
    private String status;

}
