package com.flex.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {
		
		// Reversing of words in string
		
		String str="Welcome to Selenium";
		
		String rev="";
		
		String[] words=str.split(" ");
		
		for (int i=words.length-1; i>=0; i--)
		{
			rev= rev + words[i]+ " ";
		}
		
		/*for (String word:words) {
			rev=rev + word + " ";
		}*/
      System.out.println(rev);
     
      // remove special chars from string
      
      String s="trwettetr4721346!^%^!%^";
      
      String s1=s.replaceAll("[^a-zA-Z]", "");
      System.out.println(s1);   //will print only alphabetic data
      
      
      String s2=s.replaceAll("[^0-9]", "");
      System.out.println(s2);   //will print only numeric data
      
      String s3=s.replaceAll("[a-zA-Z0-9]", "");
      System.out.println(s3);   //will print only special chars
      
      //Calculate sum of digits in string
      
      String s4="abc123xyz456ab789";
      int sum=0;
      for (int i=0; i <s4.length(); i ++) {
    	  if (Character.isDigit(s4.charAt(i))){
    		  sum=sum+Integer.parseInt(s4.charAt(i)+"");
    		  //sum=sum+s4.charAt(i);
    	  }
    	  
      }
      System.out.println("Sum of the digits is:"+ sum);
      
     //Remove duplicates from string
      
      String s5="Seleniums Programming123";
      
      Set<Character> set=new HashSet<>();
      
      StringBuffer sb=new StringBuffer();
      
      for (int i=0;i<s5.length();i++) {
    	  Character c=s5.charAt(i);
    	  
    	  if(!set.contains(c)) {
    		  set.add(c);
    		  sb.append(c);
    	  }
      }
      
      System.out.println("String without duplicates is: " + sb);
      
      //Swap 2 strings without using temp variable
      
      String s6="Java";
      String s7="Selenium";
      
      s6=s6+s7;
      s7=s6.replaceAll(s7, "");
      s6=s6.replaceAll(s7,"");
      
      System.out.println("After swapping S6 is: "+ s6);
      System.out.println("After swapping S7 is: "+ s7);
      
      //Calculate sum of number in string
      
      String s8="happy123 n345ew year456 abc";
      int num=0;
      String[] a=s8.split(" ");
      
      for (String c:a)
      {
    	String c1=c.replaceAll("[^0-9]", "");
    	 if (!c1.isEmpty()) {
    	 num=num+ Integer.parseInt(c1); }
      }
      
      System.out.println("Sum of number is: "+ num);
      
      //Print the duplicate characters in string using Map
      
      String s9="Java Programming";
      
      Map<Character, Integer> map=new HashMap<>();
      
      for (int i=0; i<s9.length(); i++) {
    	  char c=s9.charAt(i);
    	  if(map.containsKey(c)) {
    		  map.put(c, map.get(c)+1);}
    		  else {
    			  map.put(c, 1);
    		  }
           }
      
     Set <Character> set1=map.keySet();
     
     for (char c:set1) {
    	 if (map.get(c)>1) {
    		 System.out.println(c +" repeated "+ map.get(c) +" times");
    	 }
     }
      
      //Print the sum of numbers in the string  2nd approach
     
     String str1="abc123xyz234def345";
     
     int count=0;
     int sum1=0;
     boolean isdigit=false;
     int len=str1.length();
     for(int i=0;i<len; i++) {
    	 if(Character.isDigit(str1.charAt(i))) {
    		count++;
    		isdigit=true;
    	 } else {
    		 if (isdigit) {
    			 //String data=(String) str1.subSequence(i-count,  i);
    			 sum1=sum1+Integer.parseInt(str1.substring(i-count, i));
    			 count=0;
    			 isdigit=false;
    		 }
    	 }
     }
      
      if(count>0 && isdigit) {
    	  sum1=sum1+Integer.parseInt(str1.substring(len-count, len));
      }
      
      System.out.println("The sum of the numbers is : "+ sum1);
      
      //Check two strings are anagrams or not , it means both string have same chars but in different order
      //Process: take two string, store in char array, sort using arrays.sort and compare two arrays.
      
      String str2="java";
      String str3="aavj";
      
      char[] a1=str2.toCharArray();
      char[] a2=str3.toCharArray();
      
      Arrays.sort(a1);
      Arrays.sort(a2);
      
      boolean result=Arrays.equals(a1, a2);
      
      if (result) {
    	  System.out.println("Both the arrays are anagrams");
      } else {
    	  System.out.println("Both the arrays are not anagrams");
      }
      
  /////////////////////////////////////////////////////////////////////////////    
	}
}
