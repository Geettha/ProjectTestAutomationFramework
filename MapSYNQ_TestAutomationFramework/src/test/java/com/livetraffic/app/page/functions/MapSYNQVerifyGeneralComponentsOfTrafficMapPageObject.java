package com.livetraffic.app.page.functions;

import java.util.logging.Logger;

import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyGeneralComponentsOfTrafficMapLocators;
import com.livetraffic.app.stepdefinition.MapSYNQVerifyGeneralComponentsOfTrafficMapStep;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ create new account page objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject extends AbstractBasePage {
	final MapSYNQVerifyGeneralComponentsOfTrafficMapLocators mapLocators;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	private final static Logger Log = Logger.getLogger(MapSYNQVerifyGeneralComponentsOfTrafficMapStep.class.getName());
	private static final String NORTH = "North";
	private static final String SOUTH = "South";
	private static final String EAST = "East";
	private static final String WEST = "West";
	private static final String PLUS = "Plus";
	private static final String MINUS = "Minus";
	private static final String LEGEND = "Legend";
	private static final String CALENDAR = "Calendar";

	@Autowired
	public MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject(final WebDriver driver) {
		super(driver);
		mapLocators = PageFactory.initElements(driver, MapSYNQVerifyGeneralComponentsOfTrafficMapLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}

	public void verifyMapSYNQPageDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(mapLocators.mpContainer));
		Assert.assertTrue(mapLocators.mpPageLogo.isDisplayed());
		Assert.assertTrue(mapLocators.mpContainer.isDisplayed());
		
	}

	public void verifyMapDisplayedWithIncidentsSelected() {
		wait.until(ExpectedConditions.visibilityOf(mapLocators.mpContainer));
		Assert.assertTrue(mapLocators.mpContainer.isDisplayed());
		Assert.assertTrue(mapLocators.mpMapLoadIncidentSelected.isDisplayed());

	}
	
	public void clickOnAdToggleButton() {
		wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpGToggle));
		mapLocators.mpGToggle.click();

	}
	
	public void verifyGTogglePage() {
		Assert.assertTrue(mapLocators.mpIncidentIconNearBoonLay.isDisplayed());

	}


	public void verifyDirectionIconVisibility() {
		Assert.assertTrue(isElementDisplayed(mapLocators.mpDirectionIcon));
	}

	public void verifyMappMoved() {
		wait.until(ExpectedConditions.visibilityOf(mapLocators.mpMapMoved));
		Assert.assertTrue(mapLocators.mpMapMoved.isEnabled());
	}

	public void verifyZoomIconBar() {
		wait.until(ExpectedConditions.visibilityOf(mapLocators.mpMapZoomBar));
		Assert.assertTrue(mapLocators.mpMapZoomBar.isDisplayed());
	}

	public void verifyZoomDragIcon() {
		mapLocators.mpZoomBarDragIcon.click();
	}


	public void verifyLegendPopup() {
		mapLocators.mpIncidentLegendPopup.click();
	}
	
	public void verifyCalendarPopup() {
		mapLocators.mpCalendarPopup.click();
	}
	
	public void verifyZoomFunctionalityForPlus() {
		if (!(mapLocators.mpIncidentIconNearBoonLay.isDisplayed())) {
			Log.info("Working as expected");
		}
	}
	
	public void verifyZoomFunctionalityForMinus() {
		if (mapLocators.mpIncidentIconNearBoonLay.isDisplayed()) {
			Log.info("Working as expected");
		}
	}
	
	public void verifySToggleButtonClick() {
		mapLocators.mpSPToggleBtn.click();
		
	}
	
	public void verifyInfoPanelDisplay() {
		if (!(mapLocators.mpInfoPanel.isDisplayed())) {
			Log.info("SToggle Click Working as expected");
		}
	}
	
	public void clickIcons(String direction) {
		switch (direction) {
		case NORTH:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpNorthDirectionIcon));
			mapLocators.mpNorthDirectionIcon.click();
			//jsMoveToElementAndClick(itsDriver, mapLocators.mpNorthDirectionIcon);
			break;
		case SOUTH:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpSouthDirectionIcon));
			mapLocators.mpSouthDirectionIcon.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpSouthDirectionIcon);
			break;
		case EAST:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpEastDirectionIcon));
			mapLocators.mpEastDirectionIcon.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpEastDirectionIcon);
			break;	
		case WEST:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpWestDirectionIcon));
			mapLocators.mpWestDirectionIcon.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpWestDirectionIcon);
			break;	
		case PLUS:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpZoomPlus));
			mapLocators.mpZoomPlus.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpZoomPlus);
			break;
		case MINUS:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpZoomMinus));
			mapLocators.mpZoomMinus.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpZoomMinus);
			break;
		case LEGEND:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpLegendLink));
			mapLocators.mpLegendLink.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpLegendLink);
			break;
		case CALENDAR:
			wait.until(ExpectedConditions.elementToBeClickable(mapLocators.mpCalendarLink));
			mapLocators.mpCalendarLink.click();
			// jsMoveToElementAndClick(itsDriver, mapLocators.mpCalendarLink);
			break;
		default:
			Assert.fail("Given Direction is not available: " + direction);
			break;
		}
	}
}



	

