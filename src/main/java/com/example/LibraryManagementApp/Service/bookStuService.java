package com.example.LibraryManagementApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementApp.Entity.bookStu;
import com.example.LibraryManagementApp.Repo.bookStuRepo;

@Service
public class bookStuService {

    @Autowired
    private bookStuRepo BookStuRepo;

    // save function
    @SuppressWarnings("null")
    public bookStu saveBookStuDetails(bookStu BookStu) {
        return BookStuRepo.save(BookStu);
    }

    // get all book_student details
    public List<bookStu> getAllBookStuDetails() {
        return BookStuRepo.findAll();
    }

    // get book_student details by id
    public bookStu getBookStuDetailsById(int issueId) {
        return BookStuRepo.findById(issueId).orElse(null);
    }

    // update book_student data
    public bookStu updateBookStuData(bookStu BookStu) {
        bookStu updateBookStu = BookStuRepo.findById(BookStu.getIssueId()).orElse(null);

        if (updateBookStu != null) {

            updateBookStu.setBookId(BookStu.getBookId());
            updateBookStu.setStudentId(BookStu.getStudentId());
            updateBookStu.setIssueDate(BookStu.getIssueDate());
            updateBookStu.setReturnDate(BookStu.getReturnDate());
            updateBookStu.setReceivedDate(BookStu.getReceivedDate());
            updateBookStu.setDateBalance(BookStu.getDateBalance());
            updateBookStu.setExtraNote(BookStu.getExtraNote());

            BookStuRepo.save(updateBookStu);

            return updateBookStu;
        }

        return null;
    }

    // delete book_student data
    public String deleteBooKStuData(int issueId) {
        BookStuRepo.deleteById(issueId);
        return "Issue note " + issueId + " deleted!";
    }
}
