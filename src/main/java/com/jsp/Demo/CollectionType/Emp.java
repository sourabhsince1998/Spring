package com.jsp.Demo.CollectionType;

import java.util.*;

public class Emp 
{
	private List<String> vehicle;
	 private Set<String> email;
	 private Map<String,String> name;
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
		return "Emp [vahicle=" + vehicle + ", email=" + email + ", name=" + name + "]";
	}
	 
	 
	 
	

}
