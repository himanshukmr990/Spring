package training.spring;

import javax.annotation.PostConstruct;

public class CurrencyConverter 
{  
	
	CurrencyConverter(){
		System.out.println("CurrencyConverter() ");
	}
	
	@PostConstruct 
	public void myInit(){ 
		System.out.println("myInit()");		
	}
	private double exchangeRate;
	
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate");
		this.exchangeRate = exchangeRate;
	} 
	
	public double dollerToRupee(double doller){
		return  doller*exchangeRate;
	}
	
	
}