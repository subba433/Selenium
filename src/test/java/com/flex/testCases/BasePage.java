package com.flex.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import com.flex.pages.AccountFileSummaryPage;
import com.flex.utility.Log;
import com.flex.utility.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage
{
	public static ExtentReports report;	
	
	//public ExtentTest logger;
	@BeforeSuite
	public static void beforeSuite() throws Exception
	{
		try
		{
			report = Utils.generateReports();
		}
		catch (Exception e)
		{
			//throw (e);
			Log.error("Class BasePage | Method beforeSuite | Exception desc : "+e.getMessage());
		}
	}

	public static ExtentReports getReport()
	{
		return report;
	}

	@AfterSuite
	public static void afterSuite()
	{
		try
		{
			report.flush();
		} catch (Exception e)
		{
			//throw (e);
			Log.error("Class BasePage | Method afterSuite | Exception desc : "+e.getMessage());
		}

	}
	
	
}
