package com.flex.actions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.flex.pages.BaseClass;
import com.flex.utility.Constant;
import com.flex.utility.ExcelUtils;
import com.flex.utility.Log;
import com.flex.utility.Utils;
import com.google.common.base.Strings;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenericActions extends BaseClass {
	
	public GenericActions(WebDriver driver,ExtentTest logger) throws IOException{
    	super(driver,logger);
	}
	
	
	
	public static boolean verifyIsDisplayed(WebElement element)throws Exception{
    	boolean elementIsDisplayed = false;
		try{
						if(element.isDisplayed()){
				logger.log(LogStatus.PASS,element.getText() + " is displayed in the screen");
				elementIsDisplayed = true;
			}else{
				logger.log(LogStatus.FAIL,element +  " is not available");
			}   	     			  
		}catch(Exception e){
			   Log.error("Exception Occured" + e.getMessage());
		}
		return elementIsDisplayed;
	}
	
	public static void IsDisplayed(WebElement element)throws Exception{
    	//boolean elementIsDisplayed = false;
		try{
			if(element.isDisplayed()){
				logger.log(LogStatus.PASS,element.getText() + " is displayed in the screen");
				//elementIsDisplayed = true;
			}else{
				logger.log(LogStatus.FAIL,element +  " is not available");
			}   	     			  
		}catch(Exception e){
			   Log.error("Exception Occured" + e.getMessage());
		}
		//return elementIsDisplayed;
	}
	
	
	public static void validateText(int testCaseRow, int Col_Num, WebElement element) throws Exception {
		try {
			String expectedValue=ExcelUtils.getCellData(testCaseRow, Col_Num).trim();
			String actualValue=element.getText().trim();
		
			System.out.println(actualValue);
			if (!Strings.isNullOrEmpty(actualValue) && !Strings.isNullOrEmpty(expectedValue)) {
			if (actualValue.equals(expectedValue)) {
				Log.info("Actual Value -"+actualValue+" is matching with Expected value " +expectedValue);
				logger.log(LogStatus.PASS,"Actual Value -"+actualValue+" is matching with Expected value " + expectedValue);
			} else {
				Log.info("Actual Value -"+actualValue+" is not matching with Expected value " +expectedValue);
				logger.log(LogStatus.FAIL, "Actual Value -"+actualValue+" is not matching with Expected value " + expectedValue);
			}
			}else{
				Log.info( "Value is empty or null");
				logger.log(LogStatus.FAIL, "Value is empty or null");
			}
		} catch (Exception e) {
			Log.error("Exception Occured in Keyword:validateText" + e.getMessage());
		}

	}
	
	
	
	
	public static void verifyLabel(int RowNum,int ColNum,WebElement element)throws Exception{
    	
		try{
			  if(GenericActions.verifyIsDisplayed(element)){
	            	if(!Strings.isNullOrEmpty(ExcelUtils.getCellData(RowNum,ColNum))){
	            		if((element.getText().trim()).equals(ExcelUtils.getCellData(RowNum,ColNum ).trim())){
	            			logger.log(LogStatus.PASS, element.getText() + " is matching with expected value" + ExcelUtils.getCellData(RowNum,ColNum));
	                	}else{
	                		logger.log(LogStatus.FAIL, element.getText() + " is not matching with expected value" + ExcelUtils.getCellData(RowNum,ColNum));
	                	}
	            	}else{
	            		logger.log(LogStatus.FAIL, "Label is null or empty");
	            	}
	            }else{
	        		logger.log(LogStatus.FAIL, "Label is not displayed in the screen");
	        	}
	            
		}catch(Exception e){
			   Log.error("Exception Occured" + e.getMessage());
		}
		
	}
	
	
	
	public static void clickMenuLinkFromSidebar(WebElement element) throws Exception{
		Actions action = new Actions(driver);
		String elementText = null;
		try{
			elementText = element.getText();
			action.moveToElement(element).click().perform();
			Log.info(element + " is clicked ");
			logger.log(LogStatus.PASS, elementText + " menu item is selected successfully");

			
		}catch(Exception e){
			Log.error("unable to click - mousseoveraction for" + element);
			logger.log(LogStatus.FAIL, elementText + " is not found");
			throw (e);
			
		}
	}
	 
	public static void clickActionOnBtn(WebElement element) throws Exception {
		String elementText = null;
		try {
			elementText = element.getText();
			element.click();
			Log.info(elementText + " is clicked successfully");
			

		} catch (Exception e) {
			Log.info("Exception Occured while clicking" + elementText + " and the Exception is" + e.getMessage());

		}

	}
	
	public static void printInnerTextWithDescription(WebElement element, String string) throws Exception{
		String elementText = null;
		try{
			elementText = element.getText();
			logger.log(LogStatus.PASS, string + " " + elementText + " is displayed");
			}catch (Exception e){
				Log.info("Error occured");	
			}
		
	}
	public static void openUrl(int testCaseRow, int Col_Num) throws Exception{
		String url=ExcelUtils.getCellData(testCaseRow, Col_Num).trim();
		try{
			
			// driver.get(p.getProperty("baseUrlBC"));
			driver.get(url);
			 Log.info("Web application BC is launched successfully");
			
		}catch (Exception e){
			Log.info("Exception Occured" + e.getMessage());
			logger.log(LogStatus.FAIL, "Not found");
			
		}
	}
	
	
	public static void selectValueDropDown(int testCaseRow, int Col_Num, WebElement element, String listValues)
			throws Exception {
			try {
			Actions action = new Actions(driver);
			List<WebElement> dropDownValues;
			// String testData = ExcelUtils.getCellData(testCaseRow, Col_Num);
			dropDownValues = element.findElements(By.xpath(p.getProperty(listValues)));
			Log.info("Values of  are fetched from the dropdown");
			boolean offerSelection = false;
			if (!Strings.isNullOrEmpty(ExcelUtils.getCellData(testCaseRow, Col_Num))) {
				for (int i = 0; i < dropDownValues.size(); i++) {
					if ((dropDownValues.get(i).getText().equals(ExcelUtils.getCellData(testCaseRow, Col_Num)))) {
						action.moveToElement(dropDownValues.get(i)).click().perform();
						offerSelection = true;
						break;
					}

				}
				if (offerSelection) {
					Log.info("Value is matched and clicked");
					logger.log(LogStatus.PASS,
							ExcelUtils.getCellData(testCaseRow, Col_Num) + " is selected from dropdown successfully");
				} else {
					Log.info("Value is not matched and clicked");
					logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down for"
							+ ExcelUtils.getCellData(testCaseRow, Col_Num));
				}

			} else {
				Log.info(element.getText() + "is empty or null");
				logger.log(LogStatus.FAIL, ExcelUtils.getCellData(testCaseRow, Col_Num) + " is empty or null");
			}

		} catch (Exception e) {
			Log.info("Exception Occured" + e.getMessage());
			logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down for");
		}

	}
	
	public static void validateDropDownListItems(int testCaseRow,int Col_Num, WebElement element, String dropDownFieldName) throws Exception {
		List<WebElement> dropDownValues;
		// boolean flag=false;
		int numtestDataListValues = 0;
		String exceltestDataListItems = ExcelUtils.getCellData(testCaseRow, Col_Num);
		String[] testDataListValues = exceltestDataListItems.split(",");
					
		try {
			element.click();
			Log.info("drop down field is clicked");
			dropDownValues = element.findElements(By.xpath(p.getProperty("listValues")));
			Log.info("size of drop down list is " +dropDownValues.size() );
			Thread.sleep(2000);
			for (int i = 1; i < dropDownValues.size(); i++) {
				for (int j = 0; j < testDataListValues.length; j++) {
					if ((dropDownValues.get(i).getText().equals(testDataListValues[j]))) {
						numtestDataListValues++;
						Log.info(testDataListValues[j] + " is  found in the list");
						break;
					}
				}
			}
			Thread.sleep(2000);
			dropDownValues.get(0).click();
			if (numtestDataListValues == testDataListValues.length) {
				System.out.println("matched");
				Log.info("List items: " + exceltestDataListItems+  "are present in the  dropdown list");
				logger.log(LogStatus.PASS,
						"List items: " + exceltestDataListItems+  " are present in "+ dropDownFieldName +" dropdown list");

			} else {
				System.out.println("not matched");
				Log.info("Some List items are missing in dropdown list");
				logger.log(LogStatus.FAIL,
						"Some List items are missing in dropdown list");
			}

		} catch (Exception e) {
			Log.error("Exception Occured" + e.getMessage());
		}
	}
	
	public static void selectFirstValueFromDropDown(WebElement element, String listValues) throws Exception {
		String elementText = null;
		try {
			
			elementText = element.getText();
			element.click();
			Log.info(elementText + " is clicked successfully");
			Actions action = new Actions(driver);
			List<WebElement> dropDownValues;
			// String testData = ExcelUtils.getCellData(testCaseRow, Col_Num);
			
			dropDownValues = element.findElements(By.xpath(p.getProperty(listValues)));
			Log.info("Values of  are fetched from the dropdown");
			action.moveToElement(dropDownValues.get(1)).click().perform();
			logger.log(LogStatus.PASS, "selected from dropdown successfully");

		} catch (Exception e) {
			Log.info("Exception Occured" + e.getMessage());
			logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down");
		}

	}
	
