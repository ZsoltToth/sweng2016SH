package hu.uni.miskoc.iit.webtech.hotel.model;

public class Guest {

	private String guestID;
	private String name;
	private String city;
	private String address;
	private String creditCardInfo;
	private int mobileNumber;
	private String emailAddress;
	
	public Guest(String guestID, String name, String city, String address, String creditCardInfo, int mobileNumber,
			String emailAddress) {
		super();
		this.guestID = guestID;
		this.name = name;
		this.city = city;
		this.address = address;
		this.creditCardInfo = creditCardInfo;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
