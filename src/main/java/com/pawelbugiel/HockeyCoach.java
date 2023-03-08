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

	// == public methods ==
	public String getDailyWorkout() {
		return "A hockey workout # mvn";
	}

	public String getDailyFortune() {
		return "Hockey " + this.fortuneService.getFortune();
	}
	
	// add an init method 
	public void anInitMethodName() {
		System.out.println("HockeyCoach init method called..");
	}
	
	// add a destroy method
	public void aDestroyMethodName() {
		System.out.println("HockeyCoach destroy method called..");
	}
}
