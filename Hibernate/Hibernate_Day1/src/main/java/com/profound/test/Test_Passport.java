package com.profound.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.Passport;
import com.profound.entity.Person_Passport;

public class Test_Passport {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Passport p1 = new Passport(103,"XYZ12345", "2024-11-17");
		s.save(p1);
		
		Person_Passport pp1 = new Person_Passport(3, "Tanmay", "Jadhav", "33 Feb,2002", p1);
		s.save(pp1);
		
		
		t.commit();
		s.close();
		f.close();

	}

}
