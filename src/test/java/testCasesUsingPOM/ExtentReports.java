package testCasesUsingPOM;

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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtentReports extends TestBase{

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


		test.pass("Size of text fields: "+textFields.size()).addScreenCaptureFromPath(screenPath);  //add screenshots. screenshots will be added at the end of the test case
		test.fail("Size of button fields: "+buttonFields.size()).addScreenCaptureFromPath(screenPath);

		MediaEntityModelProvider mediaModel =
				MediaEntityBuilder.createScreenCaptureFromPath(screenPath).build();
		test.fail("details1", mediaModel);  //to insert image in test steps
		test.fail("details2", MediaEntityBuilder.createScreenCaptureFromPath(screenPath).build());  //to insert image in steps

		test.fail("details3",
				MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
//
		test.fail("details",
				MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());


		test.debug("This is debug message");
		test.error("This is error message");
		test.info("This is infor message");
		test.skip("This is skip message");

		String jsonStr = "{'foo' : 'bar', 'foos' : ['b','a','r'], 'bar' : {'foo':'bar', 'bar':false,'foobar':1234}}";
		test.pass(jsonStr);
		test.pass(MarkupHelper.createCodeBlock(jsonStr, CodeLanguage.JSON));  //to show text in json format



		test.pass(MarkupHelper.createLabel("This is text in blue colour", ExtentColor.BLUE));  //to show text in colour

		test.fail(MarkupHelper.createLabel("This is text in blue colour", ExtentColor.RED));

		String[][] data = {
				{ "Header1", "Header2", "Header3" },
				{ "Content.1.1", "Content.2.1", "Content.3.1" },
				{ "Content.1.2", "Content.2.2", "Content.3.2" },
				{ "Content.1.3", "Content.2.3", "Content.3.3" },
				{ "Content.1.4", "Content.2.4", "Content.3.4" }
		};

		test.pass(data.toString());
		test.pass(MarkupHelper.createTable(data));

	}
}
