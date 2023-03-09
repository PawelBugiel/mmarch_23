package com.pawelbugiel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
	
		// read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		coach = context.getBean("poloCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
