package testCasesUsingPOM;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.WeddingShopHomePage;
import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

import java.io.IOException;

public class CreateAList extends TestBase{

	@Test
	public void createAList() throws IOException {
		logger = Logger.getLogger("CreateList");
		
		WeddingShopRegisterPage register=new WeddingShopRegisterPage();
		
//		register.getTxtEnterTitle().sendKeys("Page Object Model demo");
		register.enterTitleValue("Page Object Model demo");	
		
		
//		register.getTxtEnterName().sendKeys("First name");		
		register.enterNameValue("FirstName");

		CaptureScreenshots(driver,"weddingShop");
		

//		WebElement txtEnterFirstName=driver.findElement(By.xpath("//input[@id='name']"));
//		txtEnterFirstName.sendKeys("FirstName");		


	}
}
