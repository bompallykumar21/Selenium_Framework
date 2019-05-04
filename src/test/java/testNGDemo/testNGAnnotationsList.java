package testNGDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotationsList {
	Logger logger;
	
	testNGAnnotationsList(){
	 logger = Logger.getLogger("Annotations");
	 PropertyConfigurator.configure("config/log4j.properties");
	}
	
	@Test  //main annotation.
	void test() {
		logger.info("Test Annotation");
	}
	
	@BeforeClass 
	void beforeClass() {
		logger.info("@BeforeClass Annotation");
	}
	
	@AfterClass 
	void afterClass() {
		logger.info("@AfterClass Annotation");
	}
	
	@BeforeMethod
	void beforeMthod() {
		logger.info("@BeforeMethod Annotation");
	}
	
	@AfterMethod
	void afterMethod() {
		logger.info("@AfterMethod Annotation");
	}
	
	@BeforeSuite
	void beforeSuite() {
		logger.info("@BeforeSuite Annotation");
	}
	
	@AfterSuite
	void afterSuite() {
		logger.info("@AfterSuite Annotation");
	}
	
	@BeforeTest
	void beforeTest() {
		logger.info("@BeforeTest Annotation");
	}
	
	@AfterTest
	void afterTest() {
		logger.info("@AfterTest Annotation");
	}	
}