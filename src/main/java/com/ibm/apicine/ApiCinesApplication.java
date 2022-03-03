package com.ibm.apicine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ApiCinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCinesApplication.class, args);
	}

}
