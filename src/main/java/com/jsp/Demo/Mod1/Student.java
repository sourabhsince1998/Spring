package com.jsp.Demo.Mod1;

public class Student 
{
	private int usn;
	private String name;
	private double marks;
	public int getUsn() 
	{
		
		return usn;
	}
	public void setUsn(int usn) 
	{
		System.out.println("setting usn");
		this.usn = usn;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		System.out.println("setting name");
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) 
	{
		System.out.println("setting marks");
		this.marks = marks;
	}
	public Student() 
	{
		System.out.println("object created");
		
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
