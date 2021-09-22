package com.dao;
import java.util.List;

public interface StdDao<Student> {
	
	public boolean add(Student stddao);
	public boolean delete(int sid);
	public List<Student>getAllStd();
	public Student getStdById(int id);
	boolean updateStudent(com.modal.Student s);
	public int getstdid();
	public String getstdnm();
	public boolean deleteStudent(int stid);
	boolean addStudent(com.modal.Student s);
	boolean updateStudent1(com.modal.Student s);
	List<com.modal.Student> getAllStdDao();
	boolean updateStdDao(StdDao s);

	
}
	


