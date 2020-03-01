package com.livetraffic.app.page.functions;

import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficParkingLocators;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ Parking Feature objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficParkingPageObject extends AbstractBasePage {
	final MapSYNQVerifyTrafficParkingLocators parkingLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	private static final String INCIDENTS = "Incidents";
	private static final String ZOOM_IN = "Zoomin";
	private static final String PARKINGICON = "ParkingIcon";
	private static final String PARKINGSLOTS = "ParkingSlots";
	private static final String PARKING = "Parking";

	@Autowired
	public MapSYNQVerifyTrafficParkingPageObject(final WebDriver driver) {
		super(driver);
		parkingLoc = PageFactory.initElements(driver, MapSYNQVerifyTrafficParkingLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}

	public void verifyParkingSlotsIconDisplayed() throws Exception {
		// wait.until(ExpectedConditions.visibilityOf(parkingLoc.mpParkingSlotsIconLoadedOnMap));
		pause(20000);
		Assert.assertTrue(parkingLoc.mpParkingSlotsIconLoadedOnMap.isEnabled());
	}
	
	public void verifyContentPopDisplayedOnMap() {
		wait.until(ExpectedConditions.visibilityOf(parkingLoc.mpParkingContentPopUp));
		Assert.assertTrue(parkingLoc.mpParkingContentPopUp.isDisplayed());
	}
	


	public void verifyMapZoomedAndParkingSlotsIconDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(parkingLoc.mpParkingSlotsIconLoadedOnMap));
		Assert.assertTrue(parkingLoc.mpParkingSlotsIconLoadedOnMap.isDisplayed());
	}
	
	public void clickIconsParking(String field) {
		switch (field) {
		case INCIDENTS:
			wait.until(ExpectedConditions.elementToBeClickable(parkingLoc.mpIncidentBtn));
			parkingLoc.mpIncidentBtn.click();
			break;
		case PARKING:
			wait.until(ExpectedConditions.elementToBeClickable(parkingLoc.mpParkinBtn));
			parkingLoc.mpParkinBtn.click();
			break;	
		case PARKINGSLOTS:
			wait.until(ExpectedConditions.elementToBeClickable(parkingLoc.mpParkingSlotsIconLoadedOnMap));
			parkingLoc.mpParkingSlotsIconLoadedOnMap.click();
			break;	
		case ZOOM_IN:
			wait.until(ExpectedConditions.elementToBeClickable(parkingLoc.mpParkingZoomIn));
			parkingLoc.mpParkingZoomIn.click();
			break;	
		case PARKINGICON:
			wait.until(ExpectedConditions.elementToBeClickable(parkingLoc.mpParkingSlotsIconLoadedOnMap));
			parkingLoc.mpParkingSlotsIconLoadedOnMap.click();
			break;
		default:
			Assert.fail("Given field is not available: " + field);
			break;
		}
	}
}



	

