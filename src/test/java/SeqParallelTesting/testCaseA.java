package SeqParallelTesting;

import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseA extends TestBase{

	@Test
	void testa() {
		launchBrowser();
		enterUrl("http://www.seleniumhq.org");
		driver.quit();
	}	
}
