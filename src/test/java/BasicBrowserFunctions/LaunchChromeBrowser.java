package BasicBrowserFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	}
}
