package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach Coach = context.getBean("cricketCoach",CricketCoach.class);
		System.out.println(Coach.getDailyWorkout());
		System.out.println(Coach.getFortune());
		System.out.println(Coach.getTeam());
		System.out.println(Coach.getEmailAddress());
		context.close();
	}

}
