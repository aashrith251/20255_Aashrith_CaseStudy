package com.sonata.Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Login {
		@Id
		long userId;
		String password;
		Login()
		{
			
		}
		public Login(long userId, String password) {
			super();
			this.userId = userId;
			this.password = password;
		}
		public long getuserId() {
			return userId;
		}
		public void setuserId(long userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Login [userId=" + userId + ", password=" + password + "]";
		}
		
		
}
