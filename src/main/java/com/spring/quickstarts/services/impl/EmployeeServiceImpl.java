package com.spring.quickstarts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.model.EmployeeDTO;
import com.spring.quickstarts.repository.EmployeeRepository;
import com.spring.quickstarts.services.EmployeeService;
 
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
//    @Autowired
//    private EmployeeDao dao;
     
	@Autowired
	private EmployeeRepository employeeRepository;
	
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
 
    public Employee findEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }

	@Override
	public void saveEmployee(EmployeeDTO employee) {
		
	}
    
}