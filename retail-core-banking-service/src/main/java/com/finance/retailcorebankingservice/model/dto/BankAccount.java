package com.finance.retailcorebankingservice.model.dto;

import com.finance.retailcorebankingservice.model.AccountStatus;
import com.finance.retailcorebankingservice.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {
    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;
}
