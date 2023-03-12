package com.pawelbugiel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.pawelbugiel")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for sad fortune service
	
	@Bean
	public Coach waterPoloCoach() {
		return new WaterPoloCoach(sadFortuneService());
	}
	
	// define bean for water polo coach AND inject dependency
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	
	
	
	
	
}