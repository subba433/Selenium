package com.flex.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.get("https://www.redbus.in/");
	        driver.findElement(By.id("src")).sendKeys("Hyd");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	        driver.findElement(By.id("src")).clear();
	        driver.findElement(By.id("src")).sendKeys("Hyd");
	        Thread.sleep(2000);
	        List<WebElement> from=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
	        System.out.println(from.size());
	        
	        for(WebElement e:from) {
	        	System.out.println(e.getText());
	        }
	}

}
