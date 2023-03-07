package com.pawelbugiel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandBallCoach implements Coach {
	
	// == fields == 
		private FortuneService fortuneService;
		private String emailAddress;
		private String team;
		
		private Logger log = LoggerFactory.getLogger(CricketCoach.class);

		public HandBallCoach() {
			log.info("HandBallCoach constructor called..");
		};

		public void setEmailAddress(String emailAddress) {
			log.info("HandBallCoach emailAddress setter method called ..");
			this.emailAddress = emailAddress;
		}

		public void setTeam(String team) {
			log.info("HandBallCoach team setter method called ..");
			this.team = team;
		}

		@Override
		public String getDailyWorkout() {

			return "HandBallCoach getDailyWorkout() call";
		}

		@Override
		public String getDailyFortune() {

			return "HandBallCoach.class" + fortuneService.getFortune();
		}

		public void setFortuneService(FortuneService fortuneService) {
			log.info("HandBallCoach fortuneService setter method called ..");
			this.fortuneService = fortuneService;
		}

		@Override
		public String toString() {
			return "\nHandBallCoach \n[emailAddress=" + emailAddress + ",\n team=" + team + "]";
		}

}
