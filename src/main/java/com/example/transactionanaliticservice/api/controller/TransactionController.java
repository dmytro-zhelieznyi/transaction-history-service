package com.example.transactionanaliticservice.api.controller;

import com.example.transactionanaliticservice.data.entity.Transaction;
import com.example.transactionanaliticservice.sevice.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/transactions")
@RestController
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionHistoryService;

    @PostMapping()
    @SneakyThrows
    public void saveTransactionHistory(@RequestBody Transaction transactionHistory) {
        transactionHistoryService.saveTransactionHistory(transactionHistory);
    }

}
