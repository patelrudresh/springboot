package com.employe.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.employe.model.Employee;
import com.employe.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmpController {

    private final EmployeeService employeeService;

    public EmpController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmp() {
        return employeeService.getAllEmp();
    }

    @PostMapping("/api")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Employee> GetbyId(@PathVariable("id") long employeeid){
    	return new  ResponseEntity<Employee>(employeeService.getbyId(employeeid),HttpStatus.OK);
    }
    
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateemp(@PathVariable("id") long id,@RequestBody Employee employee){
    	return new ResponseEntity<Employee>(employeeService.updateEmp(employee, id),HttpStatus.OK);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteempee(@PathVariable("id") long id){
    	employeeService.daleteemp(id);
    	return new ResponseEntity<String>("delete",HttpStatus.OK);
    }
    
}
