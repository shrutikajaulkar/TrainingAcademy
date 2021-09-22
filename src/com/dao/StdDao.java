package com.dao;
import java.util.List;

public interface StdDao<Student> {
	int getstdid = 0;
	public boolean add(Student s);
	public boolean delete(int sid);
	public List<Student>getAllStd();
	public Student getStdById(int id);
	public static int addStudent(com.modal.Student s) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void settStdid(int int1) {
		// TODO Auto-generated method stub
		
	}
	public static void setStdnm(String string) {
		// TODO Auto-generated method stub
		
	}
	public int getstdid();
	public String getstdnm();
	List<StdDao> getAllStdDao();
}
	


