package training.spring; 

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor; 


/**A BeanPostProcessor gives you a chance to process an instance of a bean 
   created by the IoC container after it's instantiation  **/
public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException { 
		
		System.out.println("postProcessBeforeInitialization "+beanName);
        
		if ( bean instanceof CurrencyConverter){
			
			CurrencyConverter currencyConverter = ((CurrencyConverter)bean);
			currencyConverter.setExchangeRate(currencyConverter.getExchangeRate()+10);			
		}

		
      return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException { 
	   	System.out.println("postProcessAfterInitialization "+beanName);
        return bean;
   }
}



/*  
        if (bean instanceof CurrencyConverter) { 
			CurrencyConverter converter = ((CurrencyConverter)bean);
			System.out.println("initial value : "+converter.getExchangeRate());
			converter.setExchangeRate(converter.getExchangeRate() + 10);
			}
*/
 