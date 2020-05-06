package training.spring;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class UserClient {

	public static void main(String args[]) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		User1 user = (User1) ctx.getBean("user1");
		System.out.println(user);
		
	    User2 user2 = (User2) ctx.getBean("user2"); 
	    System.out.println(user2);
		 

	}
}
