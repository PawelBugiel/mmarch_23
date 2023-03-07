package com.pawelbugiel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CricketCoach implements Coach {
	
	// == fields == 
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	private Logger log = LoggerFactory.getLogger(CricketCoach.class);

	public CricketCoach() {
		log.info("CricketCoach constructor called..");
	};

	public void setEmailAddress(String emailAddress) {
		log.info("CricketCoach emailAddress setter method called ..");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		log.info("CricketCoach team setter method called ..");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {

		return "Cricket coach getDailyWorkout() call";
	}

	@Override
	public String getDailyFortune() {

		return "Cricket.class" + fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		log.info("CricketCoach fortuneService setter method called ..");
		this.fortuneService = fortuneService;
	}

	@Override
	public String toString() {
		return "\nCricketCoach \n[emailAddress=" + emailAddress + ",\n team=" + team + "]";
	}

	
}
