package com.design.patterns;

public class CycleFactory {
public cycle Createcycle(String name)
{
	if(name =="Avon")
	{
		return new AvonCycle();
	}
	if(name =="Hercules")
	{
		return new HerculesCycle();
	}
	
	return null;
}
}
