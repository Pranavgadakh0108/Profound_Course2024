package com.jd.bc;
import java.sql.*;
import java.util.Scanner;

public class MysqlJava {
	public static void main(String[] args) throws Exception {
	  
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("--->> MENU <<---");
		System.out.println("1. Insert Data");
		System.out.println("2. Update Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Read Data");
		System.out.println("---------------------------------");
		System.out.println("ENTER YOUR CHOICE: ");
		int c = sc.nextInt();
		System.out.println("---------------------------------");
		
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
			  
		//create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","pranav");
		
		switch(c)
		{
			case 1 :System.out.println("---------------------------------");
					System.out.println("ENTER STUDENT ID NAME CITY: ");
					int id = sc.nextInt();
					sc.nextLine();
					String name =sc.nextLine();
					String city = sc.nextLine();
					System.out.println("---------------------------------");
				
					//create statement
					PreparedStatement ps = con.prepareStatement("insert into demo values('"+id+"','"+name+"','"+city+"')");
					int i =ps.executeUpdate();
					
					if(i>0)
					{
						System.out.println("Information Added to Database Succesfully!!!!");
					}
					else
					{
						System.out.println("Failed to Add....<(-_-)>");
					}
					
					//con.close(); 
					System.out.println("---------------------------------");
					break;
					
			case 2 :System.out.println("---------------------------------");
					System.out.println("Enter Which field U have to update (id/name/city): ");
					String field=sc.next();
					
					if(field.equals("name"))
					{
						System.out.println("Enter Id: ");
						int id1 = sc.nextInt();
						System.out.println("Enter Updated Name: ");
						String newName= sc.next();
						
						PreparedStatement ps1 = con.prepareStatement("update demo set name='"+newName+"' where id='"+id1+"'");
						
						int count = ps1.executeUpdate();
						if(count > 0)
						{
							System.out.println("Name Updated Succefully..");
						}
						else
						{
							System.out.println("Updation failed");
						}
					}
					else if(field.equals("city"))
					{
						System.out.println("Enter Id: ");
						int id1 = sc.nextInt();
						System.out.println("Enter Updated City: ");
						String newCity= sc.next();
						
						PreparedStatement ps1 = con.prepareStatement("update demo set city='"+newCity+"' where id='"+id1+"'");
						
						int count = ps1.executeUpdate();
						if(count > 0)
						{
							System.out.println("City Updated Succefully..");
						}
						else
						{
							System.out.println("Updation failed");
						}
					}
					else
					{
						System.out.println("Enter name: ");
						String newName= sc.next();
						System.out.println("Enter Updated Id: ");
						int newId = sc.nextInt();
						
						PreparedStatement ps1 = con.prepareStatement("update demo set id='"+newId+"' where name='"+newName+"'");
						
						int count = ps1.executeUpdate();
						if(count > 0)
						{
							System.out.println("ID Updated Succefully..");
						}
						else
						{
							System.out.println("Updation failed");
						}
					}
					System.out.println("---------------------------------");
					break;
					
			case 3 :System.out.println("---------------------------------");
					 
					System.out.println("Enter Id of Recored Which u want to Delete: ");
					int id1 = sc.nextInt();
					
					PreparedStatement ps1 = con.prepareStatement("delete from demo where id='"+id1+"'");
					
					int count = ps1.executeUpdate();
					if(count > 0)
					{
						System.out.println("Record Deleted Succefully..");
					}
					else
					{
						System.out.println("Deletion failed (Wrong Id)");
					}
					System.out.println("---------------------------------");
					break;
					
			case 4 : System.out.println("---------------------------------");
					
					PreparedStatement ps2 = con.prepareStatement("select * from demo");
					ResultSet rs = ps2.executeQuery();
					System.out.println("  ---->> demo.table <<----");
					System.out.println("---------------------------------");
					System.out.println("|----------------------------|");
					
					while(rs.next())
					{
						System.out.println("| ID :"+rs.getString("id")+" 		     |");
						System.out.println("|----------------------------|");
						System.out.println("| NAME :"+rs.getString("name")+" 		     |");
						System.out.println("|----------------------------|");
						System.out.println("| CITY :"+rs.getString("city")+" 		     |");
						System.out.println("|----------------------------|");
						System.out.println("---------------------------------");
					}
					break;
			default : System.out.println("OOPS!!! ENTER CORRECT CHOICE....");
	}
	
  }

}
