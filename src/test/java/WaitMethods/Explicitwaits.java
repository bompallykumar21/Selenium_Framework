package WaitMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

import java.io.IOException;

public class Explicitwaits extends TestBase {

    @Test
    public void createAList() throws IOException, InterruptedException {
        try {
            logger = Logger.getLogger("Explicit Wait");
            test = extentReports.createTest("Explicit Wait");

            WeddingShopRegisterPage register = new WeddingShopRegisterPage();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(register.getTxtEnterTitle()));

            if (register.getTxtEnterTitle().isDisplayed()) {
                test.pass("Title field is displayed");
                register.enterTitleValue("Page Object Model demo");
            } else {
                test.fail("Title field is not displayed");
                logger.error("Title field is not displayed");
            }

            wait.until(ExpectedConditions.elementToBeClickable(register.getBtnSubmit()));
            register.getBtnSubmit().click();

        }catch (Exception e){
            test.fail("Exception observed: "+e);
        }
    }
}
