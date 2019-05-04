package BasicBrowserFunctions;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://naukri.com"); //enter url in the browser
		System.out.println(LocalTime.now());
		Thread.sleep(2000);  //wait for 8 sec
		System.out.println(LocalTime.now());

		driver.manage().window().fullscreen();  //to launch in full screen
		Thread.sleep(4000);
		driver.manage().window().maximize();  //to launch in maximize screen	

		
		
		//		driver.close(); //close only focussed browser
		driver.quit(); //closes all the browser instances opened through this driver

	}
}
