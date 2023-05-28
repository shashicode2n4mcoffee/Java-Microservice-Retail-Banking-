package com.finance.retailbankingapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RetailBankingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBankingApiGatewayApplication.class, args);
	}

}
