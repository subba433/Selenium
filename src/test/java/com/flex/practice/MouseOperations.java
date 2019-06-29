package com.flex.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(4000);
        
       WebElement Category= driver.findElement(By.xpath("//*[text()='Category']"));
       
       Actions act=new Actions(driver);
       act.moveToElement(Category).build().perform();
       
       Thread.sleep(2000);
       
      WebElement MensFashion= driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[8]/span"));
      
      act.moveToElement(MensFashion).build().perform();
      
      Thread.sleep(2000);
      
      WebElement shirts=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[8]/div[1]/div[1]/a[3]/span"));
      
      act.moveToElement(shirts).click().build().perform();
      Thread.sleep(2000);
      
      //right click operation
      
      WebElement TodayDeals=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]"));
      
      act.moveToElement(TodayDeals).contextClick().build().perform();
       

	}

}
