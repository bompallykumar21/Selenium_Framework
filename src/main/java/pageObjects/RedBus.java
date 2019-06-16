package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class RedBus extends TestBase{

    public RedBus(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='src']")
    WebElement txtdepatureCity;

    @FindBy(xpath="//input[@id='dest']")
    WebElement txtdestinationCity;
    
	@FindAll({@FindBy(xpath="//li[starts-with(@select-id,'results')]")})
	List<WebElement> listOptions;
    
	public List<WebElement> getListOptions() {
		return listOptions;
	}

	public WebElement getTxtdepatureCity() {
		return txtdepatureCity;
	}

	public WebElement getTxtdestinationCity() {
		return txtdestinationCity;
	}
    
	}
