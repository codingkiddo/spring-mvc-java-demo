package com.spring.quickstarts.dao;

import java.util.List;

import com.spring.quickstarts.model.Employee;
 
public interface EmployeeDao {
 
    Employee findById(int id);
 
    Employee saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
 
}