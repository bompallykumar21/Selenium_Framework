package testCases;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.FramesDemoPage;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class verifyFrames extends TestBase{
	@Test
	public void verifyFrames(){
		logger = Logger.getLogger("Frames messages");
		test = extentReports.createTest("Alert messages");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		FramesDemoPage framesDemoPage=new FramesDemoPage();

		
		

		driver.switchTo().frame("packageListFrame");
		List<WebElement> packLinks=framesDemoPage.getLinksPackages();
		System.out.println(packLinks.size());
		for(int i=0;i<packLinks.size();i++) {
			logger.info("PackLinks#"+packLinks.get(i).getText());
		}
		
		driver.switchTo().defaultContent();
//		driver.switchTo().frame("classFrame");
		WebElement frameClass=driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frameClass);
		//We can pass index or name or xpath of frame
		
		List<WebElement> overViewLinks=framesDemoPage.getLinksOverViewSummary();
		System.out.println(overViewLinks.size());
		for(int i=0;i<overViewLinks.size();i++) {
			logger.info("overViewLinks#"+overViewLinks.get(i).getText());
		}
		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("packageFrame");
//		List<WebElement> IndexConLinks=framesDemoPage.getLinksIndexContainers();
//		System.out.println(IndexConLinks.size());
//		for(int i=0;i<IndexConLinks.size();i++) {
//			logger.info("PackLinks#"+IndexConLinks.get(i).getText());
//		}
		

	}
}
