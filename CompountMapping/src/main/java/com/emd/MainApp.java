package com.emd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class MainApp {

	public static void main(String[] args) 
	{
		Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session sess= factory.openSession();
		 Transaction tx= sess.beginTransaction();
		 
		 Address a1=new Address("tamil nadu","selam",609601);
		 Employee e=new Employee(4,"murugan",a1);
		 sess.save(e);
		 tx.commit();
		 sess.close();
		 

	}

}
