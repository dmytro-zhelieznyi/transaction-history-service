package com.example.transactionanaliticservice.sevice;

import com.example.transactionanaliticservice.data.entity.Transaction;
import com.example.transactionanaliticservice.repository.TransactionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionHistoryRepository;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public void saveTransactionHistory(Transaction transactionHistory) {
        log.info("TransactionHistory: {}", objectMapper.writeValueAsString(transactionHistory));
        transactionHistoryRepository.save(transactionHistory);
    }

}
