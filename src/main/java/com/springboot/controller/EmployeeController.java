package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	public EmployeeService employeeSrevice;

	public EmployeeController(EmployeeService employeeSrevice) {
		super();
		this.employeeSrevice = employeeSrevice;
	}
	//create employee Rest API
	@PostMapping
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeSrevice.saveEmployee(employee), HttpStatus.CREATED);
		
		}
	@GetMapping
	public List<Employee>getAllEmployees(){
		return employeeSrevice.getAllEmployees();
	}
//get by id
	@GetMapping("{id}")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeSrevice.getAllEmployeeById(employeeId), HttpStatus.OK);
	}
	
	
}
