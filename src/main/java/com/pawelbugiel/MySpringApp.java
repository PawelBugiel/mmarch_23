package com.pawelbugiel;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

//	public static final Logger log = LoggerFactory.getLogger(MySpringApp.class);

	public static void main(String[] args) {

//		log.info("-- Spring in action --");

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(coach.getDailyWorkout() + "\n" + coach.getDailyFortune());

		coach = context.getBean("myCricketCoach", Coach.class);

		System.out.println(coach.getDailyWorkout() + "\n" + coach.getDailyFortune());
		System.out.println(coach);
		System.out.println("++++++++++++++++++++++");

		coach = context.getBean("myHandBallCoach", Coach.class);
		System.out.println(coach);

		System.out.println("--------------------------");

		coach = context.getBean("myGolfCoach", Coach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		

		// close the context
		context.close();

	}

}
