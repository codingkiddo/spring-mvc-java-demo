package com.spring.quickstarts.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.spring.quickstarts.dao.EmployeeDao;
import com.spring.quickstarts.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
 
	
//	@Autowired
//	private EntityManagerFactory emf;
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	@PersistenceContext
	private EntityManager em;
	
    @Override
    public void saveEmployee(Employee employee) {
        em.persist(employee);
    }

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(Integer id) {
		return em.find(Employee.class, id);
	}
 
}