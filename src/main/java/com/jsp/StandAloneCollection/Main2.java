package com.jsp.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/StandAloneCollection/StandAlone.xml");//upcasting
      Emp a= context.getBean("emp1",Emp.class);
       
   System.out.println("===========");
       System.out.println(a.getVehicle());
       
       System.out.println(a.getVehicle().getClass().getName());
       System.out.println("=================================");
       
       System.out.println(a.getEmail());
       System.out.println(a.getEmail().getClass().getName());
       
       System.out.println("=================================");
       System.out.println(a.getName());
       System.out.println(a.getName().getClass().getName());
       
       System.out.println("===========================");
       System.out.println(a.getDbprop());
       System.out.println(a.getDbprop().getClass().getName());
       System.out.println("====================================================" );
       
       Emp b= context.getBean("emp2",Emp.class);
       System.out.println(b.getVehicle());
       System.out.println("project execution completed ");
    }
}
