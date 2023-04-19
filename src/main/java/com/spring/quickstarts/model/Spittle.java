package com.spring.quickstarts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "spittle")
public class Spittle {
	
	@Id
	@GeneratedValue
	private  Long id;
	@Column
	private  String message;
	@Column
	private  Date postedTime;
	@ManyToOne
	private Spitter spitter;

	public Spittle() {
	}
	
	public Spittle(Long id, String message, Date postedTime, Spitter spitter) {
		this.id = id;
		this.message = message;
		this.postedTime = postedTime;
		this.spitter = spitter;
	}

	public Spitter getSpitter() {
		return spitter;
	}

	public void setSpitter(Spitter spitter) {
		this.spitter = spitter;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getPostedTime() {
		return postedTime;
	}

}