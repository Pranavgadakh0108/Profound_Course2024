package com.jdbc.day4.preparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo4 {
	
	public static Connection createCon()
	{
		Connection con =null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pranav");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	static void getSingleData()
	{
		try 
		{
			Connection con =JdbcDemo4.createCon();
			int roll=0;
			String name=null;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter roll: ");
			roll=sc.nextInt();
				PreparedStatement ps = con.prepareStatement("select * from student2 where roll=?");
				ps.setInt(1, roll);
				ResultSet result = ps.executeQuery();
				while(result.next())
				{
					roll=result.getInt(1);
					name=result.getString(2);
					System.out.println("Roll: "+roll+" Name: "+name);
				}
				con.close();
		} catch (SQLException e) 
		{
			System.out.println(e);
		}
		
	}
	
	static void getMultipleData()
	{
		try 
		{
			Connection con =JdbcDemo4.createCon();
			int roll=0;
			String name=null;
				PreparedStatement ps = con.prepareStatement("select * from student2");
				ResultSet result = ps.executeQuery();
				System.out.println("--->> Student Records <<---");
				System.out.println("\tRoll"+"\tName");
				while(result.next())
				{
					roll=result.getInt(1);
					name=result.getString(2);
					System.out.println("\t"+roll+"\t"+name);
				}
				//con.close();
		} catch (SQLException e) 
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		createCon();
		//getSingleData();
		getMultipleData();

	}

}
