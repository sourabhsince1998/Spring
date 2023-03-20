package com.jsp.AutoWiring;

public class Certificate 
{
	private String cName;
	private int cDuration;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcDuration() {
		return cDuration;
	}
	public void setcDuration(int cDuration) {
		this.cDuration = cDuration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Certificate [cName=" + cName + ", cDuration=" + cDuration + "]";
	}

	
	
}
