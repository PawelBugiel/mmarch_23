package com.pawelbugiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("tennisCoachBeanID")		// pass bean id
@Component // default bean id
public class TennisCoach implements Coach {

	// == fields ==
	private FortuneService fortuneService;

	// == constructors ==
	// if a class have only one constructor 
	//@Autowired annotation is redundant till Spring 4.3
	@Autowired				 
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " --> Tennis Coach";
	}
	
}
