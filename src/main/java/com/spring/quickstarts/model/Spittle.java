package com.spring.quickstarts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "spitter")
	private Spitter spitter;

	@Column
	private String message;

	@Column(name = "created_at")
	private Date createdAt;

	@Column
	private Double latitude;

	@Column
	private Double longitude;

	public Spittle(String message, Date createdAt) {
		this(null, message, createdAt, null, null);
	}

	public Spittle(Long id, String message, Date createdAt, Double longitude, Double latitude) {
		this.id = id;
		this.message = message;
		this.createdAt = createdAt;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Spittle(Long id, Spitter spitter, String message, Date createdAt, Double longitude, Double latitude) {
		this.id = id;
		this.spitter  = spitter;
		this.message = message;
		this.createdAt = createdAt;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Spitter getSpitter() {
		return spitter;
	}

	public void setSpitter(Spitter spitter) {
		this.spitter = spitter;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "createdAt");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "createdAt");
	}

}
