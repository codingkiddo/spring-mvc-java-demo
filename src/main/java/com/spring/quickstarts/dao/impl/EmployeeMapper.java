package com.spring.quickstarts.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.spring.quickstarts.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>  {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmp_no(rs.getInt("emp_no"));
    	
    	employee.setFirst_name(rs.getString("first_name"));
    	employee.setLast_name(rs.getString("last_name"));
    	employee.setGender(rs.getString("gender").charAt(0));
    	employee.setBirth_date(new Date(rs.getTimestamp("birth_date").getTime()));
    	employee.setHire_date(new Date(rs.getTimestamp("hire_date").getTime()));
		return employee;
	}

}
