package com.flex.actions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.flex.pages.BaseClass;
import com.flex.pages.Login;
import com.flex.utility.*;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentTest;


    public class LoginActions extends BaseClass {
    	
    	public LoginActions(WebDriver driver,ExtentTest logger) throws IOException{
        	super(driver,logger);
    }
    	
    	
    	/*
		 * Method:		loginActions
		 * Author: 		Subba Reddy 
		 * Created on:  15-Jun-2016 
		 * Description: To Enter user name and password in the login page and click on Login Button 
		 *   
		 *
		 */
        public static void loginActions(int testCaseRow) throws Exception{       	
        	
        	try{
        		
        		String userName = ExcelUtils.getCellData(testCaseRow, Constant.Col_UserName);
        	    Login.txtbxUserName().sendKeys(userName);               
                Log.info(userName+" is entered in UserName text box" );
                logger.log(LogStatus.PASS,"Username:"+userName + " is entered successfully");
                
                String password = ExcelUtils.getCellData(testCaseRow, Constant.Col_Password);
                Login.txtbxPassword().sendKeys(password);
                Log.info(password+" is entered in Password text box" );
                
                logger.log(LogStatus.PASS,"Password:"+password+ " is entered successfully");
              
                
                Login.btnLogIn().click();
                Log.info("Click action is performed on Submit button");
                
                logger.log(LogStatus.PASS,"Login button is clicked successfully");
                
                
        		
        	}catch(Exception e){
        		Log.error("Unable to login due " +e.getMessage());
        		 logger.log(LogStatus.FAIL,"Login failed,Enter valid username and password entered successfully");
        		 String img =logger.addScreenCapture(Utils.getScreenshotPath("cc","NewclaimCreation",1));
      			logger.log(LogStatus.FAIL, img);
      			Thread.sleep(2000);
                   
        	}
        	
            
           // Utils.waitForElement(Home_Page.lnk_LogOut());
                       
            String title = BaseActions.getTitle();
            
			System.out.println("Home page Name is "+title);
			
			/*if(title.equals("[DEV mode - 8.0.5.362] Guidewire ClaimCenter")){
				
				System.out.println("successfully navigated to home page - CC");
				   Log.info("Title of the page is" + title);
				   
					  logger.log(LogStatus.PASS, "Login is successful",
								"----------------------------------->>>");
			}else{
				System.out.println("Not navigated to home page - CC");
				Log.error("Title is not found on the Page");
				  logger.log(LogStatus.FAIL, " Login is not successful",
							"----------------------------------->>>");
			}
            */
            Reporter.log("SignIn Action is successfully performed");
            
        }
    }
