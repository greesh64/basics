package com.springboot.service;

import com.springboot.model.Employee;
import java.util.List;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee>getAllEmployees();
	Employee getAllEmployeeById(long id);
	

}
