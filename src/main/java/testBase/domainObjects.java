package testBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;



public class domainObjects {

	public String browser;
	public String url;
	public String username;
	public String password;
	public static WebDriver driver;
	public String environment;
	public String testurl;
	public String stageurl;
	
	public static Logger logger;
	String porpFileLocation="config/configuration.properties";
	String porpFileLocation2="config/configuration2.properties";
	
}
