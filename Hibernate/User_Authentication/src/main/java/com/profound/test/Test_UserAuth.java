package com.profound.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.profound.entity.User;

public class Test_UserAuth {
	
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	public User validateUser(String username, String password)
	{
		Session s = factory.openSession();
		return (User) s.createQuery("FROM User WHERE username = :username AND password = :password").setParameter("username", username).setParameter("password", password).uniqueResult();
	}
	
	public boolean registerUser(User user) {
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return false;
	}

}
