package com.cg.jdbc.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CrudDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3307/db_Technoserve";
		String username="root";
		String password="shifa";
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(1);
				String password1=r.getString(2);
				String email=r.getString(3);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email));
			}
				con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}

}
}