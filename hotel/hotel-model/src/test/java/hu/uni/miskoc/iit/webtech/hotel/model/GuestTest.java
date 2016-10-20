package hu.uni.miskoc.iit.webtech.hotel.model;

import org.junit.Test;

public class GuestTest {

	
	@Test
	public void test(){
		Guest guest = new Guest("12", "George", "mastercard", "george@gmail.com", null);
		System.out.println(guest);
	}
}
