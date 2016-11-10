package hu.uni.miskoc.iit.webtech.hotel.model;


public class Guest {

	private String guestID;
	private String name;
	private String creditCardInfo;
	private String emailAddress;
	private Address address;
	private String mobileNo;
	private String phoneNo;

<<<<<<< HEAD

	public Guest(String guestID, String name, String creditCardInfo, String emailAddress, Address address) {
=======
				

	public Guest(String guestID, String name, String creditCardInfo, String emailAddress, Address address,
			String mobileNo, String phoneNo) {
>>>>>>> branch 'master' of https://github.com/ZsoltToth/sweng2016SH.git
		super();
		this.guestID = guestID;
		this.name = name;
		this.creditCardInfo = creditCardInfo;
		this.emailAddress = emailAddress;
		this.address = address;
		this.mobileNo = mobileNo;
		this.phoneNo = phoneNo;
	}

	public String getGuestID() {
		return guestID;
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
