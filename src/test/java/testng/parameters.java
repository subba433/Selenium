package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	@Test
	@Parameters({"username", "password"})
	public static void ConformPayment(String uname, String pswd) {
		System.out.println("The user name: "+uname);
		System.out.println("The Password: "+pswd);
		
	}

}
