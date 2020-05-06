package training.spring;  

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class CurrencyConverter implements  InitializingBean ,DisposableBean  
{ 
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
	@Override
	public void afterPropertiesSet() throws Exception {		
		
		
		System.out.println("afterPropertiesSet()");
		
	}
	
		
	@Override // will not work for prototype scoped bean
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}
	
}