package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.RediffCreateAccount;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class StoreDropdownValues extends TestBase {


    @Test
    public void verifyDropdownValues() throws InterruptedException {
        logger = Logger.getLogger("Dropdown");
        test = extentReports.createTest("Dropdown");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        RediffCreateAccount rediffCreateAccount = new RediffCreateAccount();

        Select selectCountry=new Select(rediffCreateAccount.getDrpdwnCountry());

        List<WebElement> list=new ArrayList<WebElement>();


//        list=driver.findElements(By.xpath("//select[@id='country']//option"));
        list=selectCountry.getOptions();

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }


        test.info(selectCountry.getFirstSelectedOption().getText());


    }
}
