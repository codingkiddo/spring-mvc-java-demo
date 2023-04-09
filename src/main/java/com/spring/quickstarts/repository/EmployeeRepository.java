package com.spring.quickstarts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quickstarts.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
