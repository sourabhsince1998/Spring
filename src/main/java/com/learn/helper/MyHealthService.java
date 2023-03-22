package com.learn.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MyHealthService implements HealthIndicator 
{

	public static final String DB_SERVICE="Database Service";
	
	public boolean isHealthGood() {
		
		//custom logic
		 return true;
	}
	@Override
	public Health health() {
		
	if (isHealthGood()) {
		return Health.up().withDetail(DB_SERVICE, "Database Service is running").build();
	}
		return Health.down().withDetail(DB_SERVICE, "Database Service is running down").build();
}
}