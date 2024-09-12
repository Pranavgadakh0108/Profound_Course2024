package com.jdbc.day4.preparedStmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	
	void delete()
	{
		try
		{
			Connection con = JdbcDemo4.createCon();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter roll: ");
			int roll = sc.nextInt();
			
			PreparedStatement ps = con.prepareStatement("delete from student2 where roll=?");
			ps.setInt(1, roll);
			boolean status = ps.execute();
			//returns false if success..
			if(status==false)
			{
				System.out.println("record deleted...");
			}
			else
			{
				System.out.println("deletion failed...");
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		DeleteData d = new DeleteData();
		d.delete();

	}

}
