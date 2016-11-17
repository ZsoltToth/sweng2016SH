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

		Map<String, Room> rooms = new HashMap<String, Room>();
		rooms.put("1", new Room(1, RoomType.SINGLE_BED, RoomStatus.AVAILABLE, 0.0, 4.0, null));
		rooms.put("2", new Room(1, RoomType.DOUBLE_BED, RoomStatus.AVAILABLE, 0.0, 3.5, null));
		rooms.put("3", new Room(1, RoomType.SUITE, RoomStatus.AVAILABLE, 0.0, 3.2, null));
		Hotel hotel = new Hotel(1, "GrandBudapestHotel", null, rooms);

		// calculating expected rating of hotel
		double sum = 4.0 + 3.5 + 3.2;
		double expected = sum / 3.0;

		// getting actual rating of hotel
		double actual = hotel.getHotelRating();

		// comparing actual and expected ratings
		assertEquals(actual, expected, 1e-4);

	}

	@Test
	public void testHotelRatingWithoutAnyRoom() {
		Hotel hotel = new Hotel(1, "GrandBudapestHotel", null, new HashMap<String, Room>());
		double expected = 0.0;
		double actual = hotel.getHotelRating();
		assertEquals(expected, actual, 1e-4);
	}
	
	@Test
	public void testHotelRatingIfRoomsIsNull() {
		Hotel hotel = new Hotel(1, "GrandBudapestHotel", null, null);
		double expected = 0.0;
		double actual = hotel.getHotelRating();
		assertEquals(expected, actual, 1e-4);
	}
@Test
	public void testHotelRatingIfRoomRatingismorethan5() {
		Map<String, Room> rooms = new HashMap<String, Room>();
		rooms.put("1", new Room(1, RoomType.SINGLE_BED, RoomStatus.AVAILABLE, 0.0, 6.0, null));
		rooms.put("2", new Room(1, RoomType.DOUBLE_BED, RoomStatus.AVAILABLE, 0.0, 3.5, null));
		rooms.put("3", new Room(1, RoomType.SUITE, RoomStatus.AVAILABLE, 0.0, 3.2, null));
		Hotel hotel = new Hotel(1, "GrandBudapestHotel", null, rooms);
		
		double sum = 5.0 + 3.5 + 3.2;
		double expected = sum / 3.0;
		double actual = hotel.getHotelRating();
		assertEquals(expected, actual, 1e-4);
	}

}
