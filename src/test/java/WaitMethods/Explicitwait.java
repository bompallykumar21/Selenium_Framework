package WaitMethods;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.WeddingShopRegisterPage;
import testBase.TestBase;

import java.io.IOException;

public class Explicitwait extends TestBase {

    @Test
    public void createAList() throws IOException, InterruptedException {
        try {
            logger = Logger.getLogger("CreateList");
            test = extentReports.createTest("testCase1");

            WeddingShopRegisterPage register = new WeddingShopRegisterPage();

            register.enterTitleValue("Page Object Model demo");
            test.pass("Title Value is entered");
            logger.info("Title Value is entered");

            if (register.getTxtEnterTitle().isDisplayed()) {
                test.fail("Title field is displayed");
            } else {
                test.pass("Title field is not displayed");
            }

            register.enterNameValue("FirstName");
            test.pass("FirstName Value is entered");
            logger.info("FirstName Value is entered");

            CaptureScreenshots(driver, "weddingShop");
        }catch (Exception e){
            test.fail("Exception observed: "+e);
        }
    }
}
