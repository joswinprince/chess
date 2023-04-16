package com.interfaceex;

import java.util.Random;
import java.util.function.IntBinaryOperator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new calc();
		System.out.println("using calc class"); 
		System.out.println(c.calculate(2, 2));
		
		// lambda avoids calc class
		Calculator c1 =(int x,int y)->{ 
			Random r= new Random();
			int a = r.nextInt(100);
			return a*x*y;
		};
		System.out.println("Avoiding calc class"); 
		System.out.println(c1.calculate(23, 21)); 

		// using util.function 
		IntBinaryOperator b1 =(int x,int y)->{ 
			Random r= new Random();
			int a = r.nextInt(100);
			return a*x*y;
		};
		System.out.println("using IntBinary operator functino"); 
		System.out.println(b1.applyAsInt(12, 31)); 
		
		
	}

}
