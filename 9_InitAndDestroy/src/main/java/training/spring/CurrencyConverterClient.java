package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {  
		
		AbstractApplicationContext contaxt = new ClassPathXmlApplicationContext("spring.xml");
		contaxt.registerShutdownHook();
		contaxt.close();
		
		System.out.println("Main ends...");
		
			
	}
}
