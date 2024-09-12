package com.jdbc.day4.preparedStmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	
	void update()
	{
		try
		{
			Connection con = JdbcDemo4.createCon();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter roll: ");
			int roll = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			
			PreparedStatement ps = con.prepareStatement("update student2 set name=? where roll=?");
			ps.setString(1, name);
			ps.setInt(2, roll);
			ps.execute();
			System.out.println("Record updated Successfully...!!!");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		UpdateData obj = new UpdateData();
		obj.update();

	}

}
