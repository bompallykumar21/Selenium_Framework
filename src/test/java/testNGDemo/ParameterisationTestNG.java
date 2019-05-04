package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationTestNG {

	@Test
	@Parameters({"browser", "username", "password", "system"})  //parameter names from testng
	public void loginTest1(String browser, String username, String password, String system ) {  //stores value defined for the parameter name
		System.out.println("username1: "+username);
		System.out.println("password1: "+password);
		System.out.println("browser1: "+browser);
		System.out.println("system1: "+system);
	}
}
