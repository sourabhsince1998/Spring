package com.jsp.Demo.Mod1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/Demo/Mod1/Config1.xml");//upcasting
       
       
       Student a=(Student)context.getBean("student1"); 
       System.out.println(a);
       System.out.println("project execution completed ");
    }
}
