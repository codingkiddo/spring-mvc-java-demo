package com.spring.quickstarts.services;

import java.util.List;

import com.spring.quickstarts.model.Employee;

 
public interface EmployeeService {
 
    Employee findById(int id);
     
    Employee saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees(); 
     
    long count();

	Employee findByFirstName(String firstName);

}