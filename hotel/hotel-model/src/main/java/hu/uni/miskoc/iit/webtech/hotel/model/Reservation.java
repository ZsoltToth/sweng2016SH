package hu.uni.miskoc.iit.webtech.hotel.model;
public class Reservation {
	private String guestName;
	private String emailAddress;
	private Address address;
	private String mobileNo;
	private String phoneNo;
	private String roomtype;
	private String roomAvailability;
	private int roomCost;
	
	public Reservation(String guestName, String emailAddress, Address address, String mobileNo, String phoneNo,
			String roomtype, String roomAvailability, int roomCost) {
		super();
		this.guestName = guestName;
		this.emailAddress = emailAddress;
		this.address = address;
		this.mobileNo = mobileNo;
		this.phoneNo = phoneNo;
		this.roomtype = roomtype;
		this.roomAvailability = roomAvailability;
		this.roomCost = roomCost;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getRoomAvailability() {
		return roomAvailability;
	}

	public void setRoomAvailability(String roomAvailability) {
		this.roomAvailability = roomAvailability;
	}

	public int getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}
	

}
