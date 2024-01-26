package com.narendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narendra.entity.SettlementTransaction;
import com.narendra.repository.SettlementTransactionRepository;

@Service
public class SettlementTransactionServiceImpl implements SettlementTransactionService{

	@Autowired
	private SettlementTransactionRepository transactionRepository;
	
	@Override
	public List<SettlementTransaction> findAll() {
		return transactionRepository.findAll();
	}
}
