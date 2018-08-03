package com.flex.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.flex.utility.ReadObjects;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public static ExtentTest logger;
	public static Properties p;
	public static Properties p1;
	
	public  BaseClass(WebDriver driver,ExtentTest logger)throws IOException{
		BaseClass.driver = driver;
		BaseClass.logger = logger;
		BaseClass.bResult = true;
		BaseClass.p = ReadObjects.getObjectRepository("Object.properties");
		BaseClass.p1 = ReadObjects.getObjectRepository("objectRepoForFlexFront.properties");
	}

}
