package com.example.LibraryManagementApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementApp.Entity.student;
import com.example.LibraryManagementApp.Repo.studentRepo;

import jakarta.transaction.Transactional;

@Service
public class studentService {

    @Autowired
    private studentRepo StudentRepo;

    // save student function
    @SuppressWarnings("null")
    public student saveStudentDetails(student Student) {
        return StudentRepo.save(Student);
    }

    // get all students details
    public List<student> getAllStudentDetails() {
        return StudentRepo.findAll();
    }

    // get student details by id
    public student getStudentById(String studentId) {
        return StudentRepo.findByStudentId(studentId);
    }

    // update studet details
    public student updateStudentDetails(student Student) {
        student updateStudent = StudentRepo.findByStudentId(Student.getStudentId());

        if (updateStudent != null) {

            updateStudent.setStudentName(Student.getStudentName());
            updateStudent.setStudentEmail(Student.getStudentEmail());
            updateStudent.setContactNo(Student.getContactNo());
            updateStudent.setStudentNic(Student.getStudentNic());
            updateStudent.setTotalFineAmount(Student.getTotalFineAmount());
            updateStudent.setStatus(Student.getStatus());

            StudentRepo.save(updateStudent);

            return updateStudent;
        }

        return null;
    }

    // delete student
    @Transactional
    public String deleteStudentDetails(String studentId) {
        StudentRepo.deleteByStudentId(studentId);
        return "Student " + studentId + " Deleted!";
    }

}
