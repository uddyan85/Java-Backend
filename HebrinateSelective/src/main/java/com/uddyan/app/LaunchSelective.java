package com.uddyan.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uddyan.model.Employess;

public class LaunchSelective {

	public static void main(String[] arg) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employess.class).buildSessionFactory();
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			Employess e=new Employess();
			e.setEmp_id(102);
			e.setName("Savi");
			e.setLastname("Sahu");
			e.setDesig("DevOps");
			e.setDept("IT Dev");
			e.setSalary(3800000);
			session.persist(e);
			flag=true;
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag==true) {
				transaction.commit();
			} else {
				transaction.rollback();
			}
			
			session.close();
			sessionFactory.close();
		}
	}
}
