package training.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
public class CurrencyConverter 
{  
	@PostConstruct  // JSR 250 Annotation
	public void myInit(){ 
		System.out.println("myInit()");		
	} 
	@PreDestroy     // JSR 250 Annotation  // will not work for prototype scoped bean
	public void myDestroy() { 
		System.out.println("myDestroy()");
	} 
	
	CurrencyConverter(){
		System.out.println("CurrencyConverter() ");
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