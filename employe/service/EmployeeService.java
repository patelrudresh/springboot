package com.employe.service;

import java.util.List;

import com.employe.model.Employee;

public interface EmployeeService  {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmp();
	
	Employee getbyId(long id);
	
	Employee updateEmp(Employee employe,long id);
	 void daleteemp(long id);
}
