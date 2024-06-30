package com.example.LibraryManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementApp.Entity.student;
import com.example.LibraryManagementApp.Service.studentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class studentController {

    @Autowired
    private studentService StudentService;

    // save student
    @PostMapping("/addSudent")
    public student postStudentDetails(@RequestBody student Student) {
        return StudentService.saveStudentDetails(Student);
    }

    // get all students details
    @GetMapping("/getAllStudents")
    public List<student> getAllStudentsDetails() {
        return StudentService.getAllStudentDetails();
    }

    // get student details by id
    @GetMapping("/getStudentById/{id}")
    public student getStudentDetailsById(@PathVariable String id) {
        return StudentService.getStudentById(id);
    }

    // update book details
    @PutMapping("/updateBookDetails")
    public student putStudentDetails(@RequestBody student Student) {
        return StudentService.updateStudentDetails(Student);
    }

    // delete student
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentDetails(@PathVariable String id) {
        return StudentService.deleteStudentDetails(id);
    }

}
