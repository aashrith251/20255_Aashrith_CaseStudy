package com.sonata;
import java.util.*;


public class Task 
{
	    int Task_ID;
		int Owner_ID;
		int Creator_ID;
		String Name;
		String Description;
		boolean Status;
		String Priority;
		String Notes;
		Boolean IsBookMarked;
		Date Created_On;
		Date Status_Changed_On;
		
		
		public void displayTask() {
			System.out.println(Owner_ID);
			System.out.println(Creator_ID);
			System.out.println(Name);
			System.out.println(Description);
			System.out.println(Status);
			System.out.println(Priority);
			System.out.println(Notes);
			System.out.println(IsBookMarked);
			System.out.println(Created_On);
			System.out.println(Status_Changed_On);
		}
		public int getTask_ID() {
			return Task_ID;
		}

		public void setTask_ID(int task_ID) {
			Task_ID = task_ID;
		}
		
		public int getOwner_ID() {
			return Owner_ID;
		}
		public void setOwner_ID(int owner_ID) {
			Owner_ID = owner_ID;
		}
		public int getCreator_ID() {
			return Creator_ID;
		}
		public void setCreator_ID(int creator_ID) {
			Creator_ID = creator_ID;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public boolean getStatus() {
			return Status;
		}
		public void setStatus(boolean status) {
			Status = status;
		}
		public String getPriority() {
			return Priority;
		}
		public void setPriority(String priority) {
			Priority = priority;
		}
		public String getNotes() {
			return Notes;
		}
		public void setNotes(String notes) {
			Notes = notes;
		}
		public Boolean getIsBookMarked() {
			return IsBookMarked;
		}
		public void setIsBookMarked(Boolean isBookMarked) {
			IsBookMarked = isBookMarked;
		}
		public Date getCreated_On() {
			return Created_On;
		}
		public void setCreated_On(Date created_On) {
			Created_On = created_On;
		}
		public Date getStatus_Changed_On() {
			return Status_Changed_On;
		}
		public void setStatus_Changed_On(Date status_Changed_On) {
			Status_Changed_On = status_Changed_On;
		}
		@Override
		public String toString() {
			return "Task [Task_ID=" + Task_ID + ", Owner_ID=" + Owner_ID + ", Creator_ID=" + Creator_ID + ", Name="
					+ Name + ", Description=" + Description + ", Status=" + Status + ", Priority=" + Priority
					+ ", Notes=" + Notes + ", IsBookMarked=" + IsBookMarked + ", Created_On=" + Created_On
					+ ", Status_Changed_On=" + Status_Changed_On + "]";
		}

}
