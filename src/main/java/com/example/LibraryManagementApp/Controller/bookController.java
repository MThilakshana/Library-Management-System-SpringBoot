package com.example.LibraryManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementApp.Entity.book;
import com.example.LibraryManagementApp.Service.bookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class bookController {

    @Autowired
    private bookService BookService;

    // save book
    @PostMapping("/addBook")
    public book postBookDetails(@RequestBody book Book) {
        return BookService.saveBookDetails(Book);
    }

    // get all books
    @GetMapping("/getAllBooks")
    public List<book> getAllBookDetails() {
        return BookService.getAllBookDetails();
    }

    // get book by id
    @GetMapping("/getBookById/{id}")
    public book getbook(@PathVariable String id) {
        return BookService.getBookDetailsById(id);
    }

    // update book details
    @PutMapping("/updateBook")
    public book putBookDetails(@RequestBody book Book) {
        return BookService.updateBookDetails(Book);
    }

    // delete book record
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBookDetails(@PathVariable String id) {
        return BookService.deleteBookDetails(id);
    }

}
