package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo2 {
	
	public static Connection createCon() throws ClassNotFoundException, SQLException
	{
		Connection con = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pranav");
		
		Statement stmt =con.createStatement();
		//stmt.execute("create table student1 (roll int, name varchar(20))");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no. of student records want to insert: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("enter roll: ");
			int roll = sc.nextInt();
			System.out.println("enter name: ");
			String name = sc.next();
			stmt.execute("insert into student1 values("+roll+",'"+name+"')");
			System.out.println("value inserted succesfully...");
			System.out.println("------------------------------------------");
		}
		
		ResultSet result = stmt.executeQuery("select*from student1");
		
		while(result.next())
		{
			int new_roll=result.getInt(1);
			String new_name=result.getString(2);
			
			System.out.println("Student roll= "+new_roll+" name= "+new_name);
			System.out.println("------------------------------------------");
		}
		
		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		createCon();

	}

}
