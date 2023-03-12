package com.pawelbugiel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotationBeanDefinedMain {

	public static void main(String[] args) {

		// create a context 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean 
		Coach coach = context.getBean("waterPoloCoach", Coach.class);
		
		// use the bean 
		System.out.println(coach.getDailyFortune());
		System.out.println(coach);
		

		// close the context 
		context.close();
	}

}
