package com.pmf.uns.ac.rs.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfigutation {

	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route(p->p.path("/all-customers/**").uri("lb://customer-service"))
				.route(p->p.path("/add-customer/**").uri("lb://customer-service"))
				.route(p->p.path("/find-customer/**").uri("lb://customer-service"))
				.route(p->p.path("/all-cards/**").uri("lb://card-service"))
				.route(p->p.path("/all-sets/**").uri("lb://card-service"))
				.route(p->p.path("/find-card-by-name/**").uri("lb://card-service"))
				.route(p->p.path("/find-set/**").uri("lb://card-service"))
				.route(p->p.path("/add-card/**").uri("lb://card-service"))
				.route(p->p.path("/add-set/**").uri("lb://card-service"))
				.route(p->p.path("/create-order/**").uri("lb://order-service"))
				.route(p->p.path("/find-cart-by-customer/**").uri("lb://order-service"))
				.route(p->p.path("/get-orders-by-customer/**").uri("lb://order-service"))
				.route(p->p.path("/add-card-to-cart/**").uri("lb://shop-service"))
				.build();
	}
}
