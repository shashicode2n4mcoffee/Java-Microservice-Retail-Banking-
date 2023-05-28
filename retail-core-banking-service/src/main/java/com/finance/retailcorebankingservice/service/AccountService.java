package com.finance.retailcorebankingservice.service;

import com.finance.retailcorebankingservice.model.dto.BankAccount;
import com.finance.retailcorebankingservice.model.dto.UtilityAccount;

public interface AccountService {
    public BankAccount readBankAccount(String accountNumber);
    public UtilityAccount readUtilityAccount(String provider);
    public UtilityAccount readUtilityAccount(Long id);
}
