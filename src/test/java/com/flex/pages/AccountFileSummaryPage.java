package com.flex.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flex.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class AccountFileSummaryPage extends BaseClass {
	private static WebElement element = null;

	public AccountFileSummaryPage(WebDriver driver, ExtentTest logger) throws IOException {
		super(driver, logger);
	}

	public static WebElement txtAccountNumber() throws Exception {
		try {
			element = driver.findElement(By.id(p.getProperty("txtAccountNumber")));
			Log.info("txtAccountNumber is found");
		} catch (Exception e) {
			Log.error("txtAccountNumber is not found");
			throw (e);
		}
		return element;
	}
}
