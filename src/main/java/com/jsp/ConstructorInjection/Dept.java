package com.jsp.ConstructorInjection;

public class Dept {
 private String dname;

public Dept(String dname) {
	super();
	this.dname = dname;
}



@Override
public String toString() {
	return "Dept [dname=" + dname + "]";
}
 
}
