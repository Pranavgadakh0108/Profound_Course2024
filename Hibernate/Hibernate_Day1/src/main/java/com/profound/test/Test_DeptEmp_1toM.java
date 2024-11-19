package com.profound.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.Department;
import com.profound.entity.Employees;

public class Test_DeptEmp_1toM {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Employees e1 = new Employees(101, "Pranav", "Developer", 20000.21);
		Employees e2 = new Employees(102, "Tanmay", "Tester", 30000.21);
		Employees e3 = new Employees(104, "Chandan", "HR", 200000.21);
		Employees e4 = new Employees(105, "Ritesh", "Manager", 100000.21);
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		
		Set<Employees> employees = new HashSet<Employees>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Department A = new Department(1, "IT", employees);
		
		s.save(A);
		
		t.commit();
		s.close();
		f.close();

	}

}
