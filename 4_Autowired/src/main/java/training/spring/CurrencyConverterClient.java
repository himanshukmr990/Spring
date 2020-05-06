package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {

		
		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(55.0);
		System.out.println("55 $ is "+rupees+" Rs.");
	}
}
