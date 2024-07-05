package com.sunbeam.beans;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sunbeam.daos.*;
import com.sunbeam.pojos.User;



public class LoginBean {
	private String email;
	private String password;
	private User user;
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	public LoginBean(String email, String password) {
		
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
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		try (UserDao userdao = new UserDaoImpl()) {
			this.user = userdao.validate(email, password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
