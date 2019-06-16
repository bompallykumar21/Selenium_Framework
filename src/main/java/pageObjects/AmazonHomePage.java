package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class AmazonHomePage extends TestBase{

    public AmazonHomePage(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getCategoryOptions() {
		return CategoryOptions;
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement txtSearch;
	
    @FindBy(xpath="//div[contains(@class,'nav-template nav-flyout-content nav-tpl-itemList')]//span[@class='nav-text']")
    WebElement CategoryOptions;
    
  
}
