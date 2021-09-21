package com.dao;
import java.util.List;

public interface StdDao<Student> {
	public boolean add(Student s);
	public boolean delete(int sid);
	public List<Student>getAllStd();
	public Student getStdById(int id);
	public static int addStudent(com.modal.Student s) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	


