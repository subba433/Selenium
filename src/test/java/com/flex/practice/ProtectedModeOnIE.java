package com.flex.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.flex.utility.Utils;

public class ProtectedModeOnIE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		WebDriver driver = new InternetExplorerDriver(cap);
		
        driver.get("http://www.google.com");
        
        Utils.Wait(2);
		
		String title=driver.getTitle();
		System.out.println("The page title is:" + title);
		
		//driver.quit();

	}

}