public static void validateWebElement(int testCaseRow,int ColNum,WebElement element)throws Exception{
    	
		try{
			  if(GenericActions.verifyIsDisplayed(element)){
	            	if(!Strings.isNullOrEmpty(ExcelUtils.getCellData(testCaseRow,ColNum))){
	            		if((element.getText().trim()).equals(ExcelUtils.getCellData(testCaseRow,ColNum ).trim())){
	            			logger.log(LogStatus.PASS, element.getText() + " is matching with expected value " + ExcelUtils.getCellData(testCaseRow,ColNum));
	            			Log.info(element.getText()+" is selected");
	                	}else{
	                		logger.log(LogStatus.FAIL, element.getText() + " is not matching with expected value " + ExcelUtils.getCellData(testCaseRow,ColNum));
	                	}
	            	}else{
	            		logger.log(LogStatus.FAIL, "Label is null or empty");
	            	}
	            }else{
	        		logger.log(LogStatus.FAIL, "Label is not displayed in the screen");
	        	}
	            
		}catch(Exception e){
			   Log.error("Exception Occured" + e.getMessage());
		}
		
	}

public static void validateWebElementForCancel(int testCaseRow,int ColNum,WebElement element)throws Exception{
	
	try{
		  if(GenericActions.verifyIsDisplayed(element)){
            	if(!Strings.isNullOrEmpty(ExcelUtils.getCellData(testCaseRow,ColNum))){
            		if((element.getText().trim()).contains(ExcelUtils.getCellData(testCaseRow,ColNum ).trim())){
            			logger.log(LogStatus.PASS, element.getText() + " is matching with expected value " + ExcelUtils.getCellData(testCaseRow,ColNum));
            			Log.info(element.getText()+" is selected");
                	}else{
                		logger.log(LogStatus.FAIL, element.getText() + " is not matching with expected value " + ExcelUtils.getCellData(testCaseRow,ColNum));
                	}
            	}else{
            		logger.log(LogStatus.FAIL, "Label is null or empty");
            	}
            }else{
        		logger.log(LogStatus.FAIL, "Label is not displayed in the screen");
        	}
            
	}catch(Exception e){
		   Log.error("Exception Occured" + e.getMessage());
	}
	
}


