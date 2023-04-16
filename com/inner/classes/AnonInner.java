package com.inner.classes;

public class AnonInner {
abstract class SaleTodayOnly{
	abstract int dollarsoff();
}
public int admission(int baseprice)
{
	SaleTodayOnly sale = new SaleTodayOnly()
			{
		int dollarsoff() {
			return 3; }
		};
			
	return baseprice - sale.dollarsoff();
}
}
