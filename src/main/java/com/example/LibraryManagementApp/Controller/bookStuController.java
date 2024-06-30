package com.example.LibraryManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementApp.Entity.bookStu;
import com.example.LibraryManagementApp.Service.bookStuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class bookStuController {

    @Autowired
    private bookStuService BookStuService;

    // save function
    @PostMapping("/addBookStu")
    public bookStu postBookStu(@RequestBody bookStu BookStu) {
        return BookStuService.saveBookStuDetails(BookStu);
    }

    // get all function
    @GetMapping("/getAllBookStu")
    public List<bookStu> getAllBookStuDetails() {
        return BookStuService.getAllBookStuDetails();
    }

    // get data by id function
    @GetMapping("/getBookStuById/{id}")
    public bookStu getBookStuById(@PathVariable int id) {
        return BookStuService.getBookStuDetailsById(id);
    }

    // update data function
    @PutMapping("/updateBookStu")
    public bookStu putBookStu(@RequestBody bookStu BookStu) {
        return BookStuService.updateBookStuData(BookStu);
    }

    // delete function
    @DeleteMapping("/deleteBookStu/{id}")
    public String deleteBookStu(@PathVariable int id) {
        return BookStuService.deleteBooKStuData(id);
    }

}
