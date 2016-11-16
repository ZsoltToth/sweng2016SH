package hu.uni.miskoc.iit.webtech.hotel.model;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import hu.uni.miskoc.iit.webtech.hotel.model.Hotel;
import hu.uni.miskoc.iit.webtech.hotel.model.Room;
import hu.uni.miskoc.iit.webtech.hotel.model.Room.RoomStatus;
import hu.uni.miskoc.iit.webtech.hotel.model.Room.RoomType;

import org.junit.Test;

public class HotelRatingTest {
	
	@Test
	public void testGetHotelRating() {
		
		double hr;
		Map<String,Room> rooms = new HashMap<String,Room>();
		rooms.put("1", new Room(1, RoomType.SINGLE_BED, RoomStatus.AVAILABLE, 0.0, 4.0, null));
		rooms.put("2", new Room(1, RoomType.DOUBLE_BED, RoomStatus.AVAILABLE, 0.0, 3.5, null));
		rooms.put("3", new Room(1, RoomType.SUITE, RoomStatus.AVAILABLE, 0.0, 3.2, null));
		Hotel hotel = new Hotel(1,"GrandBudapestHotel" , null, rooms);
		
		//getting actual rating of hotel
		hr = hotel.getHotelRating(); 
		
		//calculating expected rating of hotel
		double sum = 4.0+3.5+3.2;
		double rating = sum/3.0; 
		
		String expected = new Double(rating).toString();
		String actual = new Double(hr).toString();
		
		//comparing actual and expected ratings
		assertEquals("True", actual, expected);
		
		//displaying the values on console
		System.out.println("Actual Hotel Rating: " + actual);
		System.out.println("Expected Hotel Rating: " + expected);
			
	}
	

}
