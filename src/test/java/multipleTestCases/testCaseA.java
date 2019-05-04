package multipleTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseA extends TestBase{

	@Test(priority=1)
	void testa() {
		System.out.println("This is testa");
	}
	
	@Test(priority=2)
	void testd() {
		System.out.println("This is testd");
	}
}
