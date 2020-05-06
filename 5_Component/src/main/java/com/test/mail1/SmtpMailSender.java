 package com.test.mail1;

import org.springframework.stereotype.Component;
/* Spring creates beans for classes annotated with @Component or its specialization..
 * @Controller
 * @RestController
 * @Service
 * @repository
 * @Configuration
*/

@Component                                                      //@Component("smtp") // default name is name of the class in camel case if name is not given : "@Component("smtp")"
public class SmtpMailSender{
	 
	public void send(String to, String subject, String body) {

		   System.out.println("Sending SMTP Mail to :"+to);
	       System.out.println("Subject :"+subject);
	       System.out.println("Body :"+body);
	       		
	}

	public SmtpMailSender(){
		System.out.println("SmtpMailSender()");
	}
}
