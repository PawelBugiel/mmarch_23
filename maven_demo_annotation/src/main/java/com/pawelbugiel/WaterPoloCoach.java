package com.pawelbugiel;

import org.springframework.beans.factory.annotation.Value;

public class WaterPoloCoach implements Coach {
	
	// == fields ==
	
	private FortuneService fortuneService;
	
	// inject values to fields 
	@Value("${waterpolo.email}")
	private String email;
	
	@Value("${waterpolo.team}")
	private String team;
	
	// == constructors ==
	
	public WaterPoloCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// == public methods ==
	
	@Override
	public String getDailyWorkout() {
		return "WaterPolo daily workout called..";
	}

	@Override
	public String getDailyFortune() {
		return "Water Polo daily fortune called.. " + this.fortuneService.getFortune() ;
	}
	
	public void printEmailAndTeam() {
		StringBuilder sb = new StringBuilder("Water Polo email is : ");
		sb.append(this.email);
		sb.append("\nWater Polo team is : ");
		sb.append(this.team);
		System.out.println(sb);
	}

	@Override
	public String toString() {
		return "WaterPoloCoach [fortuneService=" + fortuneService + ", "
				+ "\nemail=" + email + ", "
						+ "\nteam=" + team + "]";
	}
	
	

}
