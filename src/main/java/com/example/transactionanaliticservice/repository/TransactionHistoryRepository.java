package com.example.transactionanaliticservice.repository;

import com.example.transactionanaliticservice.data.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {
}
