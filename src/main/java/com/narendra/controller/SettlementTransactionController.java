package com.narendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.entity.SettlementTransaction;
import com.narendra.service.SettlementTransactionService;

@RestController
@RequestMapping(path = "/api/v1/settl-transaction")
public class SettlementTransactionController {

	@Autowired
	private SettlementTransactionService transactionService;
	
	@GetMapping(path = "/")
	public ResponseEntity<List<SettlementTransaction>> getAllTransactions() {
		return new ResponseEntity<>(transactionService.findAll(), HttpStatus.OK);
	}
}
