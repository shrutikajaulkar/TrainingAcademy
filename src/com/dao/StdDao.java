package com.dao;
import java.util.List;

import com.modal.Student;

public interface StdDao{
	

	public boolean addStudent(Student student);
	boolean deleteStudent(int stid);
     boolean updateStudent(Student student);
	List<Student> getAllStdDao();

	
}
	


