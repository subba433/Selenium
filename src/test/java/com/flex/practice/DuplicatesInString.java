package com.flex.practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> tiger =new HashMap<Character, Integer>();
		
		String str="Java Programmingmming";
		
		char[] chr=str.toCharArray();
		
		for (char c: chr) {
			
			if(tiger.containsKey(c)) {
				tiger.put(c, tiger.get(c)+1);
			} else tiger.put(c, 1);
		}
		
      Set <Character> setchar=tiger.keySet();
      
      System.out.println("The duplicate char count in string is: "+ str);
      
      for (char c:setchar) {
    	  if (tiger.get(c)>1)  {
    		  System.out.println(c + "  "+ tiger.get(c));
    	  }
      }
      
	}

}
