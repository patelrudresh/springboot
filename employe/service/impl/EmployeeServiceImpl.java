package com.employe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employe.exception.ResourceNotFoundException;
import com.employe.model.Employee;
import com.employe.repository.EmployeRepository;
import com.employe.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeRepository employeRepository;

	public EmployeeServiceImpl(EmployeRepository employeRepository) {
		this.employeRepository = employeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeRepository.findAll();
	}

	@Override
	public Employee getbyId(long id) {
		// Optional<Employee> employe= employeRepository.findById(id);
//    	if(employe.isPresent()) {
//    		return employe.get();
//    	}else {
//    		throw new ResourceNotFoundException("Employee", "id", id);
//    	}

		return employeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmp(Employee employee, long id) {

		Employee existingemp = employeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		existingemp.setFirstName(employee.getFirstName());
		existingemp.setLastName(employee.getLastName());
		existingemp.setEmail(employee.getEmail());
		employeRepository.save(existingemp);

		return existingemp;
	}
	
	@Override
	public void daleteemp(long id) {
		employeRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));
		 
		employeRepository.deleteById(id);
		 
	}

}
