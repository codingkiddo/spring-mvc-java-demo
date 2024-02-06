package com.spring.quickstarts.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.repository.EmployeeRepository;
import com.spring.quickstarts.services.EmployeeService;

@Service("EmployeeServiceRepoImpl")
@Transactional
public class EmployeeServiceRepoImpl implements EmployeeService {

//	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee findById(int id) {
		return employeeRepository.findEmployee(id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAllEmployees();
	}

	@Override
	public long count() {
		return employeeRepository.count();
	}

	@Override
	public Employee findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

}
