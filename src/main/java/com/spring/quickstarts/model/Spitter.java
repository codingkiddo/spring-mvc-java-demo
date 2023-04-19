package com.spring.quickstarts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spitter")
public class Spitter {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String fullName;
	@Column
	private String email;
	@Column
	private boolean updateByEmail;
	@Column
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Spitter() {
	}
	
	public Spitter(Long id, String username, String password, 
			String fullName, String email, boolean updateByEmail, String status) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.updateByEmail = updateByEmail;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isUpdateByEmail() {
		return updateByEmail;
	}

	public void setUpdateByEmail(boolean updateByEmail) {
		this.updateByEmail = updateByEmail;
	}

}
