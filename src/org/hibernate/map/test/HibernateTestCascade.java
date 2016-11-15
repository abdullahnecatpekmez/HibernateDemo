package org.hibernate.map.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.map.dto.UserDetailsCascade;
import org.hibernate.map.dto.VehicleCascade;

public class HibernateTestCascade {

	public static void main(String[] args) {
		
		UserDetailsCascade user=new UserDetailsCascade();
		user.setUserName(" firt name");
		UserDetailsCascade user2=new UserDetailsCascade();
		user2.setUserName("second name");
		
		VehicleCascade vehicle1= new VehicleCascade();
		vehicle1.setVehicleName("Car");
		VehicleCascade vehicle2= new VehicleCascade();
		vehicle2.setVehicleName("Jeep");
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		
	     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         session.persist(user);
         session.persist(user2);
         session.getTransaction().commit();
         session.close();
	}

}
