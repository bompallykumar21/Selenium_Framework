package WaitMethods;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

import java.io.IOException;

public class Sleep extends TestBase{

	@Test
	public void createAList() throws IOException, InterruptedException {
		logger = Logger.getLogger("CreateList");
		
		WeddingShopRegisterPage register=new WeddingShopRegisterPage();
		
//		register.getTxtEnterTitle().sendKeys("Page Object Model demo");



		register.enterTitleValue("Page Object Model demo");

		Thread.sleep(5000);  //milli seconds
		
//		register.getTxtEnterName().sendKeys("First name");		
		register.enterNameValue("FirstName");

		CaptureScreenshots(driver,"weddingShop");
		

//		WebElement txtEnterFirstName=driver.findElement(By.xpath("//input[@id='name']"));
//		txtEnterFirstName.sendKeys("FirstName");		


	}
}
