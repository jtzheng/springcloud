package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ErukaClientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ErukaClientApplication.class, args);

	}

}
