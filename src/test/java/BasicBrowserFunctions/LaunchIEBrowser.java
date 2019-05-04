package BasicBrowserFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Trainings\\UK_Feb\\lib\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

		driver.get("http://www.seleniumhq.org");
		
	}
}
