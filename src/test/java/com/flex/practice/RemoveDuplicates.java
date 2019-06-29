package com.flex.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Seleniums Programming";
		
		Set <Character> set = new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		
		for (int i=0; i<str.length(); i++) {
			
			Character c=str.charAt(i);
			if (!set.contains(c)) {
				
			  set.add(c);
			  sf.append(c);
			}
			
		}
       System.out.println(sf.toString());
	}

}
