package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import java.util.List;

public class W3schools extends TestBase {

    public W3schools(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@id='navbtn_tutorials']")
    WebElement drpdwnTutorials;

    public WebElement getDrpdwnTutorials() {
        return drpdwnTutorials;
    }

    @FindAll({@FindBy(xpath="//*[@id='nav_tutorials']/div/div/a")})
    List<WebElement> lblDrpdwnValues;

    public List<WebElement> getLblDrpdwnValues() {
        return lblDrpdwnValues;
    }
}
