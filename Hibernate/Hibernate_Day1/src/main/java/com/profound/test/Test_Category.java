package com.profound.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.Category;

public class Test_Category {
	
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory f = con.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(new Category(101, "Men"));
		s.save(new Category(102, "Women"));
		s.save(new Category(103, "Kids"));
		s.save(new Category(104, "Home & Living"));
		
		t.commit();
		s.close();
		f.close();
		
	}
	

}
