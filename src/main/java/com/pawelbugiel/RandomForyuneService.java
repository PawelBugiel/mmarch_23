package com.pawelbugiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomForyuneService implements FortuneService {
	
	private List<String> happyFortunesList = new ArrayList<>();
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		setUpList();
		int randomInt = this.random.nextInt(0,3);
		System.out.println(randomInt);
		return happyFortunesList.get(randomInt);
	}
	
	// == private methods ==
		private List<String> setUpList() {
			happyFortunesList.add("happy fortune from list #1");
			happyFortunesList.add("motivation fortune from list #2");
			happyFortunesList.add("some fortune from list #3");
			return happyFortunesList;
		}

}
