package com.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanLifeCycle/Config6.xml");//upcasting
       
      Exam e= context.getBean("exam1",Exam.class);
      
      context.registerShutdownHook();
      System.out.println(e);
       
   
       System.out.println("project execution completed ");
    }
}
