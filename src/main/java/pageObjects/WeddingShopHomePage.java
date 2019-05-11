package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class WeddingShopHomePage extends TestBase{

	@Test
	public void createAList() throws InterruptedException {
		Thread.sleep(3000);
//		WebElement lnkCreateList=driver.findElement(By.linkText("Create a List"));
//		lnkCreateList.click();

		WebElement txtEnterTitle=driver.findElement(By.xpath("//input[@id='title']"));
		txtEnterTitle.sendKeys("Page Object Model demo");		


	}

}
