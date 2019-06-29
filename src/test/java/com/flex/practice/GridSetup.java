package com.flex.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSetup {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String huburl="http://localhost:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(huburl), options);
		
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("The page title is:" + title);
		
		driver.quit();
		 

	}

}
