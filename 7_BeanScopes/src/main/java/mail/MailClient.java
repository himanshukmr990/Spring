package mail;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MailClient {

	public static void main(String[] args) {
		
		/** SINGLETON:
		 * 1) Spring IoC container will create exactly one instance (per Spring IoC container) 
		      (at the time of context initialization) 
		 * 2) This single instance will be stored in a cache of such singleton beans, 
		 *    and all subsequent requests and references for that named bean will result in the cached object being returned.
		 */
		
		/** PROTOTYPE :
		 * 1) creation of a brand new bean instance every time (not at the time of context initialization) 
		      when a request for that specific bean is made.(Usefull for stateful bean)
		 * 
		 * 2) In contrast to the other scopes, Spring does not manage the complete life cycle of a prototype bean: 
		 *     a) the container instantiates, configures, and assembles a prototype object, 
		 *        and hands it to the client, with no further record of that prototype instance.
		 * 
		 * 3)Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the 
		 * case of prototypes, configured destruction lifecycle callbacks are not called.
		 * 
		 */
		
				
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("mail.xml");		
		SmtpMailSender mailSender = factory.getBean("smtpMailSender",SmtpMailSender.class);		
//		System.out.println(mailSender.hashCode());	
		
		SmtpMailSender mailSender2 = factory.getBean("smtpMailSender",SmtpMailSender.class);		
		//System.out.println(mailSender2.hashCode());
*/
	
	   
		
/** Container 2 **/		
		
		/*ApplicationContext factory2 = new ClassPathXmlApplicationContext("mail.xml");		
		SmtpMailSender mailSender3 = factory2.getBean("smtpMailSender",SmtpMailSender.class);
		System.out.println(mailSender3.hashCode());
		SmtpMailSender mailSender4 = factory2.getBean("smtpMailSender",SmtpMailSender.class);
		System.out.println(mailSender4.hashCode());*/
		
		
		
		 
/** prototype-bean with Singleton beans dependencies **/
		 
		ApplicationContext factory = new ClassPathXmlApplicationContext("mail.xml");		 
		 MailSender mailSender = factory.getBean("mailSender",MailSender.class);
		 System.out.println(mailSender.hashCode());
		 System.out.println(mailSender.getSmtpMailSender().hashCode());
		 
		 MailSender mailSender2 = factory.getBean("mailSender",MailSender.class);
		 System.out.println(mailSender2.hashCode());
		 System.out.println(mailSender2.getSmtpMailSender().hashCode());
		
		
		
/** Singleton beans with prototype-bean dependencies:
			 *  As dependencies are resolved at instantiation time.if inject a prototype-scoped bean into a singleton-scoped bean
			 *  a brand new prototype bean will be instantiated and then dependency injected into the singleton
			 *  bean... but that is all. That exact same prototype instance will be the sole instance that is ever 
			 *  supplied to the singleton-scoped bean. 
			 */
		
		/* ApplicationContext factory = new ClassPathXmlApplicationContext("mail.xml");		 
		 MailSender mailSender = factory.getBean("mailSender",MailSender.class);
		 System.out.println(mailSender.hashCode());
		 System.out.println(mailSender.getSmtpMailSender().hashCode());
		 
		 MailSender mailSender2 = factory.getBean("mailSender",MailSender.class);
		 System.out.println(mailSender2.hashCode());
		 System.out.println(mailSender2.getSmtpMailSender().hashCode());*/
		
		
  
	}

}
