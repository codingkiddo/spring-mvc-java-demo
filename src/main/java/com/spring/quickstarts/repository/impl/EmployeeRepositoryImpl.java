package com.spring.quickstarts.repository.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.quickstarts.model.Employee;
import com.spring.quickstarts.repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long count() {
		return findAllEmployees().size();
	}

	@Override
	public Employee save(Employee employee) {
		Serializable id = sessionFactory.getCurrentSession().save(employee);
		
		return new Employee( (Integer) id, 
				employee.getBirth_date(), 
				employee.getFirst_name(), 
				employee.getLast_name(), 
				employee.getHire_date(), 
				employee.getGender());
	}

	@Override
	public Employee findEmployee(int id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public Employee findByFirstName(String firstName) {
		return (Employee) sessionFactory.getCurrentSession()
				.createCriteria(Employee.class).add(Restrictions.eq("firstName", firstName))
				.list().get(0);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

}
