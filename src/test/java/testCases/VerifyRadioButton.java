package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class VerifyRadioButton extends TestBase {


    @Test
    public void verifyRadioButton(){
        logger = Logger.getLogger("Radiobutton");
        test = extentReports.createTest("Radiobutton");
        RediffCreateAccount rediffCreateAccount=new RediffCreateAccount();

        logger.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnMale().isDisplayed()); 
        
        logger.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnMale().isEnabled());
        logger.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnMale().isSelected());
        test.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnMale().isDisplayed());
        test.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnMale().isEnabled());
        test.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnMale().isSelected());
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(rediffCreateAccount.getChkboxAlternateEmail()));
//        wait.until(ExpectedConditions.elementToBeSelected(rediffCreateAccount.getChkboxAlternateEmail()));

        if(rediffCreateAccount.getRadioBtnMale().isSelected()) {
            logger.info("Radiobutton is already selected");
            test.pass("Radiobutton is already selected");
        }else{
            rediffCreateAccount.getRadioBtnMale().click();
            logger.info("Radiobutton is selected");
            test.pass("Radiobutton is selected");
        }

        logger.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnMale().isDisplayed());
        logger.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnMale().isEnabled());
        logger.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnMale().isSelected());
        test.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnMale().isDisplayed());
        test.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnMale().isEnabled());
        test.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnMale().isSelected());

        test.pass("Radiobutton is clicked");



    }
}
