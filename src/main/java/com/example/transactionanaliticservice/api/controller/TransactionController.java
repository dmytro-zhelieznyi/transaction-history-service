package com.example.transactionanaliticservice.api.controller;

import com.example.transactionanaliticservice.data.entity.TransactionHistory;
import com.example.transactionanaliticservice.sevice.TransactionHistoryService;
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

    private final TransactionHistoryService transactionHistoryService;

    @PostMapping("/history")
    @SneakyThrows
    public void saveTransactionHistory(@RequestBody TransactionHistory transactionHistory) {
        transactionHistoryService.saveTransactionHistory(transactionHistory);
    }

}
