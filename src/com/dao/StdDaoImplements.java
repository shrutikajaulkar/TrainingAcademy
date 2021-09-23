package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.configuration.DBConnect;
import com.modal.Student;


public class StdDaoImplements implements StdDao {


	public boolean addStudent(Student s) {
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement pst = connection.prepareStatement("insert into student values(?,?,?,?)"))
		{
			pst.setInt(1, s.getStdid());
			pst.setString(2, s.getNm());
			pst.setLong(3, s.getMobile());
	        pst.setInt(4, s. getBatchid());
			
			pst.executeUpdate();
			System.out.println("Your All Data Added Sucessfully.");
		} catch (SQLException e) {

			System.out.println("Please Add only sufficient Data!");
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		 try {
			 try(Connection connection = DBConnect.getConnection();
			 PreparedStatement pst = connection.prepareStatement("delete from student where stdid=?"))
		       {
				 pst.setInt(1, id);
				 pst.executeUpdate();
		    return true;
		      }
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		try {
	    	Connection connection = DBConnect.getConnection();
	        PreparedStatement pst = connection.prepareStatement("UPDATE student SET student_name=?, mobile=?, batch_id=? WHERE student_id=?");
	       
			pst.setString(1, s.getNm());
			pst.setLong(2, s.getMobile());
	        pst.setInt(3, s. getBatchid());
	        pst.setInt(4, s.getStdid());
	       int recordUpdate = pst.executeUpdate();
	     if(recordUpdate > 0)
	    	 return true;
	    
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
		return false;
	}


	@Override
	public List<Student> getAllStdDao() {
		try(Connection connection= DBConnect.getConnection();
				PreparedStatement pst = connection.prepareStatement("select * from student"))
		{
			ArrayList<Student> studentlist = new ArrayList<>();
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				Student s = new Student();
				s.setStdid(rs.getInt(1));
				s.setNm(rs.getString(2));
				s.setMobile(rs.getInt(3));
				s.setBatchid(rs.getInt(4));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return null;
	}

	

	

}
