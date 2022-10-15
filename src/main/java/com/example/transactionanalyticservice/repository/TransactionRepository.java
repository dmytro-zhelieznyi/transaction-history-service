package com.example.transactionanalyticservice.repository;

import com.example.transactionanalyticservice.data.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
