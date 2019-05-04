package elementIdentification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import configReader.log4jConfigReader;

public class usingID {

	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("config/log4j.properties");
		Logger logger = Logger.getLogger(usingID.class);  //name of the test case		
		logger.error("**********Initializing Test case************");
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.weddingshop.com/register"); 
		driver.manage().window().maximize(); 
		logger.info("Chrome Browser is launched");

		WebElement txtTitle= driver.findElement(By.id("title"));  //identifying using element attribute id
		txtTitle.sendKeys("Title value 23/03");  //to enter text value
		txtTitle.clear(); //clear existing values
		txtTitle.sendKeys("updating title value");


		//		driver.findElement(By.id("title")).sendKeys("updated"); //identifying using element attribute id

	}
}
