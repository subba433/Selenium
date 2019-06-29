package com.flex.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://demo.automationtesting.in/Register.html");
        
        //enter first name
        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("abc123");
        
        //enter last name
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("xyz123");
        
        //enter text area
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("abccdefghijklmno123456");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@xyz.com");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234562233");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[1]/input")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
        
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(2000);
        
        List<WebElement> lang=driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//ul//li/a"));
        
        System.out.println(lang.size());
        
        for (WebElement e:lang) {
			if (e.getText().equalsIgnoreCase("Thai")) {
				e.click();
				//break;
			}
		}
        
        //
        
        Select skill=new Select(driver.findElement(By.id("Skills")));
        
        skill.selectByIndex(1);
        
        Thread.sleep(2000);
        skill.selectByVisibleText("CSS");
        
        Thread.sleep(2000);
        skill.selectByValue("Adobe InDesign");
        
        
        Select country=new Select(driver.findElement(By.id("countries")));
        
        country.selectByIndex(1);
        
        Thread.sleep(2000);
        Select year=new Select(driver.findElement(By.id("yearbox")));
        
        year.selectByValue("1920");
        
        Thread.sleep(2000);
        Select month=new Select(driver.findElement(By.xpath("//*[@ng-model='monthbox']")));
        
        month.selectByIndex(2);
        
        Thread.sleep(2000);
        Select day=new Select(driver.findElement(By.id("daybox")));      
        day.selectByValue("20");
        
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Abc123");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Abc123");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
          

	}

}
