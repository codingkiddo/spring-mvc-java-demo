package com.spring.quickstarts.controllers;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private EmployeeService service;
	
	@Autowired
	private DataSource dataSource;
	 /*
     * This method will return employee by id.
     */
    @RequestMapping(value = { "/{id}" }, method = RequestMethod.GET)
    public Employee listEmployees(@PathVariable int id) {
        Employee employee = service.findById(id);
        return employee;
    }
	
    @RequestMapping(value = { "/profile" }, method = RequestMethod.GET)
    public DataSource getProfileType() {
        return dataSource;
    }
}