public static String getDataFromSpreadsheet(int testCaseRow,int ColNum) throws Exception{
	String testData = null;
	try{
		testData = ExcelUtils.getCellData(testCaseRow, ColNum);
		Log.info("Test Data read from spread sheet is: "+ testData);
		
	}catch(Exception e){
		Log.error("Class GenericActions | Method getDataFromSpreadsheet | Exception desc : "+e.getMessage());
		logger.log(LogStatus.FAIL, "Class GenericActions | Method getDataFromSpreadsheet | Exception desc : Unexpected Error Occured");	
		
	}return testData;
}

public static void verifyItem(int testCaseRow, int Col_Num, WebElement element, String listValues)throws Exception {
try {
	Actions action = new Actions(driver);
	List<WebElement> dropDownValues;
	
	dropDownValues = element.findElements(By.xpath(p.getProperty(listValues)));
	Log.info("Values of  are fetched from the dropdown");
	boolean offerSelection = false;
	if(dropDownValues.size()==1){
		Log.info("List Value is None");
				if ((dropDownValues.get(0).getText().trim().equals(ExcelUtils.getCellData(testCaseRow, Col_Num).trim()))) {
					action.moveToElement(dropDownValues.get(0)).click().perform();
					offerSelection = true;
					Log.info("Value is matched and clicked");
					logger.log(LogStatus.PASS,
							ExcelUtils.getCellData(testCaseRow, Col_Num) + dropDownValues.get(0).getText().trim()+"is selected from dropdown successfully");
					}else {
				Log.info("Value is not matched and clicked");
				logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down for"
						+ ExcelUtils.getCellData(testCaseRow, Col_Num));
			}

		} else if(dropDownValues.size()>1) {
			if (!Strings.isNullOrEmpty(ExcelUtils.getCellData(testCaseRow, Col_Num))) {
				for (int i = 0; i < dropDownValues.size(); i++) {
					if ((dropDownValues.get(i).getText().trim().equals(ExcelUtils.getCellData(testCaseRow, Col_Num).trim()))) {
						action.moveToElement(dropDownValues.get(i)).click().perform();
						offerSelection = true;
						break;
					}

				}
				if (offerSelection) {
					Log.info("Value is matched and clicked");
					logger.log(LogStatus.PASS,
							ExcelUtils.getCellData(testCaseRow, Col_Num) + "is selected from dropdown successfully");
				} else {
					Log.info("Value is not matched and clicked");
					logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down for"
							+ ExcelUtils.getCellData(testCaseRow, Col_Num));
				}

			} 
		}
		else {
		Log.info(element.getText() + " Data is empty or null");
		logger.log(LogStatus.FAIL, ExcelUtils.getCellData(testCaseRow, Col_Num) + "Data is empty or null");
	}

} catch (Exception e) {
	Log.info("Exception Occured" + e.getMessage());
	logger.log(LogStatus.FAIL, "No Matching Values found in the drop Down for");
}

}

