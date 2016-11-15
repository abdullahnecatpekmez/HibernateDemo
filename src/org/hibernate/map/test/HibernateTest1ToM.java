package org.hibernate.map.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Adress;
import org.hibernate.map.dto.UserDetails1ToM;
import org.hibernate.map.dto.Vehicle1ToM;

public class HibernateTest1ToM {

	public static void main(String[] args) {
		
		UserDetails1ToM user=new UserDetails1ToM();
		user.setUserName(" firt name");
		UserDetails1ToM user2=new UserDetails1ToM();
		user2.setUserName("second name");
		
		Adress officeAdress= new Adress();
		officeAdress.setCity("Office city name");
		officeAdress.setStreet("Office street name");
		Adress homeAdress= new Adress();
		homeAdress.setCity("Home city name");
		homeAdress.setStreet("Home street name");
		Adress deneme= new Adress();
		deneme.setCity("deneme city name");
		deneme.setStreet("deneme street name");
		
		Vehicle1ToM vehicle1= new Vehicle1ToM();
		vehicle1.setVehicleName("Car");
		Vehicle1ToM vehicle2= new Vehicle1ToM();
		vehicle2.setVehicleName("Jeep");
		Vehicle1ToM vehicle3= new Vehicle1ToM();
		vehicle3.setVehicleName("Jeep");
		
		user.getListOfAdress().add(homeAdress);
     	user.getListOfAdress().add(officeAdress);
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		user2.getVehicle().add(vehicle3);

		
		user2.getListOfAdress().add(homeAdress);
		
		vehicle1.setUserDetails(user);
		vehicle2.setUserDetails(user);
		vehicle3.setUserDetails(user2);
		
	     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         session.save(user);
         session.save(user2);
         session.save(vehicle1);
         session.save(vehicle2);
         session.save(vehicle3);
         session.getTransaction().commit();
         session.close();
         
      /*   user=null;
         session=sessionFactory.openSession();
         user=(UserDetails)session.get(UserDetails.class, 1);
   //      session.close();
         System.out.println(user.getListOfAdress().add(deneme));*/
         
	}

}
