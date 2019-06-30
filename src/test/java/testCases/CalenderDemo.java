package testCases;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.MakeMyTrip;
import testBase.TestBase;

public class CalenderDemo extends TestBase {
	MakeMyTrip makeMyTrip;
	List<WebElement> listDatesEnabled;

	@Test
	public void selectJouneyDetails() throws InterruptedException {
		String selectDate="30";
		logger = Logger.getLogger("Alert messages");
		test = extentReports.createTest("Alert messages");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		enterUrl("https://www.makemytrip.com/");
		makeMyTrip = new MakeMyTrip();
		makeMyTrip.getMenuFlights().click();
		checkTripSelection();
		makeMyTrip.getChkboxMultiCity().click();
		checkTripSelection();
//		makeMyTrip.getChkboxRoundTrip().click();
		makeMyTrip.getChkboxOneWay().click();
		checkTripSelection();
		makeMyTrip.getDepartureDate().click();
//		makeMyTrip.getBtnMovePrevMonth().click();;

		String CalenMonth=makeMyTrip.getCalMonth().getText();
		String calMonth=CalenMonth.substring(0, CalenMonth.length()-4);
		String calYear=makeMyTrip.getCalYear().getText();

		System.out.println(calMonth);
		System.out.println(calYear);

	
		listDatesEnabled = makeMyTrip.getLnkFocussedMonthDatesEnabled();
		System.out.println(listDatesEnabled.size());

		for(int i=0;i<listDatesEnabled.size();i++) {
			System.out.println(listDatesEnabled.get(i).getAttribute("aria-disabled"));
			i++;
		}
		
		List<WebElement> listDates = makeMyTrip.getLnkFocussedMonthDates();

		for(WebElement list:listDates) {
			System.out.println(list.getText());
			if(list.getText().equalsIgnoreCase(selectDate)) {
				list.click();
				Thread.sleep(5000);
			}
		}

	}

	public void checkTripSelection() throws InterruptedException {
		if (makeMyTrip.getChkboxMultiCitySelected().getAttribute("class").equalsIgnoreCase("selected")) {
			logger.info("Multicity option is selected by default");
		} else {
			logger.info("Multicity option is not selected by default");
		}

		if (makeMyTrip.getChkboxOneWaySelected().getAttribute("class").equalsIgnoreCase("selected")) {
			logger.info("One Way option is selected by default");
		} else {
			logger.info("One Way option is not selected by default");
		}

		if (makeMyTrip.getChkboxRoundTripSelected().getAttribute("class").equalsIgnoreCase("selected")) {
			logger.info("Round trip option is selected by default");
		} else {
			logger.info("Round trip option is not selected by default");
		}
	}
}
