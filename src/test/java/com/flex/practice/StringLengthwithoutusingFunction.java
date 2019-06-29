package com.flex.practice;

public class StringLengthwithoutusingFunction {

	public static void main(String[] args) {
		// Find length of the string withour using String Length
		
		String str="Welcome to Selenium";
		int count=0;
		
		char[] ch=str.toCharArray();  //convert to char array
		
		for (char c:ch) {
			count++;
		}
		
      System.out.println("Length of the string is:"+count);
	}

}
