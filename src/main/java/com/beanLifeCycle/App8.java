package com.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App8 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanLifeCycle/Config8.xml");//upcasting
       
      ChickenFry2 e= context.getBean("c1",ChickenFry2.class);
      
     
      System.out.println(e);
      context.registerShutdownHook();
       
   
       System.out.println("project execution completed ");
    }
}
//not executed exception in config8 file