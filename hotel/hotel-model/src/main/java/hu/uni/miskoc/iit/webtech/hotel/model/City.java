package hu.uni.miskoc.iit.webtech.hotel.model;

public enum City {
	Miskolc(Country.Hun),
	Budapest(Country.Hun),
	Delhi(Country.Ind),
	Mumbai(Country.Ind),
	Islamabad(Country.Pak),
	Lahore(Country.Pak);
	
	private Country country;
	private City(Country country) {
		this.country = country;
	}
	public Country getCountry() {
		return country;
	}

}
