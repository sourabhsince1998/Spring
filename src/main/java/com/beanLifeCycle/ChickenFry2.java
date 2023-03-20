package com.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ChickenFry2 
{
	private double cost;

	public double getCost() 
	{
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
                @PostConstruct
             public void start() {
	            System.out.println("started");
    }
            @PreDestroy     
         public void stop() 
            {
	     System.out.println("ended");
   }
	

     }
