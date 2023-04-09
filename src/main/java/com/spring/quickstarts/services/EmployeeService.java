package com.spring.quickstarts.services;

import java.util.List;

import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.model.EmployeeDTO;

 
public interface EmployeeService {
 
    void saveEmployee(EmployeeDTO employee);
 
    List<Employee> findAllEmployees();
    
    Employee findEmployee(Integer id);
     
}