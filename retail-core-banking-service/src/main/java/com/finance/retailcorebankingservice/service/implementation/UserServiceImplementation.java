package com.finance.retailcorebankingservice.service.implementation;

import com.finance.retailcorebankingservice.model.dto.User;
import com.finance.retailcorebankingservice.model.entity.UserEntity;
import com.finance.retailcorebankingservice.model.mapper.UserMapper;
import com.finance.retailcorebankingservice.repository.UserRepository;
import com.finance.retailcorebankingservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    private UserMapper userMapper = new UserMapper();
    @Autowired
    UserRepository userRepository;
    @Override
    public User readUser(String customerIdentificationNumber) {
        UserEntity userEntity = userRepository.findByCustomerIdentificationNumber(customerIdentificationNumber).get();
        return userMapper.convertToDto(userEntity);
    }

    @Override
    public List<User> readUsers(org.springframework.data.domain.Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }

}
