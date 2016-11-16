package hu.uni.miskoc.iit.webtech.hotel.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hotel {

	private int hotelID;
	private String name;
	 private Address address;
	 private double hotelRating;
	 private int totalRooms;
	 private double sumroomRatings;
	 Map<String, Room> rooms;
	 
	public Hotel(int hotelID, String name, Address address,	Map<String, Room> rooms) {
		super();
		this.hotelID = hotelID;
		this.name = name;
		this.address = address;
		this.hotelRating = hotelRating;
		this.totalRooms = totalRooms;
		this.sumroomRatings = sumroomRatings;
		this.rooms = rooms;
	}


	public double getSumroomRatings() {
		return sumroomRatings;
	}


	public void setSumroomRatings(double sumroomRatings) {
		this.sumroomRatings = sumroomRatings;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getTotalRooms() {
		return totalRooms;
	}


	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}


	

	

	
	public void addRoom(String roomNo, Room room){
		this.rooms.put(roomNo, room);
	}
	
	
	public Map<String, Room> getRooms() {
		return rooms;
	}


	

	public int getHotelID() {
		return hotelID;
	}


	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAdr() {
		return address;
	}


	public void setAdr(Address adr) {
		this.address = adr;
	}


	public double getHotelRating() {
		double sum=0.0;
		double rating;
		//checking
		Room r1;
		for (String key: rooms.keySet()){
			//sum=sum+rooms.getClass()
			r1 = rooms.get(key);
			sum = sum+ r1.getRoomRating();
		}
		rating = sum/rooms.size();
	
		return rating;
	}


	public void setHotelRating(double hotelRating) {
		
	}


	public void setRooms(Map<String, Room> rooms) {
		this.rooms = rooms;
	}

	

	

}
