package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class alertMessages extends TestBase {
	Alert alert;

	@Test
	public void verifyAlertMessages(){
		logger = Logger.getLogger("Alert messages");
		test = extentReports.createTest("Alert messages");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffCreateAccount rediffCreateAccount=new RediffCreateAccount();
		rediffCreateAccount.getBtnGo().click();

		if(isAlertPresent()) {
			logger.info("Alert message is displayed and switched to it");
			alert.getText();
			logger.info("Alert message text#"+alert.getText());  //to fetch alert message text
			alert.accept();  //alert message is closed
		}else {
			logger.info("Alert message is not present");
		}
		
		if(isAlertPresent()) {	
			logger.info("Alert message is displayed and switched to it");
			alert.dismiss();  //alert message is closed
		}else {
			logger.info("Alert message is not present");
		}
	}

		private boolean isAlertPresent() {		
			try {
				alert=driver.switchTo().alert();				
				return true;
			}catch(NoAlertPresentException e) {
					return false;
			}



		}
	}