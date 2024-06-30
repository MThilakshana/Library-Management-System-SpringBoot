package com.example.LibraryManagementApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementApp.Entity.bookStu;

public interface bookStuRepo extends JpaRepository<bookStu, Integer> {

}
