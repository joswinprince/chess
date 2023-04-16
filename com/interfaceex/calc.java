package com.interfaceex;

import java.util.Random;

public class calc implements Calculator {

	@Override
	public int calculate(int x, int y) {
		// TODO Auto-generated method stub
		Random number = new Random();
		int ans = number.nextInt(50);
		
		return x*y+ans;
	}

}
