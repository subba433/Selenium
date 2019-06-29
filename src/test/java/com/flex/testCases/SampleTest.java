package com.flex.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.flex.actions.ApplicationSpecificActions;
import com.flex.actions.GenericActions;
import com.flex.actions.LoginActions;
import com.flex.pages.BaseClass;
import com.flex.pages.Redbus;
import com.flex.utility.*;
import com.google.common.base.Strings;

public class SampleTest extends BasePage {

	public WebDriver driver;
	private String testCaseName;
	private int testCaseRow;
	public ExtentTest logger, parentNode;
	private String testName;
	public String claimNumber = null;

	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			this.report = getReport();
			testName = "SystemTest";
			parentNode = report.startTest(testName, "Selenium Demo");

		} catch (Exception e) {
			Log.error("Class ClaimCenter | Method beforeClass | Exception desc : " + e.getMessage());
		}

	}

	@Parameters({"TestCaseName"})
	@BeforeMethod
	public void beforeMethod(String testCaseName) throws Exception {
		try {
			this.testCaseName = testCaseName;
			DOMConfigurator.configure("log4j.xml");
			Log.startTestCase(testCaseName);
			System.out.println(testCaseName);
			System.out.println(Constant.Path_TestData + Constant.File_TestData);
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
					Constant.SpreadSheetName);
			testCaseRow = ExcelUtils.getRowContains(testCaseName, Constant.Col_TestCaseName);
			System.out.println("Row count is " +ExcelUtils.getRowUsed());
			System.out.println("Col count is " +ExcelUtils.getColumnCount());
			driver = Utils.OpenBrowser(testCaseRow, Constant.APP_URL);
			//Thread.sleep(3000);
			logger = report.startTest(testCaseName);
			new BaseClass(driver, logger);

		} catch (Exception e) {
			//Log.error("Method beforeMethod | Exception desc : " + e.getMessage());
			//logger.log(LogStatus.FAIL,"Method beforeMethod | Exception desc : Unexpected Error Occured");
		}

	}

	/*
	 * Feature : F2.100 Create Claims against Flex policies UserStory :
	 * U2.100.20 Create FNOL Author: Subba Reddy Modified on: 24-March-2017
	 * Description: Create Claim from the claim center
	 */
	@Test(priority = 1)
	public void VerifyFaceBookSignup() throws Exception {
		try {
			
			GenericActions.EnterText(testCaseRow, Constant.Col_Source, Redbus.Firstname());
			Utils.Wait(2);
			GenericActions.EnterText(testCaseRow, Constant.Col_Destination, Redbus.Lastname());
			Utils.Wait(2);
			GenericActions.SelectDate(Redbus.StartDate(), Redbus.Onward());
			Utils.Wait(2);
			GenericActions.SelectDate(Redbus.ReturnDate(), Redbus.Return());
			Utils.Wait(2);
			GenericActions.clickActionOnBtn(Redbus.Search_Button());
			Utils.Wait(2);
			GenericActions.ElementExist(Redbus.Modify_Button());
			
			//GenericActions.SelectDate1(testCaseRow, Constant.Col_StartDate, Redbus.Onward());
			//Thread.sleep(2000);
			//GenericActions.SelectDate1(testCaseRow, Constant.Col_ReturnDate, Redbus.Onward());
			
			
			//GenericActions.EnterText(testCaseRow, Constant.Col_Password, Facebook.Password());
			//Thread.sleep(4000);
			//GenericActions.clickActionOnBtn(Facebook.Signup());
			
			
     	} catch (Exception e) {

			Log.error("Class Sampletest | Method Sampletest | Exception desc : " + e.getMessage());
			logger.log(LogStatus.FAIL,
					"Class Sampletest | Method Sampletest | Unexpected Exception Occured");
			String img = logger.addScreenCapture(Utils.getScreenshotPath("Sampletest", "NewSampletest", 1));
			logger.log(LogStatus.FAIL, img);
		}

	}

	
	
	
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		try {
			Log.endTestCase(testCaseName);
			parentNode.appendChild(logger);
			report.endTest(logger);
			 driver.close();
			//driver.quit();

		} catch (Exception e) {
			Log.error("Class ClaimCenter | Method afterMethod | Exception desc : " + e.getMessage());

		} finally {
			//driver.quit();
			// driver.close();
			Log.error("Class ClaimCenter | Method afterMethod | Exception desc : Unexpected Error Occured");
		}
	}

	@AfterClass
	public void afterClass() throws Exception {
		try {
			report.endTest(parentNode);
		} catch (Exception e) {
			Log.error("Class ClaimCenter | Method afterClass | Exception desc : " + e.getMessage());
		}

	}

}
