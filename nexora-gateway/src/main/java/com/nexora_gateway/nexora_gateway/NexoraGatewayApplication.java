package com.nexora_gateway.nexora_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NexoraGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexoraGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRoute(RouteLocatorBuilder builder) {
		return builder.routes().route(p -> p
				.path("/get")
				.filters(f -> f.addRequestHeader("Hello", "World"))
				.uri("http://httpbin.org:80")).build();
	}

}
