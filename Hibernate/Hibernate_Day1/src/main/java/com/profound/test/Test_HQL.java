package com.profound.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test_HQL {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		
		 s.createQuery("from Employees");
		
		
		

	}

}
