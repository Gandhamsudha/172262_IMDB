package com.sts.pojo;

public class RegistrationPojo {
    String Username;
    String  Password;
	public RegistrationPojo(String username, String password) {
		super();
		Username = username;
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "RegistrationPojo [Username=" + Username + ", Password=" + Password + "]";
	}
    
}
