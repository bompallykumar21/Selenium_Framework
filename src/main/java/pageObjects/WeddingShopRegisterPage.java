package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testBase.TestBase;

public class WeddingShopRegisterPage extends TestBase{

	public WeddingShopRegisterPage(){
		PageFactory.initElements(driver, this);
	}

	//	WebElement txtEnterTitle=driver.findElement(By.xpath("//input[@id='title']"));

	@FindBy(xpath="//input[@id='title']")
	WebElement txtEnterTitle;

	@FindBy(xpath="//input[@id='name']")
	WebElement txtEnterName;

	@FindAll({@FindBy(xpath="//input[@type='text']")})
	List<WebElement> textFields;

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	@FindBy(xpath="//button[contains(text(),'submit')]")
	WebElement btnSubmit;


//	List<WebElement> textFields=new ArrayList<WebElement>();
//	textFields= driver.findElements(By.xpath("//input[@type='text']"));
	
	public List<WebElement> getTextFields() {
		return textFields;
	}

	public WebElement getTxtEnterName() {
		return txtEnterName;
	}

	public WebElement getTxtEnterTitle() {
		return txtEnterTitle;
	}	

	public void enterTitleValue(String titleValue) {
		getTxtEnterTitle().clear();
		getTxtEnterTitle().sendKeys(titleValue);  //enter the provided value in the title field
		logger.info("Entered Title value");
	}

	public void enterNameValue(String NameValue) {
		getTxtEnterName().clear();
		getTxtEnterName().sendKeys(NameValue);  //enter the provided value in the title field
		logger.info("Entered First Name");
	}
}
