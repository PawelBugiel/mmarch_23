package com.pawelbugiel;

public class BaseballCoach implements Coach{
	
	// == fields ==
	private FortuneService fortuneService;
	
	// == constructors ==
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// == public methods == 
	@Override
	public String getDailyWorkout() {
		return "A baseball daily workout #1 mvn";
	}
	
	@Override 
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	

}
