package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathStartsWith {

	public static void main(String[] args) throws InterruptedException {
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		String diverpath="C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", diverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize(); 

		WebElement txtFullName= driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));  //identifying using element attribute id
		txtFullName.sendKeys("Name starts with 'name'");  //to enter text value
		
	}
}
