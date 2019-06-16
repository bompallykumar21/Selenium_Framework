package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HdfcBankHomePage;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class SwitchToWindows extends TestBase {
	Alert alert;

	@Test
	public void switchToWindows() throws AWTException, InterruptedException{
		logger = Logger.getLogger("SwitchToWindows");
		test = extentReports.createTest("SwitchToWindows");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://www.hdfcbank.com/");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		logger.info("Pop up dialohg is closed");


		HdfcBankHomePage	hdfcBankHomePage=new HdfcBankHomePage();
		wait.until(ExpectedConditions.elementToBeClickable(hdfcBankHomePage.getBtnLogin()));
		hdfcBankHomePage.getBtnLogin().click();
		logger.info("Login button is clicked");
		Thread.sleep(5000);

		String mainWindow=driver.getWindowHandle();  //to fetch window id of main window
		Set<String> allWindows = driver.getWindowHandles();  //to fetch window ids of all windows

		System.out.println("Mainwindows"+mainWindow);
		System.out.println("All windows"+allWindows);

		for(String winhan:allWindows ) {
			logger.info("Window "+winhan);
			if(!winhan.equals(mainWindow)) {  //checking for child window
				driver.switchTo().window(winhan);  //switching to child window
				logger.info("Switching to child window# "+winhan);
				wait.until(ExpectedConditions.elementToBeClickable(hdfcBankHomePage.getBtnContinueNetBanking()));
				hdfcBankHomePage.getBtnContinueNetBanking().click();
				logger.info("Clicked on continue to net banking ");
				driver.switchTo().frame("login_page");
				wait.until(ExpectedConditions.elementToBeClickable(hdfcBankHomePage.getTxtUserID()));
				hdfcBankHomePage.getTxtUserID().sendKeys("Userid123");
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		
	}

}