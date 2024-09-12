package com.jdbc.day3.preparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo3 {

	public static Connection getConn() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pranav");
		
//		PreparedStatement ps = con.prepareStatement("create table student2 (roll int, name varchar(20))");
//		ps.execute();
		
		ResultSet result=null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do u want to insert records?(yes/no): ");
		String inp=sc.next();
		if(inp.equalsIgnoreCase("yes"))
		{
			System.out.println("enter the no. of student records want to insert: ");
			int n = sc.nextInt();
			for(int i=0; i<n; i++)
			{
				System.out.println("enter roll: ");
				int roll = sc.nextInt();
				System.out.println("enter name: ");
				String name = sc.next();
				PreparedStatement ps1=con.prepareStatement("insert into student2 values(?,?)");
				ps1.setInt(1, roll);
				ps1.setString(2, name);
				ps1.execute();
				System.out.println("value inserted succesfully...");
				System.out.println("------------------------------------------");
			}
		}
		
		System.out.println("display all records? (YES/NO) : ");
		String input = sc.next();
		if(input.equalsIgnoreCase("YES"))
		{
			PreparedStatement ps2 = con.prepareStatement("select*from student2");
			result = ps2.executeQuery();
			
			while(result.next())
			{
				int new_roll=result.getInt(1);
				String new_name=result.getString(2);
				
				System.out.println("Student roll= "+new_roll+" name= "+new_name);
				System.out.println("------------------------------------------");
			}
		}
		else
		{
			try 
			{
				System.out.println("enter the roll no. of student: ");
				int Roll=sc.nextInt();
				PreparedStatement ps3 = con.prepareStatement("select*from student2 where roll="+Roll+"");
				result = ps3.executeQuery();
				while(result.next())
				{
					int new_roll=result.getInt(1);
					String new_name=result.getString(2);
					
					System.out.println("Student roll= "+new_roll+" name= "+new_name);
					System.out.println("------------------------------------------");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			
		return con;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConn();
	}

}
