package com.flex.practice;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Properties p = new Properties();
		//String path=System.getProperty("user.dir")+"\\com\\flex\\objectproperties\\Object.properties";
		//p.load(path);
		driver.get("https://www.redbus.in");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("dest")).sendKeys("Markapuram");
		driver.findElement(By.id("dest")).click();
		String str1="document.querySelector('input[id=onward_cal]').value='30-Jul-2018'";
		//input[id=onward_cal]
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript(str1);
		Thread.sleep(2000);
		js.executeScript("document.querySelector('#return_cal').value='31-Jul-2018'");
		

	}

}
