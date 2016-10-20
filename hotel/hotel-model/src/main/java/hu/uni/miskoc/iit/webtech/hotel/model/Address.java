package hu.uni.miskoc.iit.webtech.hotel.model;

public class Address {
	private String country;
	private String City;
	private String PostalCode;
	private String Street;
	private String HouseNo;
	private String PhoneNo;
	public Address(String country, String city, String postalCode, String street, String houseNo, String phoneNo) {
		super();
		this.country = country;
		City = city;
		PostalCode = postalCode;
		Street = street;
		HouseNo = houseNo;
		PhoneNo = phoneNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

}
