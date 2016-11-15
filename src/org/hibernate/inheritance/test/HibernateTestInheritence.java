package org.hibernate.inheritance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.inheritance.dto.FourWheeler;
import org.hibernate.inheritance.dto.TwoWheeler;
import org.hibernate.inheritance.dto.Vehicle;

public class HibernateTestInheritence {

	public static void main(String[] args) {
		
	
		Vehicle vehicle1= new Vehicle();
		vehicle1.setVehicleName("Car");
		Vehicle vehicle2= new Vehicle();
		vehicle2.setVehicleName("Jeep");
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringWheel("Bike Steering Wheel");
		FourWheeler porsche=new FourWheeler();
		porsche.setVehicleName("Porsche");
		porsche.setSteeringWheel("Porsche Steering Wheel");
		
	     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         session.save(vehicle1);
         session.save(vehicle2);
         session.save(porsche);
         session.save(bike);
         session.getTransaction().commit();
         session.close();
	}

}
