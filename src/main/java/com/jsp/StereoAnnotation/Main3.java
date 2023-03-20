package com.jsp.StereoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 
{
    public static void main( String[] args )
    {
       System.out.println("project execution started ");
       
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/StereoAnnotation/Stereo1.xml");//upcasting
       
       Ipl p=context.getBean("ipl", Ipl.class);
       System.out.println(p);
     
       System.out.println("project execution completed ");
    }
}
