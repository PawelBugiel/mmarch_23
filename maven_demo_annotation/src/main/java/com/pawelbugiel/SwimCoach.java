package com.pawelbugiel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")      // redundant annotation because sinleton scope is default 
public class SwimCoach implements Coach {
	
	// == fields == 
	@Value("${swim.email}")
	private String email;
	
	@Value("${swim.team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void printFieldsValues() {
		System.out.println(email+ " \n" + team);
	}

}
