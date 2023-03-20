package com.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App7 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanLifeCycle/Config7.xml");//upcasting
       
      ChickenFry e= context.getBean("c1",ChickenFry.class);
      
      context.registerShutdownHook();
      System.out.println(e);
       
   
       System.out.println("project execution completed ");
    }
}
