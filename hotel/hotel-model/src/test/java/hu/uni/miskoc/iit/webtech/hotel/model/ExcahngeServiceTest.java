package hu.uni.miskoc.iit.webtech.hotel.model;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import hu.uni.miskoc.iit.webtech.hotel.model.money.ExchangeService;
import hu.uni.miskoc.iit.webtech.hotel.model.money.Money;
import hu.uni.miskoc.iit.webtech.hotel.model.money.Money.Currency;

public class ExcahngeServiceTest {

	private ExchangeService service;
	private Map<String,Double> currencyMap;
	 
	
	@Before
	public void setUp(){
		Map<Currency, Map<Currency, Double>> exchangeRatios = new HashMap<Currency, Map<Currency,Double>>();
		Map<Currency, Double> fromUSDratios = new HashMap<Currency, Double>();
		Map<Currency, Double> fromEURratios = new HashMap<Currency, Double>();
		Map<Currency, Double> fromHUFratios = new HashMap<Currency, Double>();
		
		
		fromUSDratios.put(Currency.EUR, 1.5);
		fromUSDratios.put(Currency.HUF, 0.05);
		
		fromEURratios.put(Currency.USD, 0.75);
		fromEURratios.put(Currency.HUF, 0.02);
		
		fromHUFratios.put(Currency.USD, 0.90);
		fromHUFratios.put(Currency.EUR, 1.2);
		
		exchangeRatios.put(Currency.USD, fromUSDratios);
		exchangeRatios.put(Currency.EUR, fromEURratios);
		exchangeRatios.put(Currency.HUF, fromHUFratios);
		
		service = new ExchangeService(exchangeRatios);
		if(currencyMap==null||currencyMap.size()>0){System.out.println("CurrencyMap is Null");}
	}
	
	@Test
	public void testWithKnownRatios() {
		Money money = new Money(100, Currency.USD);
		Money expected = new Money(150, Currency.EUR);
		Money actual = service.exchange(money, Currency.EUR);
		// System.out.println(money);
		//System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test (expected=Exception.class)
	public void testIfFromIsUnknown() {
		Money money = new Money(100, Currency.EUR);
		Money expected = new Money(150, Currency.EUR);
		Money actual = service.exchange(money, Currency.EUR);
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testIfToIsUnknown() {
		Money money = new Money(100, Currency.EUR);
		Money expected = new Money(150, Currency.EUR);
		Money actual = service.exchange(money, Currency.EUR);
		assertEquals(expected, actual);
	}

}
