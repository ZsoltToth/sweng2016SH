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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
}