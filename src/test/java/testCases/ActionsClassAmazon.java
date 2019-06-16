package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.AmazonHomePage;
import testBase.TestBase;

public class ActionsClassAmazon extends TestBase {


	@Test
	public void verifyActionsClass() throws InterruptedException {
		logger = Logger.getLogger("ActionsAmazon");
		test = extentReports.createTest("ActionsAmazon");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://www.amazon.in");
		AmazonHomePage amazonHomePage = new AmazonHomePage();
		Actions action=new Actions(driver);
		
		amazonHomePage.getTxtSearch().click();
		action.moveToElement(amazonHomePage.getTxtSearch()).sendKeys("apple").perform();
		
//		amazonHomePage.getTxtSearch().sendKeys(Keys.TAB);
				
		action.contextClick().perform();
		Thread.sleep(5000);
		


	}
}
