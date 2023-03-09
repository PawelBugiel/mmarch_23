package com.pawelbugiel;

import org.springframework.stereotype.Component;

@Component
public class PoloCoach implements Coach {
	
	public PoloCoach() {
		System.out.println(">> PoloCoach constructor called..");
	}

	@Override
	public String getDailyWorkout() {
		return "PoloCoach workout";
	}

}
