package hu.uni.miskoc.iit.webtech.hotel.model;

public class Guest {

	private String guestID;
	private String name;
	private String creditCardInfo;
	private String emailAddress;
	private Address address;

	public Guest(String guestID, String name, String creditCardInfo, String emailAddress, Address address) {
		super();
		this.guestID = guestID;
		this.name = name;
		this.creditCardInfo = creditCardInfo;
		this.emailAddress = emailAddress;
		this.address = address;
	}

	public String getGuestID() {
		return guestID;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
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
	
	

}
