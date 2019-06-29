package testng;

import org.testng.annotations.Test;

public class Ordering {
	
	@Test (priority=1)
	public static void login() {
		System.out.println("Login is successful");
	}
	@Test (priority=2)
	public static void Search() {
		System.out.println("Customer Search is successful");
	}
	
	@Test (priority=3)
	public static void Placeorder() {
		System.out.println("Place order is successful");
	}
	
	@Test (priority=4)
	public static void ConformPayment() {
		System.out.println("ConformPayment is successful");
	}
	
	@Test (priority=5)
	public static void logout() {
		System.out.println("Logout is successful");
	}


}
