package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService 
{
	Employee saveEmplyoee(Employee emplyoee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeebyId(long id);
	
	Employee updateEmployee(Employee employee,long id);

	void deleteEmployee(long id);
}
