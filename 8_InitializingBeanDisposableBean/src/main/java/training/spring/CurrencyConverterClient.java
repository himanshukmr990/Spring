package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception { 
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
		 
		
		/*
		registerShutdownHook() : Register a shutdown hook with the JVM runtime, to close the context on JVM shutdown 
        This method declared in interface ConfigurableApplicationContext which is implemented by AbstractApplicationContext,
		(not implemented by ApplicationContext).
		So the invocation of registerShutdownHook()	only possible from the AbstractApplicationContext's object
       */	

      
	    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");			 
//		context.registerShutdownHook();
		context.close(); //to shutdown the container otherwise it will be close when main ends 
	   
		
		// no code spring from here now  
		 System.out.println("main ends......"); 
	

	}
}
