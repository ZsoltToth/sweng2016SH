package hu.uni.miskoc.iit.webtech.hotel.model.money;

public class Currency {

   
	public Double EUR;
	public Double HUF;
	public Double USD;
	
	
	public Currency() {
		super();
	} 
	
	public Double getEuro() {
		return EUR;
	}
	public void setEuro(Double euro) {
		this.EUR = euro;
	}
	public Double getForint() {
		return HUF;
	}
	public void setForint(Double forint) {
		this.HUF = forint;
	}
	public Double getDollar() {
		return USD;
	}
	public void setDollar(Double dollar) {
		this.USD = dollar;
	}
	

}
