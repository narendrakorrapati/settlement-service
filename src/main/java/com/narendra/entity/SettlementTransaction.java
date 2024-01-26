package com.narendra.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "settlement_transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SettlementTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idCol;
	@Column(name = "resp_code", nullable = false, length = 4)
	private String responseCode;
	@Column(name = "msg_type", nullable = false, length = 4)
	private String messageType;
	@Column(name = "amount", nullable = false, length = 10)
	private Double amount;
	@Column(name = "issuer", nullable = false, length = 3)
	private String issuer;
	@Column(name = "acquirer", nullable = false, length = 3)
	private String acquirer;
	@Column(name = "seq_num", nullable = false, length = 6)
	private String sequenceNumber;
	private LocalDateTime dateTime;
	
}
