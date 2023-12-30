package com.spring.quickstarts.repository;

import java.util.List;

import com.spring.quickstarts.model.Employee;

public interface EmployeeRepository {

	long count();

	Employee save(Employee employee);

	Employee findEmployee(int id);

	Employee findByFirstName(String firstName);

	List<Employee> findAllEmployees();
}
