package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GolfApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach Coach = context.getBean("golfCoach",GolfCoach.class);
		System.out.println(Coach.getFortune());
		context.close();
	}

}
