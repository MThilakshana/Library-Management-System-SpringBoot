package com.example.LibraryManagementApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementApp.Entity.student;

public interface studentRepo extends JpaRepository<student, String> {
    student findByStudentId(String studentId);

    void deleteByStudentId(String studentId);
}
