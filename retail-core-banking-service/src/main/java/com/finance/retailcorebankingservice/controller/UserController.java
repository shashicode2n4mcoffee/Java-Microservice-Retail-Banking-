package com.finance.retailcorebankingservice.controller;

import com.finance.retailcorebankingservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/{customerIdentificationNumber}")
    public ResponseEntity readUser(@PathVariable("customerIdentificationNumber") String customerIdentificationNumber) {
        return ResponseEntity.ok(userService.readUser(customerIdentificationNumber));
    }

    @GetMapping
    public ResponseEntity readUser(Pageable pageable) {
        return ResponseEntity.ok(userService.readUsers(pageable));
    }

}
