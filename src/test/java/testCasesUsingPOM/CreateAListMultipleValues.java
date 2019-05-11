package testCasesUsingPOM;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

public class CreateAListMultipleValues extends TestBase{

	@Test
	public void createAList() {
		logger = Logger.getLogger("CreateList");

		WeddingShopRegisterPage register=new WeddingShopRegisterPage();

		register.enterTitleValue("Page Object Model demo");		
		register.enterNameValue("FirstName");			

		
		
		List<WebElement> textFields=new ArrayList<WebElement>();
//		textFields= driver.findElements(By.xpath("//input[@type='text']"));
		textFields=register.getTextFields();  //getting the list from the page
		
		List<WebElement> buttonFields=new ArrayList<WebElement>();
		buttonFields= driver.findElements(By.xpath("//button"));
		

		System.out.println("Size of text fields: "+textFields.size());
		System.out.println("Size of button fields: "+buttonFields.size());

	}
}
