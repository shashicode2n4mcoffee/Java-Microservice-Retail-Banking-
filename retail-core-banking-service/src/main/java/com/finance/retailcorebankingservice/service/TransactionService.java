package com.finance.retailcorebankingservice.service;

import com.finance.retailcorebankingservice.model.dto.BankAccount;
import com.finance.retailcorebankingservice.model.dto.requests.FundTransferRequest;
import com.finance.retailcorebankingservice.model.dto.requests.UtilityPaymentRequest;
import com.finance.retailcorebankingservice.model.dto.responses.FundTransferResponse;
import com.finance.retailcorebankingservice.model.dto.responses.UtilityPaymentResponse;

import java.math.BigDecimal;

public interface TransactionService {


    public FundTransferResponse fundTransfer(FundTransferRequest fundTransferRequest);
    public UtilityPaymentResponse utilPayment(UtilityPaymentRequest utilityPaymentRequest);
    public String internalFundTransfer(BankAccount fromBankAccount, BankAccount toBankAccount, BigDecimal amount);
}
