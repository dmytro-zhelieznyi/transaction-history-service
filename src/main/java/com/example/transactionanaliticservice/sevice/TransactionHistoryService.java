package com.example.transactionanaliticservice.sevice;

import com.example.transactionanaliticservice.data.entity.TransactionHistory;
import com.example.transactionanaliticservice.repository.TransactionHistoryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionHistoryService {

    private final TransactionHistoryRepository transactionHistoryRepository;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public void saveTransactionHistory(TransactionHistory transactionHistory) {
        log.info("TransactionHistory: {}", objectMapper.writeValueAsString(transactionHistory));
        transactionHistoryRepository.save(transactionHistory);
    }

}
