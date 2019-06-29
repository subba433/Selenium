package com.flex.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import com.flex.pages.Redbus;
import com.flex.utility.Constant;


public class sample{

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Constant.Path_TestData + Constant.File_TestData);
		//Redbus.display();
		
		String in = "This is my text.\n\nAnd here is a new line";
		System.out.println(in);

		String out = in.replaceAll("\n","");
		System.out.println(out);
		

	}

}
