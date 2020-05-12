package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setter method called"+ emailAddress);
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("setter method called" + team);
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("contructor called");
	};

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter method called");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Fast Bowing";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
