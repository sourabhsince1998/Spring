package com.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ChickenFry implements InitializingBean,DisposableBean
{
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("Setting cost for chicken");
	}

	@Override
	public String toString() {
		return "ChickenFry [cost=" + cost + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Collecting resources  to Prepare Chicken");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("We ate fried Chicken");
		
	}
	
	

}
