package com.test.mail3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	
	@Bean
	public TestBean  testBean(){
		return  new TestBean();
		
	}
}
