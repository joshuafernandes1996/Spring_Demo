package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {};
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Track Coach: "+ this.fortuneService.getFortune();
	}
	
	//Init
	public void initMethod() {
		System.out.println("Init Method");
	}
	
	//Destroy
	public void destoryMethod() {
		System.out.println("Destory Method");
	}
}
