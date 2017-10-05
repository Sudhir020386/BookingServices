package com.cloud.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudMicroserviceHotelbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMicroserviceHotelbookingApplication.class, args);
	}
}
