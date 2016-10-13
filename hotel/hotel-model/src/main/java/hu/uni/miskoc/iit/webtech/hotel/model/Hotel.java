package hu.uni.miskoc.iit.webtech.hotel.model;

import java.util.Map;

public class Hotel {

	private int hotelID;
	private String name;
	private String address;
	private String phoneNumber;
	private String city;
	private String zipCode;

	Map<String, Room> rooms;

	public Hotel(int hotelID, String name, String address, String phoneNumber, String city, String zipCode,
			Map<String, Room> rooms) {
		super();
		this.hotelID = hotelID;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.zipCode = zipCode;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void addRoom(String roomNo, Room room){
		this.rooms.put(roomNo, room);
	}
	
	public Room getRoom(String roomNo){
		return rooms.get(roomNo);
	}

	public Map<String, Room> getRooms() {
		return rooms;
	}

	public void setRooms(Map<String, Room> rooms) {
		this.rooms = rooms;
	}

}
