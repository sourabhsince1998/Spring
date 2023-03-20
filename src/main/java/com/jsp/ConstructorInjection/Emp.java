package com.jsp.ConstructorInjection;

public class Emp
{
	private String eName;
	private int eId;
	private double eSal;
	
	private Dept d;
	
	public Emp(String eName, int eId, double eSal,Dept d) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSal = eSal;
		this.d=d;
	}

	@Override
	public String toString() {
		return "Emp [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + ", d=" + d + "]";
	}

	
	
	
	

}
