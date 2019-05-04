package configReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class ConfigurationReader {

	public String porpFileLocation="config/configuration.properties";
	public String browser;
	public String url;
	public String testurl;
	public String stageurl;
	public String  environment;
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger("Selenium");

	protected void ConfigReader() throws IOException{		
		File file=new File(porpFileLocation);  //file location
		FileInputStream inFile=new FileInputStream(file);  //reading the file	
		Properties prop=new Properties();
		prop.load(inFile);  //loading properties information		
		logger.info("Properties files is initialised");
		browser=prop.getProperty("browser");
		testurl=prop.getProperty("testurl");
		stageurl=prop.getProperty("stageurl");
		url=prop.getProperty("url");
		environment=prop.getProperty("environment");
	}

	protected void initializelog4J(){
		PropertyConfigurator.configure("config/log4j.properties");
		logger.info("Log4J properties is initialised");
	}
}