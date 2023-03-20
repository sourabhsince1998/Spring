package com.jsp.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/autoWiring/autoConfig1.xml");//upcasting
       
     Certificate c=  context.getBean("cert", Certificate.class);
       System.out.println(c);
       System.out.println("==========================");
       Student s=context.getBean("stud100",Student.class);
       System.out.println(s);
       
       System.out.println("project execution completed ");
    }
}
