package com.pawelbugiel;

public class GolfCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Override 
	public String getDailyWorkout() {
		return "A GolfCoach workout";
	}

	@Override
	public String getDailyFortune() {
		return "GolfCoach " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
