package com.interfaceex;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		Predicate<Integer> pr = a->(a>18);
		System.out.println(pr.test(12));
		
		MyPredicate<Integer> mpr = b->(b>18);
		System.out.println(mpr.test(19));
	}
}
