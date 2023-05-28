package com.finance.retailcorebankingservice.service;

import com.finance.retailcorebankingservice.model.dto.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    public User readUser(String customeridentificationNumber);
    public List<User> readUsers(Pageable pageable);
}
