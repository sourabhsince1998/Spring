package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@LoadBalanced
// If u want to remove localhost by adding contact-service then use @loadBanaced annotation
public class UserServiceSimpleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceSimpleMicroserviceApplication.class, args);
	}

	@Bean
 public RestTemplate restTemplate()  // to call url of contact
 {
	 return new RestTemplate();
 }
}
