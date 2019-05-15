package com.example.supervisorlogin.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "registraion")
public class SupervisorPojo {

	@Id
	private String email;
	private String password;
	public SupervisorPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SupervisorPojo(String email, String password) {
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
		return "SupervisorPojo [email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}