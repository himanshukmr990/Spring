package training.spring;
public class CurrencyConverter {
	
	private ExchangeService exchangeService;
	
	public CurrencyConverter( ) {
		System.out.println("CurrencyConverter()");
	}
	
	public CurrencyConverter(ExchangeService exchangeService) {
		this.exchangeService=exchangeService;
		System.out.println("CurrencyConverter(ExchangeService ex)");
	}

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};