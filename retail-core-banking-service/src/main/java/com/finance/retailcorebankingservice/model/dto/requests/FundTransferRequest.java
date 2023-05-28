package com.finance.retailcorebankingservice.model.dto.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundTransferRequest {
    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;
}
