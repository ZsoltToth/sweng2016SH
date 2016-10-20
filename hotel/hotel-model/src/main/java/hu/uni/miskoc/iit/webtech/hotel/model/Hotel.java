package hu.uni.miskoc.iit.webtech.hotel.model;

import java.util.Map;

public class Hotel {

	private int hotelID;
	private String name;
	 private Address adr;
	Map<String, Room> rooms;

	

	
	public void addRoom(String roomNo, Room room){
		this.rooms.put(roomNo, room);
	}
	
	public Room getRoom(String roomNo){
		return rooms.get(roomNo);
	}

	public Map<String, Room> getRooms() {
		return rooms;
	}

	public Hotel(int hotelID, String name, Address adr, Map<String, Room> rooms) {
		super();
		this.hotelID = hotelID;
		this.name = name;
		this.adr = adr;
		this.rooms = rooms;
		
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
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public void setRooms(Map<String, Room> rooms) {
		this.rooms = rooms;
	}

	

}