///////////////////////////////////////////////

public static void enterValueInTextBox(int testCaseRow, int Col_Num, WebElement element) {
	String testData=null;
	try {
		testData = ExcelUtils.getCellData(testCaseRow, Col_Num);
		System.out.println("Test Data is : " + testData);
		//Actions action = new Actions(driver);
		//element.click();
		
		//element.clear();
		element.sendKeys(testData);
		//action.moveToElement(element).sendKeys(testData);
		//element.sendKeys(testData);
		

		logger.log(LogStatus.PASS, testData + " is entered successfully");
		Log.info(testData + "is entered successfully");

	} catch (Exception e) {
		Log.error("Class SearchOrCreatePoliycActions | Method enterValueInTextBox | Exception desc : "+e.getMessage());
		logger.log(LogStatus.FAIL, "Class SearchOrCreatePoliycActions | Method enterValueInTextBox |Exception desc : Unexpected Error Occured");
		String img =logger.addScreenCapture(Utils.getScreenshotPath("SearchOrCreatePoliycActions","enterValueInTextBox",1));
		logger.log(LogStatus.FAIL, img);
	}

}



public static void clickAction(WebElement element) throws Exception{
	
 	try{
 		element.click();
 		Log.info("Element is clicked " );
 		 logger.log(LogStatus.PASS,"Click action is performed successfully");          		 
 		 
 	}catch (Exception e){
 		Log.error("Not Clicked ");
 		 logger.log(LogStatus.FAIL,"Failed to Click ");
    		throw(e);
    	}        	
  	 
     Reporter.log("clickAction is successfully performed");
}


