package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestBase extends domainObjects{

	@BeforeSuite
	public void initailize() throws IOException {
		logger = Logger.getLogger("TestBase");
		initializelog4J();
		ConfigReader();
//		launchBrowser();
		//		enterUrl();
	}

	@AfterSuite
	public void closeBrowser() {
//		driver.quit();
		logger.info("Browser closed");
	}

	@BeforeClass
	public void BeforeClass() {
		logger.info("Launching Browser and enter url");
		launchBrowser();
		enterUrl();
	}

	@AfterClass
	public void AfterClass() {
		logger.info("Exiting driver");
//		driver.quit();
	}

	@BeforeMethod
	public void BeforeMethod() {
		logger.info("BeforeMethod");
	}

	@AfterMethod
	public void AfterMethod() {
		logger.info("AfterMethod");
	}

	@BeforeTest
	public void BeforeTest() {
		logger.info("BeforeTest");
	}

	@AfterTest
	public void AfterTest() {
		logger.info("AfterTest");
	}
	
	public void enterUrl() {
		logger.info("Environment selected: "+environment);
		if(environment.equalsIgnoreCase("test")) {
			url=testurl;
		}else
			if(environment.equalsIgnoreCase("stage")) {
				url=stageurl;
			}
		logger.info("URL selected: "+url);
		driver.get(url);
	}

	public void enterUrl(String url) {
		logger.info("URL selected: "+url);
		driver.get(url);
	}

	//to launch browsers based on the option provided in properties file
	public void launchBrowser() {	
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			logger.info("Chrome Driver is launched");
		}
		else
			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				logger.info("IE browser is launched");
			}
	}

	//Read properties files
	public void ConfigReader() throws IOException{
		File file=new File(porpFileLocation);  //file location
		FileInputStream inFile=new FileInputStream(file);  //reading the file

//		File file2=new File(porpFileLocation2);  //file location
//		FileInputStream inFile2=new FileInputStream(file2);  //reading the file

		Properties prop=new Properties();
		prop.load(inFile);  //loading properties information		
//		prop.load(inFile2);

		browser=prop.getProperty("browser");
		logger.info("browser selected in properties file: "+ browser);

		testurl=prop.getProperty("testurl");
		//logger.info("url selected in properties file: "+ url);

		password=prop.getProperty("password");
		//		logger.info("password selected in properties file: "+ password);
		environment=prop.getProperty("environment");
	}

	//Initializing logs 
	protected void initializelog4J(){
		PropertyConfigurator.configure("config/log4j.properties");
		logger.info("Log4J properties is initialised");
	}
}
