package com.springlearn.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		
		/*SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;*/
	
		return new SwimCoach(sadFortuneService());
	}
	
}








