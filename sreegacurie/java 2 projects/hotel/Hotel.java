package org.firstclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="HOTEL_DETAILS")
public class Hotel {
	@Id
	//@GeneratedValue
	@Column (name="ROOM_NUMBER",length=30,nullable=false)
	int roomNumber;
	@Column (name="ROOM_RATE")
    int roomRate;
	@Column (name="AVG_OCCUPANCY_RATE")
    float avgOccupancyRate;
	
	@Column (name="TOTAL_ROOM_REVENUE")
    float totalRoomRevenue;

	@Column (name="REV_PAR")
    float revPAR;
    
	
	
	public Hotel()
	{
		
	}






	public Hotel(int roomNumber, int roomRate, float avgOccupancyRate, float totalRoomRevenue, float revPAR) {
		this.roomNumber = roomNumber;
		this.roomRate = roomRate;
		this.avgOccupancyRate = avgOccupancyRate;
		this.totalRoomRevenue = totalRoomRevenue;
		this.revPAR = revPAR;
	}






	public int getRoomNumber() {
		return roomNumber;
	}



	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}



	public int getRoomRate() {
		return roomRate;
	}



	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}



	public float getAvgOccupancyRate() {
		return avgOccupancyRate;
	}



	public void setAvgOccupancyRate(float avgOccupancyRate) {
		this.avgOccupancyRate = avgOccupancyRate;
	}



	public float getTotalRoomRevenue() {
		
		totalRoomRevenue=(roomNumber*roomRate*(avgOccupancyRate/100)*90);
		return totalRoomRevenue;
	}



	public void setTotalRoomRevenue(float totalRoomRevenue) {
		this.totalRoomRevenue = totalRoomRevenue;
	}



	public float getRevPAR() {
		
		revPAR=totalRoomRevenue/(90*roomNumber);
		return revPAR;
	}



	public void setRevPAR(float revPAR) {
		this.revPAR = revPAR;
	}
	
	

}