public static void mouseHoverClickAction(WebDriver driver,WebElement element) throws Exception{
	Actions action = new Actions(driver);
	String elementText = null; 

 	try{
 		elementText = element.getText();
 		 action.moveToElement(element).click().perform();
 	        		        		   		 
  		Log.info(element+ " is clicked successfully" );
  	   logger.log(LogStatus.PASS,"Element is clicked successfully");       		 
 		 
 	}catch (Exception e){
 		Log.error(element+"Failed to click ");
 		 logger.log(LogStatus.FAIL,elementText+" is not clicked");
    		throw(e);
    	}        	   
}

public static void mousehoverDoubleClickAction(WebElement element) throws Exception {
	Actions action = new Actions(driver);
	String elementText = null;
	try {
		elementText = element.getText();
		action.moveToElement(element).doubleClick().perform();

		// element.sendKeys(Keys.ENTER);
		Log.info(element + " is clicked ");
		logger.log(LogStatus.PASS, elementText + " is selected successfully");

	} catch (Exception e) {
		Log.error("unable to double click - mousseoveraction for" + element);
		logger.log(LogStatus.FAIL, elementText + " is not found");
		throw (e);
	}

}

public static void enterValueUsingActions1(int testCaseRow, int Col_Num, WebElement element1,WebElement element2) throws Exception {
	Actions action = new Actions(driver);
	String elementText = null;
	String testData = ExcelUtils.getCellData(testCaseRow, Col_Num);
	System.out.println("TestData is " + testData);
	try {
		//action.moveToElement(element1).click().perform();
		element1.click();
		elementText = element2.getText();	
		Thread.sleep(1000);
		element2.clear();
		element2.sendKeys(testData);
		//action.moveToElement(element2).click().sendKeys(testData).perform();			
		Log.info(elementText + " is clicked ");
		logger.log(LogStatus.PASS, elementText + " is selected successfully");

	} catch (Exception e) {
		Log.error("unable to double click - mousseoveraction for" + elementText);
		logger.log(LogStatus.FAIL, elementText + " is not found");
		throw (e);
	}

}

public static String getText(WebElement element) throws Exception {
	String elementText = null;
	try {
		elementText = element.getText();
		Log.info("Got the " + elementText + " text of the element");
		// logger.log(LogStatus.PASS, "Text is " + elementText);

	} catch (Exception e) {
		Log.error("failed to get the text ");
		// logger.log(LogStatus.FAIL, "Unable to get text");
		throw (e);
	}
	return elementText;
}
public static String getAttribute(WebElement element) throws Exception {
	String elementText = null;
	try {
        elementText = element.getAttribute("value");
		Log.info("Got the " + elementText + " text of the element");
		// logger.log(LogStatus.PASS, "Text is " + elementText);

	} catch (Exception e) {
		Log.error("failed to get the text ");
		// logger.log(LogStatus.FAIL, "Unable to get text");
		throw (e);
	}
	return elementText;
}


public static void tabAction(WebElement element) throws Exception {
	try {
		element.sendKeys(Keys.TAB);
		logger.log(LogStatus.PASS, element.getText() + "is clicked successfully");
	} catch (Exception e) {
		System.out.println("click action " + element + e.getMessage());
		Log.info("Exception Occured" + e.getMessage());
		logger.log(LogStatus.FAIL, element.getText() + "is not clicked successfully");
	}

}

public static void enterValueInDisabledField(int testCaseRow, int Col_Num, WebElement element) throws Exception {
	String testData = ExcelUtils.getCellData(testCaseRow, Col_Num);

	try {

		String s = "document.getElementById('FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber-inputEl').value = '"
				+ testData + "'";
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(s);
		/*
		 * element.click(); element.clear(); element.sendKeys(testData);
		 */
		logger.log(LogStatus.PASS, testData + "is entered successfully");
		Log.info(testData + "is entered successfully");

	} catch (Exception e) {

		Log.info("Exception Occured" + e.getMessage() + "While entering data in" + element);
		logger.log(LogStatus.FAIL,  "Test Data is not entered successfully");
	}

}

public static void EnterText(int testcaserow, int col, WebElement element) throws Exception{
	
	String testdata=ExcelUtils.getCellData(testcaserow, col);
	System.out.println(testdata);
	element.click();
	Thread.sleep(4000);
	element.sendKeys(testdata);
	
}



}

