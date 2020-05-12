package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {
	Random r = new Random();


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String[] fortuneArr = {"F1","F2","F3"};
		int low = 0;
		int high = 2;
		int result = r.nextInt(high-low) + low;
		return fortuneArr[result];
	}

}
