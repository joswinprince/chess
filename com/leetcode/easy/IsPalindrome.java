package com.leetcode.easy;

public class IsPalindrome {
	public static int reverse(int n)
	{
		int reverse = 0,r;
		while(n!=0)
		{
			reverse = reverse * 10 + (n % 10);
			n = n/10;
		}
		
		return reverse;
		
	}
	public static boolean isPalindrome(int x) {
		//avoids negative numbers
		if (x < 0) {return false;}
		if (x == reverse(x))
		{
			return true;
		}
	return false;
	}
	public static void main(String[] args) {
		
	System.out.println(isPalindrome(-838));
}
}
