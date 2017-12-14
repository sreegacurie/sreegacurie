package org.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		
		UserCredential user1=new UserCredential();
		user1.setUsername("sreega");
		user1.setPassword("jijicurie");
		user1.setStatus(true);
		session.save(user1);
		
		UserCredential user2=new UserCredential();
		user2.setUsername("jiji");
		user2.setPassword("sreegacurie");
		user2.setStatus(false);
		session.save(user2);
		UserCredential user3=new UserCredential();
		user3.setUsername("sathya");
		user3.setPassword("mani");
		user3.setStatus(false);
		
		session.save(user3);
		UserProfile profile1=new UserProfile();
		profile1.setPro_id(1);
		profile1.setFirstname("sreega");
		profile1.setLastname("curie");
        profile1.setPhone_no("8903215996");
		session.save(profile1);
    	UserProfile profile2=new UserProfile();
		profile2.setPro_id(1);
		profile2.setFirstname("jiji");
		profile2.setLastname("curie");
        profile2.setPhone_no("8012678167");
		session.save(profile2);
		
		session.getTransaction().commit();
		session.close();
        
        
	}

}
