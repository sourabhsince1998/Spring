package com.jsp.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
	 public static void main( String[] args )
	    {
	       System.out.println("project execution started ");
	       
	       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/ConstructorInjection/Config4.xml");

	       Dept d=context.getBean("refdept",Dept.class);
	       System.out.println(d);
	       
	       
	       
	     Emp e=context.getBean("refEmp",Emp.class);
	     System.out.println(e);
	    }
}
