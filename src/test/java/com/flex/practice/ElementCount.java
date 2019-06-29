package com.flex.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://demo.automationtesting.in/Register.html");
        
       List<WebElement> dropdown=driver.findElements(By.tagName("Select"));
       
       
       System.out.println("number of dropdown boxes are: "+dropdown.size());
       
       List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
       
       System.out.println("number of radio buttons  are: "+radio.size());
       
        List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
       
       System.out.println("number of check buttons  are: "+check.size());
       
       driver.close();
      
	}

}
