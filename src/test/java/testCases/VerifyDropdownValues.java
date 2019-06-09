package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class VerifyDropdownValues extends TestBase {


    @Test
    public void verifyDropdownValues() throws InterruptedException {
        logger = Logger.getLogger("Dropdown");
        test = extentReports.createTest("Dropdown");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        RediffCreateAccount rediffCreateAccount = new RediffCreateAccount();

//        Select selectDay=new Select(rediffCreateAccount.getDrpdwnDay());


//        selectDay.selectByIndex();
//        selectDay.selectByValue();
//        selectDay.selectByVisibleText();

        Select selectCountry=new Select(rediffCreateAccount.getDrpdwnCountry());

        test.info(selectCountry.getFirstSelectedOption().getText());

        selectCountry.selectByIndex(2);  //selecting dropdown value based on index value
        Thread.sleep(3000);
        test.info(selectCountry.getFirstSelectedOption().getText());  //to get the option selected in the dropdown
        selectCountry.selectByValue("7");  //selecting dropdown value based on value
        Thread.sleep(3000);
        test.info(selectCountry.getFirstSelectedOption().getText());
        selectCountry.selectByVisibleText("Austria");  //selecting dropdown value based on visible text
        Thread.sleep(3000);
        test.info(selectCountry.getFirstSelectedOption().getText());
        logger.info("");
        test.info("");

    }
}
