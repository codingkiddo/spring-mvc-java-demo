package com.spring.quickstarts.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
 
	@Autowired
	private JdbcOperations jdbcOperations;
	
	
    public Employee findById(int id) {
    	Employee employee = jdbcOperations.queryForObject("select * from employees where emp_no=?", new Object[] {id}, new EmployeeMapper());
        return employee;
    }
 
//    @Transactional(propagation = Propagation.REQUIRED)
    public Employee saveEmployee(Employee employee) {
    	return null;
    }
 
    @SuppressWarnings("unchecked")
//    @Transactional
    public List<Employee> findAllEmployees() {
    	return null;
    }
 
}