package com.cg.jdbc_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnect {

	public static void main(String[] args) throws SQLException {
		//1.download mysql j connector download for java
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3307/db_Technoserve";
		String username="root";
		String password="shifa";
		String query="select * from student";
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(query);
			while(r.next())
			{
				String Studentdata="";
				for(int i=1;i<=2;i++)
				{
					Studentdata=Studentdata+" "+r.getString(i);
				}
				System.out.println(Studentdata);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid Username and password");
		}
	}
}