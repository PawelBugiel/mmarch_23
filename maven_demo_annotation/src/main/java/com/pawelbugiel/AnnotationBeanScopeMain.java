package com.pawelbugiel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeMain {
	
	public static void main(String[] args) {
		
		// load spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		Coach coach2 = context.getBean("swimCoach", Coach.class);
		
		System.out.println("Singleton class address : " + coach);
		System.out.println("Singleton class address : " + coach2);
		
		coach = context.getBean("poloCoach", Coach.class);
		coach2 = context.getBean("poloCoach", Coach.class);
		
		System.out.println("Prototype class address : " + coach);
		System.out.println("Prototype class address : " + coach2);
		
		// close the context 
		context.close();
		
		
	}

}
