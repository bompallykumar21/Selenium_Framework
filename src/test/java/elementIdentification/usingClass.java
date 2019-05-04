package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.weddingshop.com/register"); 
		driver.manage().window().maximize(); 

		WebElement txtTitle= driver.findElement(By.className("form-field__input form-control"));  //identifying using element attribute id
		txtTitle.sendKeys("Title value 23/03");  //to enter text value
		txtTitle.clear(); //clear existing values
		txtTitle.sendKeys("updating title value");


		//		driver.findElement(By.id("title")).sendKeys("updated"); //identifying using element attribute id

	}
}
