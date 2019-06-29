package com.flex.practice;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumbers(1);

	}
	public static void PrintNumbers(int num) {
		if (num<=10) {
			System.out.println(num);
			PrintNumbers(num+1);
		}
	}

}
