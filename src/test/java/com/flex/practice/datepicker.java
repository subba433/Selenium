package com.flex.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	public static Properties p;
	public static FileInputStream fis;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		p= new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\flex\\objectproperties\\Sample.properties");
		p.load(fis);
		
	    //System.out.println(p.getProperty("Onward"));
		//Properties p = new Properties();
		//String path=System.getProperty("user.dir")+"\\com\\flex\\objectproperties\\Object.properties";
		//p.load(path);
		driver.get("https://www.redbus.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Markapuram");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
	     WebElement r1=driver.findElement(By.xpath(p.getProperty("Rxpath")));
	     
	     
	     selectbyCSS(driver, p.getProperty("Onward"), p.getProperty("Sdate"));
	     selectbyCSS(driver, p.getProperty("Return"), p.getProperty("Rdate"));
	
	     //Select by ID
	     selectbyID(driver, p.getProperty("Oid"), p.getProperty("Sdate"));
	     selectbyID(driver, p.getProperty("Rid"), p.getProperty("Rdate"));
		
	}
     public static void selectbyCSS(WebDriver driver, String css, String date) throws InterruptedException{
    	 
    	JavascriptExecutor js= (JavascriptExecutor) driver;
    	Thread.sleep(2000);
 		js.executeScript("document.querySelector('"+css+"').value='"+date+"'");
     }
     
     
     public static void selectbyID(WebDriver driver, String id, String date) throws InterruptedException{
    	 
     	JavascriptExecutor js= (JavascriptExecutor) driver;
  		Thread.sleep(2000);
  	   js.executeScript("document.getElementById('"+id+"').value='"+date+"'");	    	 
      }
      
     public static void selectJS(WebDriver driver, WebElement element, String date) throws InterruptedException{
    	 
     	JavascriptExecutor js= (JavascriptExecutor) driver;
  		//js.executeScript(str1);
  		js.executeScript("arguments[0].setAttribute('value', '31-Jul-2018');", element);
  		Thread.sleep(2000);
  		//js.executeScript("document.querySelector('#return_cal').value='31-Jul-2018'");	 
     	 
      }
     
}
