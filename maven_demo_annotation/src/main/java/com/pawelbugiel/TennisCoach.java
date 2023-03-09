package com.pawelbugiel;

import org.springframework.stereotype.Component;

//@Component("tennisCoachBeanID")		// pass bean id
@Component								// default bean id
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Tennis Workout";
	}

}
