package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		String diverpath="C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", diverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize(); 

		WebElement txtTitle= driver.findElement(By.xpath("//input[@id='login1']"));  //identifying using element attribute id
		txtTitle.sendKeys("username1");  //to enter text value
		Thread.sleep(2000);
		txtTitle.clear(); //clear existing values
		Thread.sleep(2000);
		txtTitle.sendKeys("updated user 1");
	}
}
