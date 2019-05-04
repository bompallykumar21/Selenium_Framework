package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingpartialLinkText {


	public static void main(String[] args) throws InterruptedException {
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		String diverpath="C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", diverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize(); 

		WebElement lnkCreateAccount= driver.findElement(By.partialLinkText("new account"));  //identifying using element attribute id
		lnkCreateAccount.click();
	}
}
