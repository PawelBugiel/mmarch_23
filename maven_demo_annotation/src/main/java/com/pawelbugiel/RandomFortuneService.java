package com.pawelbugiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private List<String> fortuneList = new ArrayList<>();
	private static Random random = new Random();
	
	@Override
	public String getFortune() {
		fortuneList.add("Random fortune #1");
		fortuneList.add("Random fortune #2");
		fortuneList.add("Random fortune #3");
		fortuneList.add("Random fortune #4");
		fortuneList.add("Random fortune #5");
		return fortuneList.get(this.random.nextInt(0,2)); 
	}

}
