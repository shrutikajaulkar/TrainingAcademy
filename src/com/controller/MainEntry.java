package com.controller;

import java.util.List;
import java.util.Scanner;

import com.dao.StdDao;
import com.dao.Std_TestDao;
import com.modal.Student;

public class MainEntry {
	
	private static StdDao stddao;

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("*************WELCOME TO TRAINING ACADEMY***************");
			System.out.println("1->add new student");
			System.err.println("2->delete student");
			System.out.println("3->modify student detail");
			System.out.println("4->add marks of student");
			System.out.println("5->update marks of student");
			System.out.println("6->delete results of student");
			System.out.println("7->Exit");
			System.out.println("enter your choice::");
			int  choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter stdid,Stdname,mobile,batchid");
				int sid=sc.nextInt();
				String nm=sc.next();
				int mob=sc.nextInt();
				int batch=sc.nextInt();
				Student s=new Student(sid,nm,mob,batch);
		boolean isinseart =StdDao.addStudent(s);
				if(isinseart)
					System.out.println("your student record added successfully");
				else
					System.out.println("unsuccessful insertion");
				break;
			case 2:
				System.out.println("update record");
				System.out.println("Enter stdid to update");
				int id=sc.nextInt();
				System.out.println("Enter the new stdname");
				String snm=sc.next();
				Std_TestDao ob=new Std_TestDao(id,snm); 
					boolean isupdated=sdao.updateStd_TestDao(ob);
					if(isupdated)
						System.out.println("record updated successfully");
					else
				System.out.println("unsucessful updation");
				break;
			}
	
		(choice==7)
				break;
		} while(true);
		System.out.println("Thanks !");
	}
}
				
			
