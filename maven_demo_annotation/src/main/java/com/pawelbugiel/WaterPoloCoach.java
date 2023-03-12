package com.pawelbugiel;

public class WaterPoloCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public WaterPoloCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "WaterPolo daily workout called..";
	}

	@Override
	public String getDailyFortune() {
		return "Water Polo daily fortune called.. " + this.fortuneService.getFortune() ;
	}

}
