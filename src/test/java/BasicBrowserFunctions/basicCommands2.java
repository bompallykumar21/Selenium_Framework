package BasicBrowserFunctions;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicCommands2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://games24x7.com"); //enter url in the browser
		driver.manage().window().maximize();  //to launch in maximize screen	
		System.out.println("title: "+driver.getTitle()); //to see title of the page
		System.out.println("current url: "+ driver.getCurrentUrl()); //to see current url
		driver.navigate().to("http://www.Seleniumhq.org");
		System.out.println("title: "+driver.getTitle()); //to see title of the page
		System.out.println("current url: "+ driver.getCurrentUrl()); //to see current url
		driver.navigate().back(); //navigate to previous page
		System.out.println("title: "+driver.getTitle()); //to see title of the page
		System.out.println("current url: "+ driver.getCurrentUrl()); //to see current url
		driver.navigate().forward(); //navigate forward
		System.out.println("title: "+driver.getTitle()); //to see title of the page
		System.out.println("current url: "+ driver.getCurrentUrl()); //to see current url
		driver.quit(); //closes all the browser instances opened through this driver

	}
}
