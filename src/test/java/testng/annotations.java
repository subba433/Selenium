package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	
	
/*	@BeforeSuite
	public static void beforesuite() {
		System.out.println("before suite is successful");
	}
	
	@AfterSuite
	public static void aftersuite() {
		System.out.println("after suite is successful");
	}
	@BeforeTest
	public static void beforetest() {
		System.out.println("before test is successful");
	}
	
	@AfterTest
	public static void aftertest() {
		System.out.println("after test is successful");
	}
	
	
	@BeforeMethod
	public static void beforemethod() {
		System.out.println("before method is successful");
	}
	
	@AfterMethod
	public static void aftermethod() {
		System.out.println("after method is successful");
	}*/
	
	@Test
	public static void login() {
		System.out.println("Login is successful from test1");
	}
	@Test
	public static void Search() {
		System.out.println("Customer Search is successful from test1");
	}
	
	@Test
	public static void Placeorder() {
		System.out.println("Place order is successful from test1");
	}
	
	@Test 
	public static void logout() {
		System.out.println("Logout is successful from test1");
	}


}
