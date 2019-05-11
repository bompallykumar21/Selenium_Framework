package testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import testBase.TestBase;

public class testCase1 extends TestBase{
	
	@Test
	public void testCase1() {
		logger = Logger.getLogger("testCase1");
		enterUrl("http://www.seleniumhq.org");		
		System.out.println("Githum Desktop");
		
			}
	
	@Test
	public void testCase2() {
		logger = Logger.getLogger("testCase2");
		enterUrl("http://www.google.com");	
		
		
		}
}
