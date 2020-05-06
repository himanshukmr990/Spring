package com.test.mail1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/* Spring creates beans for classes annotated with @Component or its specialization..
 * @Controller
 * @RestController
 * @Service
 * @repository
 * @Configuration
*/



@Component   												//@Component("mock") // default name is name of the class in camel case if name is not given : "@Component("mock")"
// @Scope("prototype") 
public class MockMailSender{

	public void send(String to, String subject, String body) {

       System.out.println("Sending Test Mail to :"+to);
       System.out.println("Subject :"+subject);
       System.out.println("Body :"+body);
		
	}
	
	public MockMailSender(){
		System.out.println("MockMailSender()");
	}
	 

}
