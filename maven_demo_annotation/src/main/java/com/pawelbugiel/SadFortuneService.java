package com.pawelbugiel;


public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sad fortune service -> getFortune() called";
	}

}
