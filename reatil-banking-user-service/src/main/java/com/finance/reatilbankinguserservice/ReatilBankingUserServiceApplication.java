package com.finance.reatilbankinguserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReatilBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReatilBankingUserServiceApplication.class, args);
	}

}
