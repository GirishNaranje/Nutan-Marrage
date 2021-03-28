package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="users")
public class User extends BaseEntity {
	@Column(length=20)
	private String name;
	@Column(length=40,unique=true)
	@NotBlank(message = "Email must be supplied")
	@Email(message = "Invalid email format")
	private String email;
	@Column(length=10)
	private String password;
	@Column(length=10)
	@NotBlank(message = "Mobile Number must be supplied")
	private String mobile_no;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String street;
	@Column(length=20)
	private String landmark;
	
	

	public User() {
		System.out.println("in ctor of "+getClass().getName());
	}

	

	public User(String name, String email, String password, String mobile_no, String city, String street,
			String landmark) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile_no = mobile_no;
		this.city = city;
		this.street = street;
		this.landmark = landmark;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	

	

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobile_no=" + mobile_no + ", getId()=" + getId() + "]";
	}
	
	

}
