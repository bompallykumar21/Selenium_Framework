package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import pageObjects.W3schools;
import testBase.TestBase;

import java.util.List;

public class VerifyBootstapDropdownValues extends TestBase {


    @Test
    public void verifyDropdownValues() throws InterruptedException {
        logger = Logger.getLogger("BootstrapDropdown");
        test = extentReports.createTest("BootstrapDropdown");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        enterUrl("https://www.w3schools.com/");

        W3schools w3schools=new W3schools();
        w3schools.getDrpdwnTutorials().click();

        List<WebElement> listdrpdwnValues = w3schools.getLblDrpdwnValues();
        test.pass("Dropdown Values size: "+listdrpdwnValues.size());
        for(int i=0;i<listdrpdwnValues.size();i++ ){
            test.pass("List Values: "+listdrpdwnValues.get(i).getText());
            test.pass("Hrefvalue: "+listdrpdwnValues.get(i).getAttribute("href"));
            if(listdrpdwnValues.get(i).getText().equalsIgnoreCase("Learn XQuery")){
                test.pass("Learn XQuery value is displayed");
                listdrpdwnValues.get(i).click();
                break;
            }
        }

        logger.info("");
        test.info("");

    }
}
