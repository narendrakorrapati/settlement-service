package com.narendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narendra.entity.SettlementTransaction;

public interface SettlementTransactionRepository extends JpaRepository<SettlementTransaction, Long>{

}
