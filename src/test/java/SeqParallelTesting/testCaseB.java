package SeqParallelTesting;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseB extends TestBase{
	
	@Test
	void testb() {
		launchBrowser();
		enterUrl("http://www.rediffmail.com");
		driver.quit();
	}	
}
