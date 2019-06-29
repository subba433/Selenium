package com.flex.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://demo.automationtesting.in/Windows.html");
        
        driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']")).click();
        
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//button[text()='click']")).click();
       
       Thread.sleep(2000);
        System.out.println("Main window title:"+driver.getTitle());
        
        String parent=driver.getWindowHandle();
        
        Set<String> handles=driver.getWindowHandles();
        
        for (String s:handles) {
        	if(!parent.equals(s)) {
        		driver.switchTo().window(s);
        		System.out.println("Child window title:"+driver.getTitle());
        	}
        }
        driver.close();
        driver.switchTo().window(parent);
        
        System.out.println("Main window title:"+driver.getTitle());
        

	}

}
