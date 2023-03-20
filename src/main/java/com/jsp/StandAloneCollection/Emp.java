package com.jsp.StandAloneCollection;

import java.util.*;

public class Emp 
{
	private List<String> vehicle;
	 private Set<String> email;
	 private Map<String,String> name;
	 private Properties dbprop;
	 
	public Properties getDbprop() {
		return dbprop;
	}
	public void setDbprop(Properties dbprop) {
		this.dbprop = dbprop;
	}
	public List<String> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<String> vehicle) {
		this.vehicle = vehicle;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [vehicle=" + vehicle + ", email=" + email + ", name=" + name + ", dbprop=" + dbprop + "]";
	}
	 
	 
	 
	

}
