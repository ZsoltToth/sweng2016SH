package hu.uni.miskoc.iit.webtech.hotel.model;

public class Room {

	public enum RoomType {
		SINGLE_BED, DOUBLE_BED, SUITE
	}

	public enum RoomStatus {
		UNDER_CONSTRUCTION, AVAILABLE, PERMANATLY_RESERVED
	}

	private int roomNo;
	private RoomType roomType;
	private RoomStatus status;

	public Room(int roomNo, RoomType roomType, RoomStatus status) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
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

}
