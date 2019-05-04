package multipleTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseC extends TestBase{

	@Test(priority=3)
	void testc() {
		System.out.println("This is testc");
	}
}
