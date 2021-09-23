package com.dao;
import java.util.List;

import com.modal.Student;

public interface StdDao{
	

	public boolean addStudent(Student s);
	boolean deleteStudent(int stid);
     boolean updateStudent(Student s);
	List<Student> getAllStdDao();

	
}
	


