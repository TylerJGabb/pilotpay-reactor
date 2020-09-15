package com.gabb.study.reverseproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReverseproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseproxyApplication.class, args);
	}


	@Bean
	@LoadBalanced //will look for multiple instances of the same service
	// using the eureka client and balance the loads between them.
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
