package SeqParallelTesting;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseC extends TestBase{

	@Test
	void testc() {
		launchBrowser();
		enterUrl("http://www.java.com");
		driver.quit();
	}	
}
