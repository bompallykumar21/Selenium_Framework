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

    @FindBy(xpath="//input[@value='m']")
    WebElement radioBtnMale;

    @FindBy(xpath="//input[@value='f']")
    WebElement radioBtnFemale;

    @FindBy(xpath="//select[starts-with(@name,'DOB_Day')]")
    WebElement drpdwnDay;

    @FindBy(xpath="//select[@id='country']")
    WebElement drpdwnCountry;

    public WebElement getDrpdwnDay() {
        return drpdwnDay;
    }

    public WebElement getDrpdwnCountry() {
        return drpdwnCountry;
    }

    public WebElement getRadioBtnMale() {
        return radioBtnMale;
    }

    public WebElement getRadioBtnFemale() {
        return radioBtnFemale;
    }

    public WebElement getChkboxAlternateEmail() {
        return chkboxAlternateEmail;
    }
}
