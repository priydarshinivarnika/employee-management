package com.common.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file
		SessionFactory factory = cfg.buildSessionFactory();// creating session factory object
		
		Session session = factory.openSession();// creating session object
		Transaction t = session.beginTransaction();// creating transaction object

		Employee e1 = new Employee();
		e1.setEmpId(100);
		e1.setEmpFirstName("First");
		e1.setEmpLastName("Name");
		e1.setEmpSkill("Java");
		e1.setEmpDepartment("Development");

		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpFirstName("Second");
		e2.setEmpLastName("Name");
		e2.setEmpSkill("SQL");
		e2.setEmpDepartment("Support");

		Employee e3 = new Employee();
		e3.setEmpId(102);
		e3.setEmpFirstName("Third");
		e3.setEmpLastName("Name");
		e3.setEmpSkill("Excel");
		e3.setEmpDepartment("Management");

		session.persist(e1);// persisting the object
		session.persist(e2);// persisting the object
		session.persist(e3);// persisting the object
		t.commit();// transaction is committed
		session.close();

		// How to update an existing record.
		// Open the session if not open already
		session = factory.openSession();

		// Load the object which you want to update using the (employee) Id
		Object o = session.load(Employee.class, new Integer(101));

		// Cast the object to Entity type i.e. Employee in this case.
		Employee e4 = (Employee) o;

		// Begin transaction
		Transaction t2 = session.beginTransaction();

		// Make changes in the persistence object.
		e4.setEmpFirstName("Fourth");

		// Commit the transaction
		t2.commit();

		// Close the session. Object gets persisted when the transaction is
		// committed and session is closed.
		session.close();
		
		System.out.println("successfully saved");

	}
	
}
