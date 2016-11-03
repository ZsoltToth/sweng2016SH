package hu.uni.miskoc.iit.webtech.hotel.model.money;

public class conversion {
	private double Exchange;
	private double Amount;
	private double conversionToEuros;
	private double conversionToForint;
	private double conversionToDollar;


	public conversion(double exchange, double amount, double conversionToEuros, double conversionToForint,double conversionToDollar) {
		super();
		Exchange = exchange;
		Amount = amount;
		this.conversionToEuros = conversionToEuros;
		this.conversionToForint = conversionToForint;
		this.conversionToDollar = conversionToDollar;
	}
	public double getConversionToDollar() {
		return conversionToDollar;
	}
	public void setConversionToDollar(double conversionToDollar) {
		this.conversionToDollar = conversionToDollar;
	}
	public double getExchange() {
		return Exchange;
	}
	public void setExchange(double currentrate) {
		this.Exchange = currentrate;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double currentamount) {
		this.Amount = currentamount;
	}
	public double conversionToEuros() {
		return (Exchange * Amount);
		}

		public double conversionToPounds() {
		return (Amount / Exchange);
		}



}
