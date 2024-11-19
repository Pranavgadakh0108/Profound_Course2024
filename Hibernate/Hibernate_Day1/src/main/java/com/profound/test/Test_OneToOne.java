package com.profound.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.Account;
import com.profound.entity.Person;

public class Test_OneToOne {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Account a1= new Account(101, "AB12345", "saving");
		s.save(a1);
		
		Person p1 = new Person(1, "Pranav", 21, a1);
		s.save(p1);
		
		
		t.commit();
		s.close();
		f.close();

	}

}
