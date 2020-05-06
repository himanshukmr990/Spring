package training.spring.collection;
import java.util.List;

 

public class CurrencyConverterCollection {
	
	public CurrencyConverterCollection() {
		System.out.println("CurrencyConverter()");
	}

	private List<String> currencies;

	public List<String> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}

};