package com.just.examples;

public abstract class MyAbstractClass {
	private static int der[]=new int[2];
	public abstract void doin();
	static void doing()
	{
		der[1]=3;
		System.out.println(der[1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		der[0]=1;
		System.out.println(der[0]);
		doing();
}
}
