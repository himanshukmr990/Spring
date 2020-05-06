package training.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 
public class CurrencyConverter   
{  
	
	public void myInit(){ 
		System.out.println("myInit()");		
	} 
	public void myDestroy() {                  // will not work for prototype scoped bean
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