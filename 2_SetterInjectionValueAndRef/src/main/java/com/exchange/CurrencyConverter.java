package com.exchange;
public class CurrencyConverter {
	
	CurrencyConverter(){
		System.out.println("CurrencyConverter()");
	}
	
	/*private double exchangeRate;
		
	public double dollarsToRupees(double dollars) {
		return dollars * getExchangeRate();
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate(double exchangeRate)");
		this.exchangeRate = exchangeRate;
	}*/
	

	 
	private ExchangeService exchangeService;
	
	public ExchangeService getExchangeService() {
		return exchangeService;
	}
	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService(ExchangeService exchangeService)");
		this.exchangeService = exchangeService;
	}	
	public double dollarsToRupees(double dollars) {	
		return dollars * getExchangeService().getExchangeRate();
	}

		
}