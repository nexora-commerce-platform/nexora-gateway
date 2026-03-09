package com.nexora_gateway.nexora_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NexoraGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexoraGatewayApplication.class, args);
	}

}
