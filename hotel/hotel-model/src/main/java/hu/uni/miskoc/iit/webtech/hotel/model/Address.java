package hu.uni.miskoc.iit.webtech.hotel.model;

public class Address {

	private Country country;
	private City city;
	private String postalCode;
	private String street;
	private String houseNo;
	private String phoneNo;
	public Address(Country country, City city, String postalCode, String street, String houseNo, String phoneNo) {
		super();
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.houseNo = houseNo;
		this.phoneNo = phoneNo;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
