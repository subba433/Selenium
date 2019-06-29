package com.flex.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flex.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Redbus extends BaseClass {
	private static WebElement element = null;

	public Redbus(WebDriver driver, ExtentTest logger) throws IOException {
		super(driver, logger);
	}
	
	public static void display(){
		System.out.println(p.getProperty("firstname"));
		System.out.println(p.getProperty("lastname"));
	}

	public static WebElement Firstname() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("firstname")));
		System.out.println(p.getProperty("firstname"));
			Log.info("Firstname is found");
		} catch (Exception e) {
			Log.error("Firstname is not found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lastname() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("lastname")));
			Log.info("Lastname is found");
		} catch (Exception e) {
			Log.error("Lastname is not found");
			throw (e);
		}
		return element;
	  }
	
	public static WebElement Search_Button() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("Search_Button")));
			Log.info("Search_Button is found");
		} catch (Exception e) {
			Log.error("Search_Button is not found");
			throw (e);
		}
		return element;
	  } //
	
	public static WebElement Modify_Button() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("Modify_Button")));
			Log.info("Modify_Button is found");
		} catch (Exception e) {
			Log.error("Modify_Button is not found");
			throw (e);
		}
		return element;
	  } 
	public static String Onward() throws Exception {
		String onward=null;
		try {
			 onward=p.getProperty("Onward");
			System.out.println(onward);
			Log.info("Onward is found");
		} catch (Exception e) {
			Log.error("Onward is not found");
			throw (e);
		}
		return onward;
	  }
	
	public static String Return() throws Exception {
		String Return=null;
		try {
			Return = p.getProperty("Return");
			System.out.println(Return);
			Log.info("Return is found");
		} catch (Exception e) {
			Log.error("Return is not found");
			throw (e);
		}
		return Return;
	  }
	
	public static String StartDate() throws Exception {
		String startDate=null;
		try {
			startDate = p.getProperty("StartDate");
			System.out.println(element);
			Log.info("StartDate is found");
		} catch (Exception e) {
			Log.error("StartDate is not found");
			throw (e);
		}
		return startDate;
	  }
	
	public static String ReturnDate() throws Exception {
		String returnDate=null;
		try {
			returnDate = p.getProperty("ReturnDate");
			System.out.println(element);
			Log.info("ReturnDate is found");
		} catch (Exception e) {
			Log.error("ReturnDate is not found");
			throw (e);
		}
		return returnDate;
	  }
	
	public static WebElement ReturnDate123() throws Exception {
		try {
			element = driver.findElement(By.cssSelector(p.getProperty("ReturnDate")));
			System.out.println(element);
			Log.info("ReturnDate is found");
		} catch (Exception e) {
			Log.error("ReturnDate is not found");
			throw (e);
		}
		return element;
	  }
	
	
	
	
	
	
	public static WebElement Email() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("email")));
			Log.info("Email is found");
		} catch (Exception e) {
			Log.error("Email is not found");
			throw (e);
		}
		return element;
	  }
	
	public static WebElement Password() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("password")));
			Log.info("Password is found");
		} catch (Exception e) {
			Log.error("Password is not found");
			throw (e);
		}
		return element;
	  }
	
	public static WebElement Year() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("year")));
			Log.info("Year is found");
		} catch (Exception e) {
			Log.error("Year is not found");
			throw (e);
		}
		return element;
	  }
	
	public static WebElement Gender() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("gender")));
			Log.info("Gender is found");
		} catch (Exception e) {
			Log.error("Gender is not found");
			throw (e);
		}
		return element;
	  }

	public static WebElement Signup() throws Exception {
		try {
			element = driver.findElement(By.xpath(p.getProperty("signup")));
			Log.info("Signup is found");
		} catch (Exception e) {
			Log.error("Signup is not found");
			throw (e);
		}
		return element;
	  }

	
	
	
	
	
	
}
