package com.jdbc.day4.preparedStmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Multi_Delete extends JdbcDemo4{
	
	void deleteMultipleRecords()
	{
		try
		{
			Connection con = JdbcDemo4.createCon();
			System.out.println("---------------------------------------------");
			getMultipleData();
			System.out.println("---------------------------------------------");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter your choice: \n\t 1.Delete specific records. \n\t 2.Delete all records");
			int choice = sc.nextInt();
			System.out.println("---------------------------------------------");
			
			switch(choice) {
				case 1 : 
							System.out.println("enter a numbers of records want to delete from above table: ");
							int n = sc.nextInt();
							System.out.println("---------------------------------------------");
							for(int i=1; i<=n; i++)
							{
								System.out.println("Enter a roll no of student: ");
								int roll = sc.nextInt();
								
								PreparedStatement ps = con.prepareStatement("delete from student2 where roll=?");
								ps.setInt(1, roll);
								ps.execute();
								System.out.println(i+" record delete sussessfully!!!");
							}	
							break;
				case 2:
						PreparedStatement ps = con.prepareStatement("delete from student2");
						ps.execute();
						System.out.println("All records delete sussessfully!!!");
						break;
						
				default:System.out.println("enter correct choice...");
						
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Multi_Delete data = new Multi_Delete();
		data.deleteMultipleRecords();

	}

}
