package com.controller;

import java.util.Scanner;

import com.dao.StdDao;
import com.dao.StdDaoImplements;
import com.dao.Std_TestDao;
import com.dao.Std_TestImplements;
import com.modal.Student;

public class MainEntry {
	

	public static void main(String[] args)
	{ 
		
Scanner sc = new Scanner(System.in);
	StdDao stddao=new StdDaoImplements();
	Std_TestDao stest=new Std_TestImplements();
			do
			{
	System.out.println("***********************************************");
	System.out.println("     WElCOME TO ThinkQuotient  Training Academy ");
	System.out.println("***********************************************");
			System.out.println("1->Add new student.");
			System.out.println("2->Delete student.");
			System.out.println("3->Modify student detail.");
			System.out.println("4->Add marks of student.");
			System.out.println("5->Update marks of student.");
			System.out.println("6->Delete results of student.");
			System.out.println("7->Exit");
			System.out.println("Enter your choice---");
			int  choice=sc.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println("Enter stdid,Stdname,mobile,batchid");
				int sid=sc.nextInt();
				String nm=sc.next();
				long mob=sc.nextLong();
				int batch=sc.nextInt();
				Student s1=new Student(nm,mob,batch,sid);
				boolean isinsert=stddao.addStudent(s1);
				if(isinsert)
					System.out.println("your student record added successfully");
				else
					System.out.println("unsuccessful insertion");
				break;
			case 2:
				System.out.println("Enter student id to delete");
				int stid=sc.nextInt();
				boolean isdelete = (stddao.deleteStudent(stid));
					System.out.println("Record  data is deleted");
					break;
			case 3:
				System.out.println("Modification");
				System.out.println("Enter student id to update");
				int id = sc.nextInt();
				System.out.println("Enter name to update");
				String sname = sc.next();
				System.out.println("Enter mobile no to update");
				long mobile = sc.nextLong();
				System.out.println("Enter batch id to update");
				int bid = sc.nextInt();
				Student stu = new Student(sname,mobile,bid,id);
				
				boolean isupdated = stddao.updateStudent(stu);
				if(isupdated)
					System.out.println("Record update successfully");
				else
					System.out.println("Unsuccessful Modification");
				break;
			}	
		  if(choice==7)
				break;
		} 
		while(true);
		System.out.println("Thanks For visiting");
	}
}


