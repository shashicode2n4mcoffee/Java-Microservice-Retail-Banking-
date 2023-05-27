package com.finance.retailbankingcoreservicesregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RetailBankingCoreServicesRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBankingCoreServicesRegistryApplication.class, args);
	}

}
