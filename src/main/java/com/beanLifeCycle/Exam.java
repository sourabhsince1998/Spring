package com.beanLifeCycle;

public class Exam 
{
	private String subjectName;
	private double subjectDuration;
	
	
	public String getSubjectName() {
		
		return subjectName;
	}
	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
		System.out.println("Property Initialized");
	}
	public double getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectDuration(double subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	
	public void init55()
	{
		System.out.println("Exam started");
	}
	public void destroy55() {
		System.out.println("Exam ended...!!");
	}
	@Override
	public String toString() {
		return "Exam [subjectName=" + subjectName + ", subjectDuration=" + subjectDuration + "]";
	}
	

	
}
