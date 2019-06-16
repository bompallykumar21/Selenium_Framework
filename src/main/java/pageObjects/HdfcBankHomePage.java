package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HdfcBankHomePage extends TestBase{

    public HdfcBankHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@id='loginsubmit']")
    WebElement btnLogin;
    
    @FindBy(xpath="//div[@class='container']//div[@class='pdtb25 text-center']")
    WebElement btnContinueNetBanking;
    
    public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnContinueNetBanking() {
		return btnContinueNetBanking;
	}

	public WebElement getTxtUserID() {
		return txtUserID;
	}

	@FindBy(xpath="//input[@name='fldLoginUserId']")
    WebElement txtUserID;
  

  
    
	
}
