package hu.uni.miskoc.iit.webtech.hotel.model.money;

public class Money {

	private double amount;
	private Currency currency;

	public Money(double amount, Currency currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
