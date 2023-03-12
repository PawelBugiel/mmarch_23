package com.pawelbugiel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotationChallengeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ChallengeConfig.class);
		
		Coach coach = context.getBean("volleyballCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		
	}

}
