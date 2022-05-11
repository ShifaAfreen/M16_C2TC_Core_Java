package com.cg.jdbc.crud;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class CRUDeleteDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3307/db_Technoserve";
		String username="root";
		String password="shifa";
		try {
		Connection con=DriverManager.getConnection(dbURL, username, password);
		String sql="delete from Employee22 where name='hritik'";
		PreparedStatement s=con.prepareStatement(sql);
		int rows=s.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("A new User information deleted successfully");
		}
		con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}


	}

}
