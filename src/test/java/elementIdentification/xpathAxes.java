package elementIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {
	public static void main(String[] args) {
		String url="https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F";
		String diverpath="C:\\Trainings\\UK_Feb\\lib\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", diverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//button[@id='new-account-btn']")).click();
		driver.findElement(By.id("password")).sendKeys("Password123");
		

	}
}