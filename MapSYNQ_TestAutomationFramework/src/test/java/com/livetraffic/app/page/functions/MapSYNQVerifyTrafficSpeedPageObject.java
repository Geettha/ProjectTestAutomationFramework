package com.livetraffic.app.page.functions;

import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficSpeedLocators;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ Traffic Map Feature objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficSpeedPageObject extends AbstractBasePage {
	final MapSYNQVerifyTrafficSpeedLocators speedLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	private static final String INCIDENTS = "Incidents";
	private static final String DIRECTIONS = "Directions";
	private static final String TRAFFIC = "Traffic";
	private static final String CURRENT_LOC = "CurrentLocation";
	private static final String FROM_HERE = "FromHere";
	private static final String TO_HERE = "ToHere";
	private static final String ZOOM_IN = "Zoomin";
	private static final String STREET_VIEW = "StreetView";
	private static final String CALENDAR = "Calendar";
	private static final String PLACES = "Places";
	private static final String CLOSE = "Close";

	@Autowired
	public MapSYNQVerifyTrafficSpeedPageObject(final WebDriver driver) {
		super(driver);
		speedLoc = PageFactory.initElements(driver, MapSYNQVerifyTrafficSpeedLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}

	public void performRightClickSetCurrentLoc() {
		Actions action= new Actions(itsDriver);
		action.moveToElement(speedLoc.mpTrafficSpeedPanel).contextClick(speedLoc.mpTrafficSpeedPanel).build().perform();
		action
		  .sendKeys(Keys.ARROW_DOWN)
		  .sendKeys(Keys.ARROW_RIGHT)
		  .sendKeys(Keys.ENTER)
		  .build().perform();
		
		speedLoc.mpNorthDirectionIcon.click();
	}
	
	public void performRightClickResetCurrentLoc() {
		Actions action= new Actions(itsDriver);
		action.moveToElement(speedLoc.mpCurrentLocationIcon).contextClick(speedLoc.mpTrafficSpeedPanel).build().perform();
		action
		  .sendKeys(Keys.ARROW_DOWN)
		  .sendKeys(Keys.ARROW_RIGHT)
		  .sendKeys(Keys.ENTER)
		  .build().perform();
	}

	public void verifyCurrentLocationIconNotDisplay() {
		Assert.assertFalse(speedLoc.mpCurrentLocationIcon.isDisplayed());
	}

	public void verifyPopUpInfoPanelDisplay() {
		Assert.assertTrue(speedLoc.mpInfoPanel.isDisplayed());
	}

	public void verifyStreetViewDisplay() {
		speedLoc.mpCurrentLocationDisplStreetView.click();
	}


	public void verifyToLocationFieldInfoPanelPopulated() {
		Assert.assertTrue(speedLoc.mpDirectionTo.getAttribute("value").contains("Current Location"));
	}
	
	public void verifyFromLocationFieldInfoPanelPopulated() {
		Assert.assertTrue(speedLoc.mpDirectionFrom.getAttribute("value").contains("Current Location"));
	}
	
	public void verifyCurrentLocationDetailsPopUpDisplay() {
		Assert.assertTrue(speedLoc.mpCurrentLocationPopUp.isDisplayed());
	}
	
	public void verifyCurrentLocationIconDisplay() {
		Assert.assertTrue(speedLoc.mpCurrentLocationIcon.isDisplayed());
	}
	
	public void verifyLiveTrafficDisplay() {
		Assert.assertTrue(speedLoc.mpTrafficSpeedPanel.isDisplayed());
	}
	
	public void verifyInfoPanelDisplay() {
		Assert.assertTrue(speedLoc.mpInfoPanel.isDisplayed());
	}
	
	public void clickOnAdToggleButton() {
		wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpGToggle));
		//if (speedLoc.mpDirectionFrom.getAttribute("class").contains("sprite ad_bar_toggle ad_bar_collapse")) {
		speedLoc.mpGToggle.click();

	//}
	}
	
	public void clickIconsButtons(String field) {
		switch (field) {
		case INCIDENTS:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpIncidentsBtn));
			speedLoc.mpIncidentsBtn.click();
			break;
		case DIRECTIONS:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpDirectionBtn));
			speedLoc.mpDirectionBtn.click();
			break;
		case TRAFFIC:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpTrafficSpeedBtn));
			speedLoc.mpTrafficSpeedBtn.click();
			break;	
		case CURRENT_LOC:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationIcon));
			speedLoc.mpCurrentLocationIcon.click();
			break;	
		case FROM_HERE:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationFromHereLink));
			speedLoc.mpCurrentLocationFromHereLink.click();
			break;	
		case TO_HERE:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationToHereLink));
			speedLoc.mpCurrentLocationToHereLink.click();
			break;	
		case ZOOM_IN:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationZoomLink));
			speedLoc.mpCurrentLocationZoomLink.click();
			break;	
		case STREET_VIEW:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationStreetViewLink));
			speedLoc.mpCurrentLocationStreetViewLink.click();
			break;
		case CALENDAR:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationCalendarLink));
			speedLoc.mpCurrentLocationCalendarLink.click();
			break;	
		case PLACES:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpCurrentLocationPlacesLink));
			speedLoc.mpCurrentLocationPlacesLink.click();
			break;	
		case CLOSE:
			wait.until(ExpectedConditions.elementToBeClickable(speedLoc.mpPopupClose));
			speedLoc.mpPopupClose.click();
			break;
		default:
			Assert.fail("Given field is not available: " + field);
			break;
		}
	}
}



	

