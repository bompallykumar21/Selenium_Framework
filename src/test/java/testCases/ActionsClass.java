package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import pageObjects.SainsburyHomePage;
import testBase.TestBase;

public class ActionsClass extends TestBase {


	@Test
	public void verifyActionsClass() throws InterruptedException {
		logger = Logger.getLogger("Actions");
		test = extentReports.createTest("Actions");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://www.sainsburys.co.uk/");
		SainsburyHomePage sainsburyHomePage = new SainsburyHomePage();
		
		Actions action=new Actions(driver);
		action.moveToElement(sainsburyHomePage.getLnkGroceries()).build().perform();  //locator that needs to be mouse hovered
				Thread.sleep(5000);
//		sainsburyHomePage.getLnkGroceries().click();
		sainsburyHomePage.getLnkLogin().click();



	}
}
