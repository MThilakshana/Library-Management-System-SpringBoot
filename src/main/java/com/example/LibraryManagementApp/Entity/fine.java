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
@Table
@NoArgsConstructor
@AllArgsConstructor
public class fine {

    @Id
    @Column
    private int issueId;

    @Column
    private BigDecimal fineAmount;

    @Column
    private String paidDate;

    @Column
    private BigDecimal paidAmount;

    @Column
    private BigDecimal balanceAmount;

}
