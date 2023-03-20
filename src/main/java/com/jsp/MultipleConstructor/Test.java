package com.jsp.MultipleConstructor;

public class Test 
{
	private int x;
	private int y;
	
	public Test(double x,double y)
	{
		this.x=(int)x;
		this.y=(int)y;
		
		System.out.println("contstructor double:double");

		}
	public Test(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("contstructor int;int ");
		}
	
	public Test(String x,String y)
	{
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("contstructor string:string ");
		}
	public void add() {
		System.out.println("value of x is "+this.x);
		System.out.println("value of y is "+this.y);
		System.out.println(" Result is "+(this.x+this.y));
		
	}
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	
	

	

}
