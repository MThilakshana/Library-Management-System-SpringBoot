package com.example.LibraryManagementApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementApp.Entity.book;

public interface bookRepo extends JpaRepository<book, String> {
    book findByBookId(String bookId);

    void deleteByBookId(String bookId);
}
