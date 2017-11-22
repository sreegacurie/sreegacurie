package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookMain {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		String publisher;
		String author;
		double price;
		Date published_date;
		String isbn_number;
		
		System.out.print("Enter book id:");
		id = Integer.valueOf(bf.readLine());
		System.out.print("Enter book name:");
		name=bf.readLine();
		System.out.print("Enter book publisher:");
		publisher=bf.readLine();
		System.out.print("Enter book author:");
		author=bf.readLine();
		System.out.print("Enter books price:");
		price=Double.valueOf(bf.readLine());
		System.out.print("Enter published date:");
		published_date=new Date(bf.readLine());
		System.out.print("Enter ISBN number:");
		isbn_number=bf.readLine();
		Book obj=new Book(id, name, publisher, author, price, published_date, isbn_number);
		System.out.println("book Id:" + obj.getId());
		System.out.println("name:" + obj.getName());
		System.out.println("publisher:" + obj.getPublisher());
		System.out.println("author:" + obj.getAuthor());
		System.out.println("price:" + obj.getPrice());
		System.out.println("published date:" + obj.getPublished_date());
		System.out.println("ISBN number:" + obj.getIsbn_number());
		session.save(obj);
session.getTransaction().commit();
		
		session.close();

	}

}
