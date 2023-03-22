package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController 
{
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		
		return "User Service is down at this time";
		
	}
	
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		
		return "Contact service is down at this time";
	}
	
	

}
