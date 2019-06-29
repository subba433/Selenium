package com.flex.practice;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		int rev=0;
		
		while (x>0) {
			rev=rev * 10 + x%10;
			System.out.println("rev is:\t"+rev);
			x=x/10;
			System.out.println("X value is:   "+x);
		}
		
		System.out.println("Reverse of the number is: "+rev);

	}

}
