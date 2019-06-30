package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import java.util.List;

public class MakeMyTrip extends TestBase {

    public MakeMyTrip(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")
    WebElement menuFlights;

    @FindBy(xpath="//li[text()='Oneway']//span")
    WebElement chkboxOneWay;

    @FindBy(xpath="//li[text()='Round Trip']//span")
    WebElement chkboxRoundTrip;

    @FindBy(xpath="//li[text()='Multi City']//span")
    WebElement chkboxMultiCity;

    @FindBy(xpath="//li[text()='Oneway']")
    WebElement chkboxOneWaySelected;

    @FindBy(xpath="//li[text()='Round Trip']")
    WebElement chkboxRoundTripSelected;

    @FindBy(xpath="//li[text()='Multi City']")
    WebElement chkboxMultiCitySelected;

    @FindBy(xpath="//*[@for='departure']")
    WebElement departureDate;

    @FindBy(xpath="//div[@class='DayPicker-Month'][1]//child::div[@class='DayPicker-Caption']//div")
    WebElement calMonth;

    @FindBy(xpath="//div[@class='DayPicker-Month'][1]//child::div[@class='DayPicker-Caption']//span")
    WebElement calYear;
    
    @FindBy(xpath="//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]")
    WebElement btnMoveNextMonth;
    
    @FindBy(xpath="//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--prev')]")
    WebElement btnMovePrevMonth;
    
	@FindAll({@FindBy(xpath="//div[contains(@class,'DayPicker-wrapper')]//div[1]//div[3]//div//div//div[1]")})
	List<WebElement> lnkFocussedMonthDates;	
	
	@FindAll({@FindBy(xpath="//div[contains(@class,'DayPicker-wrapper')]//div[1]//div[3]//div//div")})
	List<WebElement> lnkFocussedMonthDatesEnabled;	
	
    public List<WebElement> getLnkFocussedMonthDatesEnabled() {
		return lnkFocussedMonthDatesEnabled;
	}

	public WebElement getBtnMoveNextMonth() {
		return btnMoveNextMonth;
	}

	public WebElement getBtnMovePrevMonth() {
		return btnMovePrevMonth;
	}

	public List<WebElement> getLnkFocussedMonthDates() {
		return lnkFocussedMonthDates;
	}

	public WebElement getCalMonth() {
        return calMonth;
    }

    public WebElement getCalYear() {
        return calYear;
    }

    public WebElement getDepartureDate() {
        return departureDate;
    }

    public WebElement getChkboxOneWaySelected() {
        return chkboxOneWaySelected;
    }

    public WebElement getChkboxRoundTripSelected() {
        return chkboxRoundTripSelected;
    }

    public WebElement getChkboxMultiCitySelected() {
        return chkboxMultiCitySelected;
    }

    public WebElement getMenuFlights() {
        return menuFlights;
    }

    public WebElement getChkboxOneWay() {
        return chkboxOneWay;
    }

    public WebElement getChkboxRoundTrip() {
        return chkboxRoundTrip;
    }

    public WebElement getChkboxMultiCity() {
        return chkboxMultiCity;
    }
//    @FindAll({@FindBy(xpath="//li[starts-with(@select-id,'results')]")})
//    List<WebElement> ;



}
