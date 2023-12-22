package com.spring.quickstarts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.model.EmployeeDTO;
import com.spring.quickstarts.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    EmployeeService service;
     
    /*
     * This method will list all existing employees.
     */
    @GetMapping(value =  { "/", "/list" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> listEmployees() {
        List<Employee> employees = service.findAllEmployees();
        return ResponseEntity.ok(employees);
    }
    
    /*
     * This method will list all existing employees.
     */
    @GetMapping(value =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> findEmployee(@PathVariable Integer id) {
    	Employee employee = service.findEmployee(id);
        return ResponseEntity.ok(employee);
    }
 
    
    @ExceptionHandler(InvalidDataAccessResourceUsageException.class)
    public String handleInvalidDataAccessResourceUsageException(InvalidDataAccessResourceUsageException ex) {
    	return ex.getMessage();
    }
 
//    /*
//     * This method will be called on form submission, handling POST request for
//     * saving employee in database. It also validates the user input
//     */
    @PostMapping(value = { "/new" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveEmployee(@RequestBody EmployeeDTO employee) {
        service.saveEmployee(employee);
        return "success";
    }
}
