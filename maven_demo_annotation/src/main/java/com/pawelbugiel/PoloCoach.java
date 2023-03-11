package com.pawelbugiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class PoloCoach implements Coach {
	
//	@Autowired
//	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	public PoloCoach() {
		System.out.println(">> PoloCoach constructor called..");
	}
	
	// using qualifier within the constructor
	@Autowired
	public PoloCoach(@Qualifier("fileFortuneService")FortuneService fortuneService) {
		System.out.println(">> PoloCoach constructor called..");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "PoloCoach workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " --> Polo fortune";
	}

}
