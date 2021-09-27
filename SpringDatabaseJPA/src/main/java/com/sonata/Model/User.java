package com.sonata.Model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	long userId;
	String userName;
	String email;
	long contactNumber;
	String role;
	boolean isAlive; 
	Date dob;
	Date createdOn;
	String password;
	User()
	{
		
	}
	public User(long userId, String userName, String email, long contactNumber, String role, Boolean isAlive, Date dob,
			Date createdOn) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.role = role;
		this.isAlive = isAlive;
		this.dob = dob;
		this.createdOn = createdOn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", role=" + role + ", isAlive=" + isAlive + ", dob=" + dob + ", createdOn="
				+ createdOn + ", password=" + password + "]";
	}
	
	
}

