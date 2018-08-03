package com.flex.actions;
import com.flex.pages.BaseClass;
import com.flex.utility.*;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
public class BaseActions extends BaseClass {
	private static String title = null;
	
	public BaseActions(WebDriver driver,ExtentTest logger) throws IOException{
    	super(driver,logger);
	}
	public static String getTitle() throws Exception{
		try{
			title= driver.getTitle();
	        Log.info("Title of the page is" + title);
		}catch (Exception e){
	   		Log.error("Title is not found on the Page");
	   		throw(e);
	   		}
	   	return title;
	    }
		
		
}

