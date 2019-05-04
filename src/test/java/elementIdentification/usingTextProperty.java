package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingTextProperty {

	public static void main(String[] args) {
		String url="https://shop.auspost.com.au/register";
		String diverpath="C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", diverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize(); 

		WebElement btnCreateAccont= driver.findElement(By.xpath("//button[contains(.,'Create an account')]"));  
		btnCreateAccont.click();
		
	}
}