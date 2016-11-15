package org.hibernate.map.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.map.dto.UserDetails1To1;
import org.hibernate.map.dto.Vehicle1To1;

public class HibernateTest1To1 {

	public static void main(String[] args) {
		
		UserDetails1To1 user=new UserDetails1To1();
		user.setUserName(" firt name");
		UserDetails1To1 user2=new UserDetails1To1();
		user2.setUserName("second name");
		
		Vehicle1To1 vehicle1= new Vehicle1To1();
		vehicle1.setVehicleName("Car");
		Vehicle1To1 vehicle2= new Vehicle1To1();
		vehicle2.setVehicleName("Jeep");
		Vehicle1To1 vehicle3= new Vehicle1To1();
		vehicle3.setVehicleName("Jeep");
		
		user.setVehicle(vehicle1);
		user2.setVehicle(vehicle2);
		
	     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         session.save(user);
         session.save(user2);
         session.save(vehicle1);
         session.save(vehicle2);
         session.getTransaction().commit();
         session.close();
         
	}

}
