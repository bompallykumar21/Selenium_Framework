package testCasesUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.WeddingShopHomePage;
import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

public class CreateAList extends TestBase{

	@Test
	public void createAList() {
		WeddingShopRegisterPage register=new WeddingShopRegisterPage();
		
		register.getTxtEnterTitle().sendKeys("Page Object Model demo");

		WebElement txtEnterFirstName=driver.findElement(By.xpath("//input[@id='name']"));
		txtEnterFirstName.sendKeys("FirstName");		


	}
}
