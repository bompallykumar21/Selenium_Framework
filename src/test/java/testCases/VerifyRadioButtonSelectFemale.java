package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

public class VerifyRadioButtonSelectFemale extends TestBase {


    @Test
    public void verifyRadioButton(){
        logger = Logger.getLogger("Radiobutton");
        test = extentReports.createTest("Radiobutton");
        RediffCreateAccount rediffCreateAccount=new RediffCreateAccount();

        logger.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnFemale().isDisplayed());
        logger.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnFemale().isEnabled());
        logger.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnFemale().isSelected());
        test.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnFemale().isDisplayed());
        test.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnFemale().isEnabled());
        test.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnFemale().isSelected());
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(rediffCreateAccount.getChkboxAlternateEmail()));
//        wait.until(ExpectedConditions.elementToBeSelected(rediffCreateAccount.getChkboxAlternateEmail()));

        if(rediffCreateAccount.getRadioBtnFemale().isSelected()) {
            logger.info("Radiobutton is already selected");
            test.pass("Radiobutton is already selected");
        }else{
            rediffCreateAccount.getRadioBtnFemale().click();
            logger.info("Radiobutton is selected");
            test.pass("Radiobutton is selected");
        }

        logger.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnFemale().isDisplayed());
        logger.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnFemale().isEnabled());
        logger.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnFemale().isSelected());
        test.info("is Radiobutton Displayed: "+rediffCreateAccount.getRadioBtnFemale().isDisplayed());
        test.info("is Radiobutton Enabled: "+rediffCreateAccount.getRadioBtnFemale().isEnabled());
        test.info("is Radiobutton Selected: "+rediffCreateAccount.getRadioBtnFemale().isSelected());

        test.pass("Radiobutton is clicked");



    }
}
