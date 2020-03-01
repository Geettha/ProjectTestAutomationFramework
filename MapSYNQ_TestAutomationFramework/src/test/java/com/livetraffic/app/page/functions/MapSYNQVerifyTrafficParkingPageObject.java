package com.livetraffic.app.page.functions;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import com.livetraffic.app.lib.helper.PropertiesLoader;
import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQCreateNewAccountLocators;
import com.livetraffic.app.page.locators.MapSYNQVerifyGeneralComponentsOfTrafficMapLocators;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficIncidentsLocators;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficParkingLocators;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficSpeedLocators;
import com.livetraffic.app.stepdefinition.MapSYNQCreateNewAccountStep;
import com.livetraffic.app.stepdefinition.MapSYNQVerifyTrafficIncidentsStep;
import com.livetraffic.app.stepdefinition.MapSYNQVerifyTrafficParkingStep;
import com.livetraffic.app.stepdefinition.MapSYNQVerifyTrafficSpeedStep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficParkingStep.class.getName());
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

	public Properties testProps() {
		return PropertiesLoader.getInstance().load("userdetails.properties");
	}
	
	public void verifyParkingSlotsIconDisplayed() throws Exception {
		// wait.until(ExpectedConditions.(parkingLoc.mpParkingSlotsIconLoadedOnMap));
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



	

