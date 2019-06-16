package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.RedBus;
import testBase.TestBase;

public class ActionsClass_redBus extends TestBase {


	@Test
	public void verifyActionsClass() throws InterruptedException, AWTException {
		logger = Logger.getLogger("Actions");
		test = extentReports.createTest("Actions");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://www.redbus.in/");
		RedBus redBus = new RedBus();
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		redBus.getTxtdepatureCity().sendKeys("Hyd");
		Thread.sleep(3000);

		Actions action=new Actions(driver);
		//		action.moveToElement(redBus.getTxtdepatureCity()).build().perform();;
		action.moveToElement(driver.findElement(By.xpath("//li[starts-with(@select-id,'results')]"))).build().perform();
		List<WebElement> list=driver.findElements(By.xpath("//li[starts-with(@select-id,'results')]"));


		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
