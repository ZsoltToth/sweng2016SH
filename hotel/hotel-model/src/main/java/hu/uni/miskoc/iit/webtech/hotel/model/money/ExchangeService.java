package hu.uni.miskoc.iit.webtech.hotel.model.money;

import java.util.HashMap;
import java.util.Map;

import hu.uni.miskoc.iit.webtech.hotel.model.money.Money.Currency;

public class ExchangeService {
	
		/**
		 * exchangeRatios[From,To] -> ratio
		 */
		private Map<Currency, Map<Currency, Double>> exchangeRatios;
		
		
		
	


		public ExchangeService(Map<Currency, Map<Currency, Double>> exchangeRatios) {
			super();
			this.exchangeRatios = exchangeRatios;
			
		}





		public Money exchange(Money currentDevisa, Currency targetCurrency){
			
			
			
			
			Double ratio = exchangeRatios.get(currentDevisa.getCurrency()).get(targetCurrency);
			
			return new Money(ratio * currentDevisa.getAmount(), targetCurrency);
		}
		
			
			 
		 
}
