package com.pawelbugiel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotationMain {

	public static void main(String[] args) {
		
		// read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach coach = context.getBean("poloCoach", Coach.class);
		
		// invoke a method on the bean 
		System.out.println(coach.getDailyFortune() + " .oO|Oo.");
		
		// close the context
		context.close();
		
	}

}
