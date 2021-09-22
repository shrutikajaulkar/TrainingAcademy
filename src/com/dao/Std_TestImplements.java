package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.configuration.DBConnect;

public class Std_TestImplements implements Std_TestDao
{


	@Override
	public boolean addStd_TestDao(Std_TestDao s) {
		// TODO Auto-generated method stub
	try 
		(Connection con=DBConnect.getConnection();
			PreparedStatement pst=con.prepareStatement("insertinto Std_TestDao values (?,?)"))
		{
		pst.setInt(1, s.getStd_TestDaoid());
		pst.setString(2, s.getStd_TestDaoname());
		pst.executeUpdate();
		return true;
		} 
	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public boolean deleteStd_TestDao(int id) {
		try 
		(Connection con=DBConnect.getConnection();
			PreparedStatement pst=con.prepareStatement("insertinto Std_TestDao values (?,?)"))
		{
			pst.setInt(1, id);
			pst.executeUpdate();
			return true;
		}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
		{
			
	
		

	}

	@Override
	public boolean updateStd_TestDao(Std_TestDao s) {
		try 
		(Connection con=DBConnect.getConnection();
			PreparedStatement pst=con.prepareStatement("insertinto Std_TestDao values (?,?)"))
		{
			pst.setString(1, s.getStd_TestDaoname());
			pst.setInt(2, s.getStd_TestDaoid());
			pst.executeUpdate();
			return true;
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Std_TestDao> getAllStd_TestDao() {
		ArrayList<Std_TestDao>Std_TestDaolist=new ArrayList<>();
		return null;
	}

	@Override
	public int getStd_TestDaoid() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStd_TestDao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStd_TestDaoname() {
		// TODO Auto-generated method stub
		return null;
	}

}
