package com.just.examples;

public class TestBike extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new TestBike();
		obj.run();
		obj.changeGear();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike one is running");
	}

}
