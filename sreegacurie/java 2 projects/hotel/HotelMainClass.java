package org.firstclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HotelMainClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 int i=0;
 while(i<3)
 {
	 i++;
 
		System.out.println("Calculation of revenue per day");
		System.out.print("Enter no of rooms:");
		int rooms=Integer.valueOf(bf.readLine());
		System.out.print("Enter avg room rate:");
		int roomrate=Integer.valueOf(bf.readLine());
		System.out.print("Enter avg occupancy rate:");
		float occurate=Float.valueOf(bf.readLine());
		
	 float total_room_revenue=0;
		float revPAR=0.0f;
		Hotel obj=new Hotel();
		Hotel obj1=new Hotel(rooms,roomrate,occurate,total_room_revenue,revPAR);
		
		System.out.println("no of rooms:"+obj1.getRoomNumber());
		System.out.println("avg room rate:"+obj1.getRoomRate());
		System.out.println("avg occupancy rate:"+obj1.getAvgOccupancyRate());
		System.out.println("total room revenue:"+obj1.getTotalRoomRevenue());
		System.out.println("revPAR:"+obj1.getRevPAR());
		session.save(obj1);
 }
		session.getTransaction().commit();
		session.close();
	}
	

}
