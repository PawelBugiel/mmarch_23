package com.pawelbugiel;

import org.springframework.beans.factory.annotation.Value;

public class VolleyballCoach implements Coach {
	
	// == fields ==
	private FortuneService fortuneService;
	
	@Value("${volleyball.email}")
	private String email;
	
	@Value("${valleyball.team}")
	private String team;
	
	// == constructors == 
	public VolleyballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Volleyball workout";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService + " from Valleyball getDailyFortune()..";
	}

}
