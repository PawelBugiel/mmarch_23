package com.pawelbugiel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Class to test a bean scope, which is defined in a .xml file
 * singleton (default scope - single instance for all requests)
 * prototype ( new instance for each request )
 * */

public class BeanScopeDemoApp {

	public static void main(String[] a) {

		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_ApplicationContext.xml");
		
		// retrieve bean from spring context
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach coachTwo = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach);
		System.out.println(coachTwo);
		
		boolean result = coach == coachTwo;
		System.out.println(result);
		
		context.close();
	}
}
