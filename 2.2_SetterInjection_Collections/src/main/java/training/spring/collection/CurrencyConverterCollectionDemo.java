package training.spring.collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

import com.springcore.di.Point;

//import training.spring.mvc.*;

public class CurrencyConverterCollectionDemo {

	public static void main(String args[]) throws Exception {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("currency.xml");
		CurrencyConverterCollection curr = (CurrencyConverterCollection) context.getBean("currencyList");
		List<String> currencies = curr.getCurrencies();
		Iterator<String> it = currencies.iterator();
		System.out.println("Currencies supported :");
		while (it.hasNext())
		   System.out.println(it.next());
		
		}
	
	
	
	
}
