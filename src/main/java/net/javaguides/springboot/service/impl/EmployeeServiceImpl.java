package net.javaguides.springboot.service.impl;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService

{
	private EmployeeRepository employeeRepository;

	 
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		super();
		this.employeeRepository = employeeRepository;
	}




	@Override
	public Employee saveEmplyoee(Employee employee) {
		
		return employeeRepository.save(employee);
	}




	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}




	@Override
	public Employee getEmployeebyId(long id) {
//		Optional<Employee>  employee=employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}
//		else {
//		throw new ResourceNotFoundException("Employee","Id",id);
			
//	}
		
		return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
	}




	@Override
	public Employee updateEmployee(Employee employee, long id) {
	   
		//we need to check whether employee with given id is exist in db or NOT
		
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(
				
				()-> new ResourceNotFoundException("Employee","Id",id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		
		existingEmployee.setLastName(employee.getLastName());
		
		existingEmployee.setEmail(employee.getEmail());
		
		//save exsiting employee to db
		
		employeeRepository.save(existingEmployee);
		
		
		
		return existingEmployee;
	}




	@Override
	public void deleteEmployee(long id) {
		
		
		//check whether employeee exists in Db or not
		
		employeeRepository.findById(id).orElseThrow(()->
		                                              new ResourceNotFoundException("Employee","Id",id));
		
		employeeRepository.deleteById(id);
		
	}

}










