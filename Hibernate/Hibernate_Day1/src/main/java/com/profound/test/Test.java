package com.profound.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		//object of configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//create session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create session object
		Session session = factory.openSession();
		
		//create transaction
		Transaction tr = session.beginTransaction();
		
		//create persistent obj class
		Employee e = new Employee(2, "Pratik", 50.20f);
		
		int id = (int) session.save(e);
		
		tr.commit();
		session.close();
		factory.close();

	}

}
