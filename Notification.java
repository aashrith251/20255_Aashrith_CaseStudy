package com.sonata;
import java.util.*;
public class Notification 
{
		int Task_ID;
		int Task_Owner_ID;
		boolean Status;
		Date Created_On;
		Date Status_Changed_On;
		
		public void sendNotification(int Task_ID,boolean Status) {
			if(Status == true)
			{
				System.out.println(Task_ID + "is completed");
			}
			else 
			{
				System.out.println(Task_ID + "is not xcompleted");
			}
		}
		
		public int getTask_ID() {
			return Task_ID;
		}

		public void setTask_ID(int task_ID) {
			Task_ID = task_ID;
		}

		public int getTask_Owner_ID() {
			return Task_Owner_ID;
		}

		public void setTask_Owner_ID(int task_Owner_ID) {
			Task_Owner_ID = task_Owner_ID;
		}

		public boolean isStatus() {
			return Status;
		}

		public void setStatus(boolean status) {
			Status = status;
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
			return "Notification [Task_ID=" + Task_ID + ", Task_Owner_ID=" + Task_Owner_ID + ", Status=" + Status
					+ ", Created_On=" + Created_On + ", Status_Changed_On=" + Status_Changed_On + "]";
		}
}
