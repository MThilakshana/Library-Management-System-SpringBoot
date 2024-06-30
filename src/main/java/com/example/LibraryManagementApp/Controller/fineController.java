package com.example.LibraryManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementApp.Entity.fine;
import com.example.LibraryManagementApp.Service.fineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class fineController {

    @Autowired
    private fineService FineService;

    // post data
    @PostMapping("/saveFine")
    public fine postFineData(@RequestBody fine Fine) {
        return FineService.saveFine(Fine);
    }

    // get all data
    @GetMapping("/getAllFine")
    public List<fine> getAllFineData() {
        return FineService.getAllFineDetails();
    }

    // get fine data by id
    @GetMapping("/getFineDataById/{id}")
    public fine getFineById(@PathVariable int id) {
        return FineService.getDataById(id);
    }

    // update function
    @PutMapping("/updateFineData")
    public fine putFineData(@RequestBody fine Fine) {
        return FineService.updateFineData(Fine);
    }

    // delete function
    @DeleteMapping("/deleteFine/{id}")
    public String deleteFine(@PathVariable int id) {
        return FineService.deleteFineData(id);
    }

}
