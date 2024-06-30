package com.example.LibraryManagementApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Book_Student")
@NoArgsConstructor
@AllArgsConstructor
public class bookStu {

    @Id
    @Column
    @GeneratedValue
    private int issueId;

    @Column
    private String bookId;

    @Column
    private String studentId;

    @Column
    private String issueDate;

    @Column
    private String returnDate;

    @Column
    private String receivedDate;

    @Column
    private int dateBalance;

    @Column
    private String extraNote;

}
