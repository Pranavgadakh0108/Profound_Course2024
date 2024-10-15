package com.servlet.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDatabase {
	public static Connection createConnection()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_crud","root","pranav");
			System.out.println("Connection Created..");
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	
	public static int insertEmp(Employee e)
	{
		int status = 0;
		
		try
		{
			Connection con = EmpDatabase.createConnection();
			PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getPassword());
			ps.setString(5, e.getCountry());
			
			status = ps.executeUpdate();
			con.close();
			
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		return status;
	}
	
	public static List<Employee> getAllEmployees()
	{
		List<Employee> list = new ArrayList<Employee>();
		
		try
		{
			Connection con = EmpDatabase.createConnection();
			PreparedStatement ps = con.prepareStatement("select*from employee");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee e= new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPassword(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			con.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public static void delete(int id)
	{
		try
		{
			Connection con = EmpDatabase.createConnection();
			PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			ps.execute();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static Employee getEmployeeId(int id)
	{
		Employee e = new Employee();
		try 
		{
			Connection con = EmpDatabase.createConnection();
			PreparedStatement ps=con.prepareStatement("select*from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPassword(rs.getString(4));
				e.setCountry(rs.getString(5));
			}
			con.close();
		}catch (Exception e1) {
			System.out.println(e1);
		}
		return e;
	}
	
	public static int update(Employee e1)
	{
		int status =0;
		
		try
		{
			Connection con = EmpDatabase.createConnection();
			PreparedStatement ps = con.prepareStatement("update employee set name=?, email=?, password=?, country=? where id=?");
			ps.setString(1, e1.getName());
			ps.setString(2, e1.getEmail());
			ps.setString(3, e1.getPassword());
			ps.setString(4, e1.getCountry());
			ps.setInt(5, e1.getId());
			status = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}
