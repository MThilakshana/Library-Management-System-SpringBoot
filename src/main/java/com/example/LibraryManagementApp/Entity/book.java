package com.example.LibraryManagementApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Book")
@NoArgsConstructor
@AllArgsConstructor
public class book {

    @Id
    @Column(name = "Book_ID")
    private String bookId;

    @Column(name = "Book_Name")
    private String bookName;

    @Column(name = "Book_Author")
    private String author;

    @Column(name = "Book_Count")
    private int bookCount;

    @Column(name = "Available_Count")
    private int availableCount;

    @Column(name = "Grade")
    private String grade;
}
