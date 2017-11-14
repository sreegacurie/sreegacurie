package org.firstclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Class1 obj1 = new Class1();

		int id1;
		String name1, email1;
		long phone1;
		// boolean gender1;

		int i = 0;
		while (i < 3) {
			
			System.out.print("Enter Id:");
			id1 = Integer.valueOf(bf.readLine());
			System.out.print("Enter Name:");
			name1 = bf.readLine();
			System.out.print("Enter Email:");
			email1 = bf.readLine();
			System.out.print("Enter Phone no:");
			phone1 = Long.valueOf(bf.readLine());
			Class1 class1 = new Class1(id1, name1, email1, phone1);
			System.out.println("Id:" + class1.getId());
			System.out.println("Name:" + class1.getName());
			System.out.println("Email:" + class1.getEmail());
			System.out.println("Phone:" + class1.getPhone());

			/*
			 * id1 = obj1.getId(); name1 = obj1.getName(); email1 =
			 * obj1.getEmail(); phone1 = obj1.getPhone(); // gender1 =
			 * obj1.isGender(); obj1.setId(id1); obj1.setName(name1);
			 * obj1.setEmail(email1); obj1.setPhone(phone1);
			 */
			// obj1.setGender(gender1);*/
i++;
			session.save(class1);
		}
			session.getTransaction().commit();
		
		session.close();
	}

}
