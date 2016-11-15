package org.hibernate.crud.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.hibernate.crud.dto.UserDetails;

public class HibernateTestCRUD {

	public static void main(String[] args) {
	     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionFactory.openSession();
         session.beginTransaction();
         UserDetails user= (UserDetails) session.get(UserDetails.class, 5);
       //  session.delete(user);
         user.setUserName("Updated user");
         user.setUserName("Updated user2");
         session.update(user);
         session.getTransaction().commit();
         session.close();
         System.out.println("User name pulled up is: "+user.getUserName());
       //  String minUserId="1";
         user.setUserName("Updated user");
         session=sessionFactory.openSession();
         session.beginTransaction();
        /* Query query=session.createQuery("from UserDetails where userId>?");
         query.setInteger(0, Integer.parseInt(minUserId));
         query.setFirstResult(3);
         query.setMaxResults(4);*/
         UserDetails exUser=new UserDetails();
         exUser.setUserName("%User%");
         Example example=Example.create(exUser).enableLike();
         Criteria query=session.createCriteria(UserDetails.class);
         query.add(Restrictions.like("userName", "%User%"))
        	  .add(Restrictions.gt("userId", 5))
        	  .add(example);
         @SuppressWarnings("unchecked")
		List<UserDetails> users=(List<UserDetails>)query.list();
         session.getTransaction().commit();
         session.close();
         
         System.out.println("User name pulled up is: "+user.getUserName());
         System.out.println("HQL is: "+users.size());
         for(UserDetails u:users)
        	 System.out.println("Result : "+u.getListOfAdress()+u.getUserName());
        
	}

}
