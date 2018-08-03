package com.flex.utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.awt.Robot;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;


public class Utils {
	
	public static String objLocator; 
	public static String objValues;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver = null;
	public static WebDriver OpenBrowser1(int testCaseRow) throws Exception{
		String browserName;
		Properties p = ReadObjects.getObjectRepository("Object.properties");
		try{
		browserName = ExcelUtils.getCellData(testCaseRow, Constant.Col_Browser);
		if(browserName.equals("Mozilla")){
			//if(browserName.equals("chrome")){
			driver = new FirefoxDriver();
			//System.setProperty("webdriver.Chrome.driver", ".\\drivers\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			Log.info("New driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Log.info("Implicit wait applied on the driver for 10 seconds");
		    //driver.get(Constant.URL);
		    
		    driver.get(p.getProperty("baseUrl"));
		    Log.info("Web application launched successfully");
			}else if(browserName.equals("IE")){
					System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");					
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					capabilities.setCapability("ignoreProtectedModeSettings",true);
					
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
								
					Log.info("New IE driver instantiated");
				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				    Log.info("Implicit wait applied on the driver for 10 seconds");
				  //  driver.get(Constant.URL);
				    driver.get(p.getProperty("baseUrl"));
				    Log.info("Web application launched successfully");
					}
	
		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
	
	public static String getTestCaseName(String testCase)throws Exception{
		String value = testCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	
	
	 public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
	 public static void generalWait(){
		 
		 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	 
	 	}
	 public static void takeScreenshot(WebDriver driver, String testCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + testCaseName +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}
	 
	 
	 public static String getScreenshotPath(String testModuleName, String testCaseName,int stepNo) {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
			.format(new Date());
			try {
				String str_timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
				.format(new Date());
				System.out.println(str_timeStamp);
				str_timeStamp = timeStamp.replace(".", "_");
				System.out.println(str_timeStamp);

				Robot r = new Robot();
				r.mouseMove(1, 1);
				// Normalise the current time
				File scrFile = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);
				// The below method will save the screen shot in  drive with name
				// "screenshot.png"
				
					
					/*String filescreenPath = "D:\\Jenkins\\workspace\\AutomationTestSuite\\src\\test\\java\\com\\cgi\\flex\\screenshots"
							+ testModuleName
							+ testCaseName
							+ stepNo
							+ str_timeStamp
							+ ".jpg";
					
				String filescreenPath = "C:\\selenium-automation\\flex\\src\\test\\java\\com\\cgi\\flex\\screenshots"
						+ testModuleName
						+ testCaseName
						+ stepNo
						+ str_timeStamp
						+ ".jpg";*/
				
				String filescreenPath = Constant.getHomeDirectory+"/src/test/java/com/flex/screenshots/"
						+ testModuleName
						+ testCaseName
						+ stepNo
						+ str_timeStamp
						+ ".jpg";
				
				
				File destDir = new File(filescreenPath);
				FileUtils.copyFile(scrFile, destDir);
				Thread.sleep(1000);

				return filescreenPath;
			} catch (Exception e) {
				return null;
			}

		}
	 
	 public static String getNormalisedstring()
	 {
		// String str_timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 SimpleDateFormat str_timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	    		 Date date = new Date();
	     String changedDate = str_timeStamp.format(date);
	 	System.out.println(changedDate);
	 	changedDate = changedDate.replace(".", "_");
	 	System.out.println(changedDate);
	 	return changedDate;
	 }
	 public static ExtentReports generateReports(){
		try{
			report = new ExtentReports(Constant.getHomeDirectory +"\\TestResultReport"+"\\report"+"_"+"IE"+getNormalisedstring()+".html", true);
			 report.assignProject("Flex-Automation");
			
		}catch(Exception e){
			Log.error("Class Utils | Method generateReports | Exception desc : "+e.getMessage());
		}
		 return report;
	 }
	 
	 
	

	 public static WebDriver OpenBrowser(int testCaseRow,String APP_URL) throws Exception{
			String browserName;
			//String productUrl = ExcelUtils.getCellData(testCaseRow, productURL);
			System.out.println("Test Environment URL : "+ APP_URL);
			Log.info("Test Environment URL : "+ APP_URL);
			try{
			browserName = ExcelUtils.getCellData(testCaseRow, Constant.Col_Browser);
		
			if(browserName.equals("Mozilla")){
				driver = new FirefoxDriver();
				Log.info("New driver instantiated");
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    Log.info("Implicit wait applied on the driver for 10 seconds");
			    //driver.get(Constant.URL);
			    
			    driver.get(APP_URL);
			    Log.info("Web application launched successfully");
				}else if(browserName.equals("IE")){
						System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
						DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
						capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
						capabilities.setCapability("ignoreProtectedModeSettings",true);
						
						driver = new InternetExplorerDriver(capabilities);
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
									
						Log.info("New IE driver instantiated");
										    
					    Log.info("Implicit wait applied on the driver for 10 seconds");
					  //  driver.get(Constant.URL);					    				    
					    driver.get(APP_URL);
					  

					    Log.info("Web application launched successfully");
					    
					 
						}else if(browserName.equals("Chrome")){
	                        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");                            
	                        /* DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	                      capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, true);
	                        capabilities.setCapability("ignoreProtectedModeSettings",true);*/
	                 
	                        driver = new ChromeDriver();
	                        driver.manage().deleteAllCookies();
	                        driver.manage().window().maximize();
	                                      
	                                             
	                        Log.info("New Chrome driver instantiated");
	                        
	                     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	                     Log.info("Implicit wait applied on the driver for 20 seconds");
	                   //  driver.get(Constant.URL);
	                     driver.get(APP_URL);
	                     Log.info("Web application launched successfully");
	                        }		
			}catch (Exception e){
				Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
			}
			return driver;
		}
	
	 
	}
