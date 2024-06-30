package com.example.LibraryManagementApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementApp.Entity.fine;
import com.example.LibraryManagementApp.Repo.fineRepo;

@Service
public class fineService {

    @Autowired
    private fineRepo FineRepo;

    // save function
    @SuppressWarnings("null")
    public fine saveFine(fine Fine) {
        return FineRepo.save(Fine);
    }

    // get all function
    public List<fine> getAllFineDetails() {
        return FineRepo.findAll();
    }

    // get data by id
    public fine getDataById(int issueId) {
        return FineRepo.findById(issueId).orElse(null);
    }

    // update function
    public fine updateFineData(fine Fine) {
        fine updateFine = FineRepo.findById(Fine.getIssueId()).orElse(null);

        if (updateFine != null) {

            updateFine.setFineAmount(Fine.getFineAmount());
            updateFine.setPaidDate(Fine.getPaidDate());
            updateFine.setPaidAmount(Fine.getPaidAmount());
            updateFine.setBalanceAmount(Fine.getBalanceAmount());

            FineRepo.save(updateFine);

            return updateFine;
        }

        return null;

    }

    // delete function
    public String deleteFineData(int issueId) {
        FineRepo.deleteById(issueId);
        return "Fine Data " + issueId + " Deleted!";
    }
}
