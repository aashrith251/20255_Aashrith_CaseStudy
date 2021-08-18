package com.sonata;
import java.util.*;
import java.text.ParseException;
import java.text.*;
import java.util.Date;
public class Test 
{
		@SuppressWarnings("unused")
		public static void main(String[] args) throws ParseException {
			User u = new User();
			Task t = new Task();
			Notification n = new Notification();
			u.setUser_Id(20255);
			u.setUsername("Task Created by");
			u.setContactNumber(7981041442L);
			u.setFirst_Name("Aashrith");
			u.setLast_Name("Reddy");
			u.setRole("Manager");
			u.setEmail("aashrith251@gmail.com");
			System.out.print(u);
			t.setTask_ID(1234);
			t.setOwner_ID(u.getUser_Id());
			t.setCreator_ID(u.getUser_Id());
			t.setName("Microsoft");
			t.setDescription("Frontend");
			t.setStatus(false);
			t.setPriority("First");
			t.setIsBookMarked(true);
			SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
			Date d=f.parse("2021-07-22");
			Date d1=f.parse("2021-08-16");
			t.setCreated_On(d);
			t.setStatus_Changed_On(d1);
			System.out.print(d.compareTo(d1));
			n.setTask_Owner_ID(u.getUser_Id());
			n.setTask_ID(t.getTask_ID());
			n.setStatus_Changed_On(t.getStatus_Changed_On());
			n.setStatus(t.getStatus());
			n.setCreated_On(t.getCreated_On());
			System.out.print(n);
			n.sendNotification(n.getTask_ID(),n.isStatus());
			

		}
}
