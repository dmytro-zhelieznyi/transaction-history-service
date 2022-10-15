package com.example.transactionanaliticservice.repository;

import com.example.transactionanaliticservice.data.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
