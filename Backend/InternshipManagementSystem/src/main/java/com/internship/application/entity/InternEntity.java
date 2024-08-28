package com.internship.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="INTERN_DETAILS")
public class InternEntity {
	
	@Id
	@Column(name="INTERN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int internId;
	
	@Column(name="INTERN_NAME")
	private String name;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="SALARY")
	private String salary;
	
	@Column(name="EMAIL_ADDRESS")
	private String email;

	public int getInternId() {
		return internId;
	}

	public void setInternId(int internId) {
		this.internId = internId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "InternEntity [internId=" + internId + ", name=" + name + ", city=" + city + ", salary=" + salary
				+ ", email=" + email + "]";
	}

	public InternEntity(int internId, String name, String city, String salary, String email) {
		super();
		this.internId = internId;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.email = email;
	}

	public InternEntity() {
		super();
	}
}
