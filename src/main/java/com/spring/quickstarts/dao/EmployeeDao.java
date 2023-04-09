package com.spring.quickstarts.dao;

import java.util.List;

import com.spring.quickstarts.model.Employee;
 
public interface EmployeeDao {
 
    List<Employee> findAllEmployees();

    Employee findEmployee(Integer id);
 
    void saveEmployee(Employee employee);
}