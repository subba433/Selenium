package com.flex.practice;

public class NumberPrograms {

	public static void main(String[] args) {
		// Swap two numbers with out using temp variable
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of A is: "+ a);
		System.out.println("The value of B is: "+ b);
		
      //Reverse the number
		int x=12345;
		int rev=0;
		
		while (x>0) {
			rev=rev * 10 + x%10;
			x=x/10;
		}
		
		System.out.println("Reverse of the number is :"+ rev);
		
		//Remove duplicates from integer array
		int[] a1= {1,2,3,4,5,4,5};
		int l=a1.length;
		
		for (int i=0; i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a1[i]==a1[j]) {
					a1[j]=a1[l-1];
					l--;
				}
			}
		}
		
		System.out.println("Final Integer array is :");
		for (int k=0; k<l;k++) {
			System.out.print(a1[k]+" ");
		}
		System.out.println();
		
		
		//Remove duplicates from string array
				String[] b1= {"abc","xyz","abc","123","xyz","subba"};
				int l1=b1.length;
				
				for (int i=0; i<l1;i++) {
					for (int j=i+1;j<l1;j++) {
						if(b1[i].equalsIgnoreCase(b1[j])) {
							b1[j]=b1[l1-1];
							l1--;
						}
					}
				}
				System.out.println("Final String array is :");
				for (int k=0; k<l1;k++) {
					System.out.print(b1[k]+" ");
				}
		
		
		
///////////////////////////////////////////////////////////////////////		
	}
}
