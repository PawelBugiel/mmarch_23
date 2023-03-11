package com.pawelbugiel;

import org.springframework.stereotype.Component;

@Component        
// a default bean name in this case will be RESTFortuneService
// because first two signs are  
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService called..";
	}

}
