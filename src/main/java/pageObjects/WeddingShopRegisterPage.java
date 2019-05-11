package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testBase.TestBase;

public class WeddingShopRegisterPage extends TestBase{

	public WeddingShopRegisterPage(){
		PageFactory.initElements(driver, this);
	}
	
//	WebElement txtEnterTitle=driver.findElement(By.xpath("//input[@id='title']"));
	@FindBy(xpath="//input[@id='title']")
	WebElement txtEnterTitle;

	public WebElement getTxtEnterTitle() {
		return txtEnterTitle;
	}
	

	
	
	
}
