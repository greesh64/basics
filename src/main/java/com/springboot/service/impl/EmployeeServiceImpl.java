package com.springboot.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.exception.ResouceNotFOundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
private EmployeeRepository employeeRepository;
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	//build create employee REST API
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public Employee getAllEmployeeById(long id) {
	Optional<Employee> employee=employeeRepository.findById(id);
	if(employee.isPresent()) {
		return employee.get();
	}else {
		throw new ResouceNotFOundException("Employee", "Id", id);
	}
	}
	
	

}
