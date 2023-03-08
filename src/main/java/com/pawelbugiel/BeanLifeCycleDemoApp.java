package com.pawelbugiel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Class to test a bean scope, which is defined in a .xml file
 * singleton (default scope - single instance for all requests)
 * prototype ( new instance for each request )
 * */

public class BeanLifeCycleDemoApp {

	public static void main(String[] a) {

		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle_ApplicationContext.xml");
		
		// retrieve bean from spring context
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach);
		
		System.out.println(coach2);
		
		context.close();
	}
}
