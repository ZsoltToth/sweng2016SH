package hu.uni.miskoc.iit.webtech.hotel.model;

public enum Country{
	Hun ("Hungary", "+36"),
	Ind ("India", "+91"),
	Pak ("Pakistan","+92");
	private String cname;
	private String ccode;
	private Country(String cname, String ccode) {
		this.cname = cname;
		this.ccode= ccode;
	}
}