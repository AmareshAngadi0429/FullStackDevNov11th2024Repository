package com.gentech.bnk.controller;


import com.gentech.bnk.dtolayer.BankingDto;
import com.gentech.bnk.serviceimpl.BankingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class BankController {
    private BankingServiceImpl bankingService;
    @PostMapping("/savingaccount")
    public ResponseEntity<BankingDto>saveAccount(BankingDto bankingDto)
    {
        BankingDto bnk = bankingService.createSavingAccount(bankingDto);
        return new ResponseEntity<>(bnk, HttpStatus.CREATED);
    }

}
