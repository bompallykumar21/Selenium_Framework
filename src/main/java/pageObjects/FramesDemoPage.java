package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class FramesDemoPage extends TestBase {
    public FramesDemoPage(){
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath="//input[@id='src']")
//    WebElement;
    
	@FindAll({@FindBy(xpath="//table[@class='overviewSummary']//a")})
	List<WebElement> linksOverViewSummary;
	
	public List<WebElement> getLinksOverViewSummary() {
		return linksOverViewSummary;
	}

	public List<WebElement> getLinksIndexContainers() {
		return linksIndexContainers;
	}

	public List<WebElement> getLinksPackages() {
		return linksPackages;
	}

	@FindAll({@FindBy(xpath="//div[@class='indexContainer']//a")})
	List<WebElement> linksIndexContainers;
	
	@FindAll({@FindBy(xpath="//*[@title='Packages']//a")})
	List<WebElement> linksPackages;

  
    
}
