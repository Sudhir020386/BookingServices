package com.cloud.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudRegistryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRegistryserverApplication.class, args);
       System.out.println("Test");
	}
}
