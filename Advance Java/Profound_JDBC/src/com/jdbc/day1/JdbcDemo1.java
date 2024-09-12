package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDemo1 {

	public static Connection createConn() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		ResultSet rs =null;
		int roll=0;
		String name=null, city=null;
		//register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create a connection obj
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pranav");
		System.out.println("Connection created succesfully!!!!");
		
		//create the statement obj
		Statement stmt =con.createStatement();
		
		//execute the query
//		stmt.execute("create table student (roll int, name varchar(20), city char(20))");
//		System.out.println("Table created...");
		
//		stmt.execute("insert into student values(1,'pranav','nashik')");
//		System.out.println("value inserted succesfully...");
		
		rs = stmt.executeQuery("select*from student where roll=1");
		
		while(rs.next())
		{
			roll=rs.getInt(1);
			name=rs.getString(2);
			city=rs.getString(3);
		}
		System.out.println("Student roll= "+roll+" name= "+name+" city= "+city);
		
		//close the connection
		con.close();
		return con;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		createConn();

	}

}
