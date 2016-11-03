package hu.uni.miskoc.iit.webtech.hotel.model.money;

import java.util.HashMap;
import java.util.Map;

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
			return new Money(0, Currency.HUF);
		}
		 Map<Currency, Double> c = new HashMap<Currency, Double>();
}
