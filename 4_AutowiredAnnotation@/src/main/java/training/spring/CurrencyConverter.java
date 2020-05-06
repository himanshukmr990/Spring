package training.spring;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CurrencyConverter {
	
	                // 1)First looks for type 
	                // 2) Then Looks for name If multiple bean of same type               
	                // 3) If multiple bean of same type and name also do not match , use @Qualifire
	

    @Autowired 			                                                                         
    @Qualifier("xyz") //default Qualifier is id(XML) or Bean class name(toggle) in case(@Component)
    private ExchangeService exchangeService; 
  
    
	public CurrencyConverter( ) {
		System.out.println("CurrencyConverter()");
	}
	
	//@Autowired				                                                                  // @Qualifier("abc")
	 public void setExchangeService(ExchangeService exchangeService) {
			System.out.println("setExchangeService()");		
			this.exchangeService = exchangeService;
		}
		
	 	
	//@Autowired    													                          // Autowired with constructor works only when one bean per type (@Qualifier is not allowed)
	public CurrencyConverter(ExchangeService exchangeService) {
		this.exchangeService=exchangeService;
		System.out.println("CurrencyConverter(ExchangeService)");
	}

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
}  

/**
 
 @Inject is part of the Java CDI (Contexts and Dependency Injection) 
 This annotation is an almost complete drop-in replacement for Spring's @Autowired annotation. 
 if you used @Inject you could replace spring with another DI framework e.g. Guice 
 @Autowired can used required=false and allow nullable field if required but @Inject does not have the required field
 
 eg :  @Autowired(required=false)	// even if we don't have bean def for exchangeService in XML,container will start without error
 
 
**/

 