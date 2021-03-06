package testCasesUsingPOM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

public class CreateAListMultipleValues extends TestBase{

	@Test
	public void createAList() throws IOException {
		logger = Logger.getLogger("CreateList");  //log 4j
		test=extentReports.createTest("Sleep");  //Initiate extent report
		WeddingShopRegisterPage register=new WeddingShopRegisterPage();

		register.enterTitleValue("Page Object Model demo");
		register.enterNameValue("FirstName");

		List<WebElement> textFields=new ArrayList<WebElement>();
//		textFields= driver.findElements(By.xpath("//input[@type='text']"));
		textFields=register.getTextFields();  //getting the list from the page

		List<WebElement> buttonFields=new ArrayList<WebElement>();
		buttonFields= driver.findElements(By.xpath("//button"));

		screenPath=CaptureScreenshots(driver, "extentReportTest");
		logger.info("Size of text fields: "+textFields.size());
		logger.info("Size of button fields: "+buttonFields.size());
	}
}
