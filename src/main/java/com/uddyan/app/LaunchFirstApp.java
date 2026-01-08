package com.uddyan.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uddyan.model.Student;

public class LaunchFirstApp {

	public static void main(String[] args) {
		
		// Step-1 Configuration Object
		Configuration config =  new Configuration();
		
		// Step-2 configure hibernate.cfg.xml file to Configuration Object
		config.configure(); //yaha par name bhi likh sakte hain. or 
		// automatically configure method identify and will be able to configure that hibernate.cfg.xml file to Configuration Object.
		
		// Step-3 Create SessionFactory Object 
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		// Step-4 Get the Session Object from Session Factory.
		Session session=sessionFactory.openSession();
		
		//Step-5 Begin the Transaction within Session
		Transaction transaction=session.beginTransaction();
		
		
		Student student= new Student();
		
		student.setSid(1);
		student.setsName("Raj");
		student.setsCity("Bhilai");
		
		//Step-6 Perform Operation. || persist means save 
		session.persist(student);
		
		//Step-7 Performing Transaction operation.
		transaction.commit();
		
		//Step-8 Close the session (Resources)
		session.close();  // also by default sessionFactory close
		
		
	}
}
