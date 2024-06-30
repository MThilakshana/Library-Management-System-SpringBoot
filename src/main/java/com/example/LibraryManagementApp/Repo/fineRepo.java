package com.example.LibraryManagementApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementApp.Entity.fine;

public interface fineRepo extends JpaRepository<fine, Integer> {

}
