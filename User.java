package com.sonata;
import java.util.*;
public class User 
{
	    int User_Id;
		String Username;
		String Email;
		String First_Name;
		String Last_Name;
		long ContactNumber;
		String Role;
		boolean isActive;
		Date DOB;
		Date Created_On;	
		public int getUser_Id() {
			return User_Id;
		}
		public void setUser_Id(int user_Id) {
			User_Id = user_Id;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getFirst_Name() {
			return First_Name;
		}
		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}
		public String getLast_Name() {
			return Last_Name;
		}
		public void setLast_Name(String last_Name) {
			Last_Name = last_Name;
		}
		public Long getContactNumber() {
			return ContactNumber;
		}
		public void setContactNumber(long contactNumber) {
			ContactNumber = contactNumber;
		}
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
		public Boolean getIsActive() {
			return isActive;
		}
		public void setIsActive(boolean isActive) {
			this.isActive = isActive;
		}
		public Date getDOB() {
			return DOB;
		}
		public void setDOB(Date dOB) {
			DOB = dOB;
		}
		public Date getCreated_On() {
			return Created_On;
		}
		public void setCreate_On(Date created_On) {
			Created_On = created_On;
		}
		@Override
		public String toString() {
			return "User [User_Id=" + User_Id + ", Username=" + Username + ", Email=" + Email + ", First_Name="
					+ First_Name + ", Last_Name=" + Last_Name + ", ContactNumber=" + ContactNumber + ", Role=" + Role
					+ ", isActive=" + isActive + ", DOB=" + DOB + ", Created_On=" + Created_On + "]";
		}
}
