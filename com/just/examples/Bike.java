package com.just.examples;

public abstract class Bike {
Bike()
{
System.out.println("Bike created");
}
abstract void run();
void changeGear()
{
	System.out.println("Shifting gear");
}
}
