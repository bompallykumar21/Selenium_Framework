package multipleTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseB extends TestBase{
	
	@Test(priority=2)
	void testb() {
		System.out.println("This is testb");
	}
}
