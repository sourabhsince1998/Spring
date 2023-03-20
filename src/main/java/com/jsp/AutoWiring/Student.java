package com.jsp.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	

	
	private Certificate certi;

	public Certificate getCerti() {
		return certi;
	}
	//@Qualifier("certi1")
	//@Autowired
	
	public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("Setting properties using setter()");
	}
	
	
	public Student(Certificate certi) {
		super();
		this.certi = certi;
		System.out.println("injecting properties using constructor");
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "Student [certi=" + certi + "]";
	}
	
	
	

}
