package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationTestNG2 {

	@Test
	@Parameters({"browser", "username", "password"})  //parameter name from testng
	public void loginTest2(String browserValue, String usernameValue, String passwordValue) {  //stores value defined for the parameter name
		System.out.println("username2: "+usernameValue);
		System.out.println("password2: "+passwordValue);
		System.out.println("browser2: "+browserValue);
//		System.out.println("system2: "+system);
	}
}
