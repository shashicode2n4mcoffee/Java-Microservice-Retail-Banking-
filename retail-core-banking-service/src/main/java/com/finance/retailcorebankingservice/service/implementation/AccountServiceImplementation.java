package com.finance.retailcorebankingservice.service.implementation;

import com.finance.retailcorebankingservice.model.dto.BankAccount;
import com.finance.retailcorebankingservice.model.dto.UtilityAccount;
import com.finance.retailcorebankingservice.model.entity.BankAccountEntity;
import com.finance.retailcorebankingservice.model.entity.UtilityAccountEntity;
import com.finance.retailcorebankingservice.model.mapper.BankAccountMapper;
import com.finance.retailcorebankingservice.model.mapper.UtilityAccountMapper;
import com.finance.retailcorebankingservice.repository.BankAccountRepository;
import com.finance.retailcorebankingservice.repository.UtilityAccountRepository;
import com.finance.retailcorebankingservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImplementation implements AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    @Autowired
    BankAccountRepository bankAccountRepository;
    @Autowired
    UtilityAccountRepository utilityAccountRepository;

    @Override
    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    @Override
    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    @Override
    public UtilityAccount readUtilityAccount(Long id) {
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }
}
