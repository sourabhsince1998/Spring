package com.jsp.Demo.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/Demo/CollectionType/Config2.xml");//upcasting
       
       
      Emp p= context.getBean("emp1",Emp.class);
       System.out.println(p);
       System.out.println("project execution completed ");
    }
}
