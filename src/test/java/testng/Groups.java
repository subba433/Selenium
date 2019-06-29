package testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups= {"Sanity"})
	public static void login() {
		System.out.println("Login is successful");
	}
	@Test (groups= {"Regression"}, priority=1)
	public static void Search() {
		System.out.println("Customer Search is successful");
	}
	
	@Test (groups= {"Sanity"})
	public static void Placeorder() {
		System.out.println("Place order is successful");
	}
	
	@Test (groups= {"Regression"})
	public static void ConformPayment() {
		System.out.println("ConformPayment is successful");
	}
	
	@Test (groups= {"Sanity"})
	public static void logout() {
		System.out.println("Logout is successful");
	}


}
