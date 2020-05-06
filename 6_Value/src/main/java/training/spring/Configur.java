package training.spring;

import java.io.IOException; 
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class Configur {
	
	   @Bean
	    public PropertyPlaceholderConfigurer ppc() throws IOException {
	        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
	        ppc.setLocations(new ClassPathResource("user1.properties"),new ClassPathResource("user2.properties"));
	        
	        return ppc;
	    }
}
