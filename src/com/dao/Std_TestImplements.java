package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.configuration.DBConnect;
import com.modal.Stud_Test;
import com.modal.Student;
import com.modal.Test;


public class Std_TestImplements implements Std_TestDao {
	
	

		@Override
		public boolean addTestMarks(Stud_Test o) {
			
			try(Connection connection = DBConnect.getConnection();
					PreparedStatement pst = connection.prepareStatement("insert into student_test values(?,?,?)"))
			{
				pst.setInt(1, o.getStdid());
				pst.setInt(2, o.getTestid());
				pst.setInt(3, o.getTestmarks());
				
				pst.executeUpdate();
				System.out.println("Data sucessfully added");
			} catch (SQLException e) {

				System.out.println("Add only sufficient data");
				e.printStackTrace();
			}

			return false;
		}

		@Override
		public boolean deleteTestResult(int id) {
			 try {
				 try(Connection connection = DBConnect.getConnection();
				 PreparedStatement pst = connection.prepareStatement("delete from student_test where studid=?"))
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
		public boolean updateTestMarks(Stud_Test o) {
			try {
		    	Connection connection = DBConnect.getConnection();
		        PreparedStatement pst = connection.prepareStatement("UPDATE student_test SET testmarks=? WHERE studid=? and testid=?");
		       
		        pst.setInt(1, o.getTestmarks());
				pst.setInt(2,o.getStdid());
				pst.setInt(3, o.getTestid());
				 int recordUpdate = pst.executeUpdate();
			     if(recordUpdate > 0)
			    	 return true;
			    
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
				return false;
		}

		

		
		 public List<Stud_Test> getAllStud_Test1() {
			try(Connection connection= DBConnect.getConnection();
					PreparedStatement pst = connection.prepareStatement("select * from student_test"))
			{
				ArrayList<Stud_Test> studentTestlist = new ArrayList<>();
				ResultSet rest = pst.executeQuery();
				
				while(rest.next())
				{
					Stud_Test test = new Stud_Test();
					test.setStdid(rest.getInt(1));
					test.setTestid(rest.getInt(2));
				    test.setTestmarks(rest.getInt(3));
			         studentTestlist.add(test);
					
					}
				return studentTestlist;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
			return null;
		}

		@Override
		public List<Stud_Test> getAllStud_Test() {
			// TODO Auto-generated method stub
			return null;
		}

		}

		



