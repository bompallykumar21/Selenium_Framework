package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SainsburyHomePage extends TestBase {

    public SainsburyHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@id='mainNavGroceriesLink']//span[contains(text(),'Groceries')]")
    WebElement lnkGroceries;
    
    @FindBy(xpath="//a[@id='mainNavBankLink']//span[contains(text(),'Bank')]")
    WebElement lnkBank;
    
    @FindBy(xpath="//a[contains(text(),'Log in')]")
    WebElement lnkLogin;
  

	public WebElement getLnkLogin() {
		return lnkLogin;
	}

	public WebElement getLnkGroceries() {
		return lnkGroceries;
	}

	public WebElement getLnkBank() {
		return lnkBank;
	}     
    
    
}
