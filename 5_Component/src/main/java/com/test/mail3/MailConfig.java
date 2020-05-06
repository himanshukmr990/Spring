package com.test.mail3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;




@Configuration
//@ImportResource("abc.xml") //@ImportResource({"mail.xml","abc.xml"})  
@Import(TestConfig.class)   //@Import({ CustomerConfig.class, SchedulerConfig.class })
public class MailConfig {
	  											
//	@Primary
//	@Qualifier
//	@Scope
	
	@Bean                                             //@Bean(name="abc") //default name and Qualifier of the bean is the method name
	@Qualifier("xyz")
	//@Scope("prototype")
	public MailSender mockMailSender(){
		return new MockMailSender();
	}
	
	
	@Bean	
	public MailSender smtpMailSender(){
		return new SmtpMailSender();
	}
	
	@Bean
	public MailService mailService(){
		return new MailService();
	}
	 	
}

//import Bean configuration 	  
/*
  @Configuration 
  @ImportResource("mail.xml") //@ImportResource({"mail.xml","abc.xml"})  
  @Import(TestConfig.class)   //@Import({ CustomerConfig.class, SchedulerConfig.class })
*/

/*
	@Bean
	@Bean(initMethod = "init", destroyMethod = "cleanup" )
	@Scope("prototype")
	public MailSender mockMailSender(){
*/
/*
    

/*
 * add 
 * cglib.jar and asm.jar 
 * if spring version is < 3.2
 * for @Configuration
 */
