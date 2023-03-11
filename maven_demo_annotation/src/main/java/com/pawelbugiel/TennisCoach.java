package com.pawelbugiel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tennisCoachBeanID")		// pass bean id
@Component 			// default bean id
public class TennisCoach implements Coach {

	// == fields ==
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	private static final Logger log = LoggerFactory.getLogger(TennisCoach.class);

	// == constructors ==
	
	public TennisCoach() {
		System.out.println("Tennis coach default constructor called..");
	};
	// if a class have only one constructor 
	//@Autowired annotation is redundant till Spring 4.3
//	@Autowired				 
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		log.info(" Log from Tennis Coach, setter method ");
		this.fortuneService = fortuneService;
	}
	
//	@Autowired
	public void someMethodToDI(FortuneService fortuneService) {
		log.info(" Log from Tennis Coach, someMethodToDI method ");
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
