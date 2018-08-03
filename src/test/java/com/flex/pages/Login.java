package com.flex.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flex.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Login extends BaseClass {
	private static WebElement element = null;
	
		public Login(WebDriver driver, ExtentTest logger) throws IOException {
		super(driver, logger);
		// TODO Auto-generated constructor stub
	}

		public static WebElement txtbxUserName() throws Exception {
			try {
				element = driver.findElement(By.xpath(p.getProperty("txtbxUserName")));
			System.out.println(p.getProperty("txtbxUserName"));
				Log.info("User Name is found");
			} catch (Exception e) {
				Log.error("User Name is not found");
				throw (e);
			}
			return element;
		}
		
		public static WebElement txtbxPassword() throws Exception {
			try {
				element = driver.findElement(By.xpath(p.getProperty("txtbxPassword")));
			System.out.println(p.getProperty("txtbxPassword"));
				Log.info("Password is found");
			} catch (Exception e) {
				Log.error("Password is not found");
				throw (e);
			}
			return element;
		}
		
		public static WebElement btnLogIn() throws Exception {
			try {
				element = driver.findElement(By.xpath(p.getProperty("btnLogIn")));
			System.out.println(p.getProperty("txtbxPassword"));
				Log.info("Login button is found");
			} catch (Exception e) {
				Log.error("Login button is not found");
				throw (e);
			}
			return element;
		}
		

		
}
