package com.sunbeam.beans;

import java.sql.Date;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

public class RegisterBean {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String birth;
	private int status=0;
	private String role = "voter";
	
	public RegisterBean() {
		
	}
	
	public RegisterBean(String firstName, String lastName, String email, String password, String birth, int status,
			String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.status = status;
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}


	
	public int register() {
		
		Date db = Date.valueOf(this.birth);
		User usr = new User(0,this.firstName, this.lastName, this.email, this.password, db, this.status, this.role);
		
		try(UserDao userdao = new UserDaoImpl()) {
			
			return userdao.save(usr);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}
	

	
	
	
	
	
	

}
