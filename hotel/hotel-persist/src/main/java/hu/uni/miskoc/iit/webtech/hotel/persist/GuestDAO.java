package hu.uni.miskoc.iit.webtech.hotel.persist;

import hu.uni.miskoc.iit.webtech.hotel.model.Country;
import hu.uni.miskoc.iit.webtech.hotel.model.Guest;

public interface GuestDAO {

	public void creatGuest(Guest guest) throws GuestAlreadyExistsException;
	
	
	
	 
	 public  Collection<Guest> readGuests(Guest guest);
	 public Collection<Country> readGuest(Country country);
	 

	
	 
} 

