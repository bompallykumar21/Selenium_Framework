package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class VerifyCheckBoxes extends TestBase {


    @Test
    public void verifyCheckBoxes(){
        logger = Logger.getLogger("Explicit Wait");
        test = extentReports.createTest("Explicit Wait");
        RediffCreateAccount rediffCreateAccount=new RediffCreateAccount();

        logger.info("is Checkbox Displayed: "+rediffCreateAccount.getChkboxAlternateEmail().isDisplayed());
        logger.info("is Checkbox Enabled: "+rediffCreateAccount.getChkboxAlternateEmail().isEnabled());
        logger.info("is Checkbox Selected: "+rediffCreateAccount.getChkboxAlternateEmail().isSelected());
        test.info("is Checkbox Displayed: "+rediffCreateAccount.getChkboxAlternateEmail().isDisplayed());
        test.info("is Checkbox Enabled: "+rediffCreateAccount.getChkboxAlternateEmail().isEnabled());
        test.info("is Checkbox Selected: "+rediffCreateAccount.getChkboxAlternateEmail().isSelected());
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(rediffCreateAccount.getChkboxAlternateEmail()));
//        wait.until(ExpectedConditions.elementToBeSelected(rediffCreateAccount.getChkboxAlternateEmail()));

        if(rediffCreateAccount.getChkboxAlternateEmail().isSelected()) {
            logger.info("Check box is already selected");
            test.pass("Check box is already selected");
        }else{
            rediffCreateAccount.getChkboxAlternateEmail().click();
            logger.info("Check box is selected");
            test.pass("Check box is selected");
        }

        logger.info("is Checkbox Displayed: "+rediffCreateAccount.getChkboxAlternateEmail().isDisplayed());
        logger.info("is Checkbox Enabled: "+rediffCreateAccount.getChkboxAlternateEmail().isEnabled());
        logger.info("is Checkbox Selected: "+rediffCreateAccount.getChkboxAlternateEmail().isSelected());
        test.info("is Checkbox Displayed: "+rediffCreateAccount.getChkboxAlternateEmail().isDisplayed());
        test.info("is Checkbox Enabled: "+rediffCreateAccount.getChkboxAlternateEmail().isEnabled());
        test.info("is Checkbox Selected: "+rediffCreateAccount.getChkboxAlternateEmail().isSelected());

        test.pass("check box is clicked");



    }
}
