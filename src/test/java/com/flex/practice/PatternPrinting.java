package com.flex.practice;

public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rc=5;
		int s=rc-1;
		
		for (int i=1; i<=rc ; i++) {
			 for (int j=1; j<=s; j++) {
				 System.out.print(" "); }
			 for(int k=1; k<=(2*i)-1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 s--;
		}
      
	}

}
