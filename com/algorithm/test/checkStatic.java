package com.algorithm.test;

public class checkStatic {
	
	 int a =5;
	static
	{
		System.out.println("From static");
	}
	
	static String method1()
	{
		 System.out.println("From static method");
		 return "Nothing";
	}
	
	public static void main(String[] args) {
		checkStatic cs = new checkStatic();
	}
}
