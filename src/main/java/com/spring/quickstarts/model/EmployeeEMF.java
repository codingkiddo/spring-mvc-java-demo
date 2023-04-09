package com.spring.quickstarts.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_emf")
public class EmployeeEMF {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "first_name", nullable = false)
	private String first_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first_name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEMF other = (EmployeeEMF) obj;
		return Objects.equals(first_name, other.first_name) && id == other.id;
	}

	@Override
	public String toString() {
		return "EmployeeEMF [id=" + id + ", first_name=" + first_name + "]";
	}
	
}
