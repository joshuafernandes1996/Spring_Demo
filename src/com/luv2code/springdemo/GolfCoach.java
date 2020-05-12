package com.luv2code.springdemo;

public class GolfCoach implements Coach {
	
	private RandomFortune fortuneService;
	
	public GolfCoach(RandomFortune theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Golf Practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
