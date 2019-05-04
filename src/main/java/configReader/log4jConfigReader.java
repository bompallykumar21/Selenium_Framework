package configReader;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4jConfigReader {
	static Logger logger = Logger.getLogger(log4jConfigReader.class);
	
	public static void main(String[] args) {	
		{
			//PropertiesConfigurator is used to configure logger from properties file
			PropertyConfigurator.configure("config/log4j.properties");

			//Log in console in and log file
			logger.debug("Log4j appender configuration is successful !!");
		}
	}
}