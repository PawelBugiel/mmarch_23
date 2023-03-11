package com.pawelbugiel;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")      // redundant annotation because sinleton scope is default 
public class SwimCoach implements Coach {
	
	// == fields == 
	
	@Value("${swim.email}")
	private String email;
	
	@Value("${swim.team}")
	private String team;

	// == public methods ==
	
	@PostConstruct
	public void itIsAPostConstructMethod() {
		System.out.println("PostConstruct method called..");
		for (int i = 0; i < 6; i++) {
			System.out.println("Count to 5 ;) " + i);
		}
	}
	
	@PreDestroy
	public void theSwimCoachPreDestroyMethod() {
		System.out.println("Pre Destroy method called...oOo..");
	}
	
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
