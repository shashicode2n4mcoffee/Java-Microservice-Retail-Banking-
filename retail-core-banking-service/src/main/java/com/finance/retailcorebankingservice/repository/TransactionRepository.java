package com.finance.retailcorebankingservice.repository;

import com.finance.retailcorebankingservice.model.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<TransactionEntity,Long> {
}
