package com.example.LibraryManagementApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementApp.Entity.book;
import com.example.LibraryManagementApp.Repo.bookRepo;

import jakarta.transaction.Transactional;

@Service
public class bookService {

    @Autowired
    private bookRepo BookRepo;

    // save function
    @SuppressWarnings("null")
    public book saveBookDetails(book Book) {
        return BookRepo.save(Book);
    }

    // get all book details
    public List<book> getAllBookDetails() {
        return BookRepo.findAll();
    }

    // get book details by id
    public book getBookDetailsById(String bookId) {
        return BookRepo.findByBookId(bookId);
    }

    // update book data
    public book updateBookDetails(book Book) {
        book updateBook = BookRepo.findByBookId(Book.getBookId());

        if (updateBook != null) {

            updateBook.setBookName(Book.getBookName());
            updateBook.setAuthor(Book.getAuthor());
            updateBook.setBookCount(Book.getBookCount());
            updateBook.setAvailableCount(Book.getAvailableCount());
            updateBook.setGrade(Book.getGrade());

            BookRepo.save(updateBook);

            return updateBook;
        }
        return null;
    }

    // delete book record
    @Transactional
    public String deleteBookDetails(String bookId) {
        BookRepo.deleteByBookId(bookId);
        return "Book " + bookId + " Deleted!";
    }

}
