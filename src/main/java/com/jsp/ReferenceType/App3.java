package com.jsp.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	
	 public static void main( String[] args )
	    {
	       System.out.println("project execution started ");
	       
	       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/ReferenceType/Config3.xml");
	       
          B b=context.getBean("refb",B.class);
          System.out.println(b);
          
          A a=context.getBean("refa", A.class);
          System.out.println(a);
	    
	    }
}