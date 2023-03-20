package com.jsp.MultipleConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
	public static void main(String[] args) {
		
	
	//System.out.println("project execution started ");
    
    ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/MultipleConstructor/Config5.xml");
   Test a=context.getBean("test1",Test.class) ;
   System.out.println(a);
   a.add();   
	}
}
