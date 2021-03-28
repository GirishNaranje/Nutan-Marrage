package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="admins")


public class Admin extends BaseEntity {
	@Column(length=40,unique=true)
	@NotBlank(message = "Email must be supplied")
	@Email(message = "Invalid email format")
    private String email;
	@Column(length=20,nullable=false)
    private String password;
	
public Admin() {
	System.out.println("in ctor of "+getClass().getName());
}
public Admin(String email, String password) {
	super();
	this.email = email;
	this.password = password;
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
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Admin [ email=" + email + ", getId()=" + getId();
}

}
