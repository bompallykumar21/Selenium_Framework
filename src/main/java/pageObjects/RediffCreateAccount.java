package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class RediffCreateAccount extends TestBase {

    public RediffCreateAccount(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[starts-with(@name,'chk_altemail')]")
    WebElement chkboxAlternateEmail;

    public WebElement getChkboxAlternateEmail() {
        return chkboxAlternateEmail;
    }
}
