package com.flex.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flex.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Facebook extends BaseClass {
	private static WebElement element = null;

	public Facebook(WebDriver driver, ExtentTest logger) throws IOException {
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
