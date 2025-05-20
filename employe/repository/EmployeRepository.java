package com.employe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employe.model.Employee;


public interface EmployeRepository extends JpaRepository<Employee, Long> {

}
