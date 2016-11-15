package org.hibernate.map.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Adress;
import org.hibernate.map.dto.UserDetailsMToM;
import org.hibernate.map.dto.VehicleMToM;

public class HibernateTestMToM {

	public static void main(String[] args) {
		
		UserDetailsMToM user=new UserDetailsMToM();
		user.setUserName(" firt name");
		UserDetailsMToM user2=new UserDetailsMToM();
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
		
		VehicleMToM vehicle1= new VehicleMToM();
		vehicle1.setVehicleName("Car");
		VehicleMToM vehicle2= new VehicleMToM();
		vehicle2.setVehicleName("Jeep");
		
		user.getListOfAdress().add(homeAdress);
     	user.getListOfAdress().add(officeAdress);
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		user2.getListOfAdress().add(homeAdress);
		
		vehicle1.getUserDetailsList().add(user);
		vehicle1.getUserDetailsList().add(user2);
		
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
