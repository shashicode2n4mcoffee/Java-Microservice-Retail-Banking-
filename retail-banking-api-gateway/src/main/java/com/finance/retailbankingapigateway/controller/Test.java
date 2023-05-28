package com.finance.retailbankingapigateway.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping
    public ResponseEntity testApi (){
        return ResponseEntity.ok("API Gateway is working");
    }
}
