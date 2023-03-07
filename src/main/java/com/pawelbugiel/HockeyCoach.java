package com.pawelbugiel;

public class HockeyCoach implements Coach {

	// == fields == for dependency
	private FortuneService fortuneService;

	// == constructors == for dependency injection
	public HockeyCoach() {
	};

	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// == private methods ==
	
	public String getDailyWorkout() {
		return "A hockey workout # mvn";
	}

	
	public String getDailyFortune() {
		return "Hockey " + this.fortuneService.getFortune();
	}

}
