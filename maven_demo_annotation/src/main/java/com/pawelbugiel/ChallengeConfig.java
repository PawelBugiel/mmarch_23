package com.pawelbugiel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class ChallengeConfig {
	
	@Bean
	public FortuneService fortuneService() {
		return new GreatFortuneService();
	}
	
	@Bean
	public Coach volleyballCoach() {
		return new VolleyballCoach(fortuneService());
	}

}
