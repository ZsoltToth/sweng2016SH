package hu.uni.miskoc.iit.webtech.hotel.model;

public class Room {

	public enum RoomType {
		SINGLE_BED, DOUBLE_BED, SUITE
	}

	public enum RoomStatus {
		UNDER_CONSTRUCTION, AVAILABLE, PERMANATLY_RESERVED, NOTAVAILABLE
	}

	private int roomNo;
	private RoomType roomType;
	private RoomStatus status;
	private double roomQuality;
	private double roomRating;
	private double roomCost;
	
	public Room(int roomNo, RoomType roomType, RoomStatus status, double roomQuality, double roomRating,
			double roomCost) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
		this.roomQuality = roomQuality;
		this.roomRating = roomRating;
		this.roomCost = roomCost;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public RoomStatus getStatus() {
		return status;
	}

	public void setStatus(RoomStatus status) {
		this.status = status;
	}

	public double getRoomQuality() {
		return roomQuality;
	}

	public void setRoomQuality(double roomQuality) {
		this.roomQuality = roomQuality;
	}

	public double getRoomRating() {
		return roomRating;
	}

	public void setRoomRating(double roomRating) {
		this.roomRating = roomRating;
	}

	public double getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(double roomCost) {
		this.roomCost = roomCost;
	}
	
	
	
	
	
	

	
}
