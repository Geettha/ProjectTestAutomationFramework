package com.livetraffic.app.page.functions;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import com.livetraffic.app.lib.helper.PropertiesLoader;
import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficIncidentsLocators;
import com.livetraffic.app.stepdefinition.MapSYNQVerifyTrafficIncidentsStep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ Incidents Feature objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficIncidentsPageObject extends AbstractBasePage {
	final MapSYNQVerifyTrafficIncidentsLocators incidentLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficIncidentsStep.class.getName());
	private static final String INCIDENTS = "Incidents";
	private static final String ZOOM_IN = "Zoomin";
	private static final String LIVE = "Live";
	private static final String ACCIDENT = "Accident";
	private static final String HEAVYTRAFFIC = "HeavyTraffic";
	private static final String INCIDENTSLINK = "IncidentsLink";
	private static final String INCIDENTSICON = "Incident";

	@Autowired
	public MapSYNQVerifyTrafficIncidentsPageObject(final WebDriver driver) {
		super(driver);
		incidentLoc = PageFactory.initElements(driver, MapSYNQVerifyTrafficIncidentsLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}

	public Properties testProps() {
		return PropertiesLoader.getInstance().load("userdetails.properties");
	}
	
	public void verifyContentPouUpMapDisplay() {
		Assert.assertTrue(incidentLoc.mpIncidentContentPopUp.isDisplayed());
	}
	
	public void verifyNewsPanelDisplay() {
		Assert.assertTrue(incidentLoc.mpNewsPanel.isDisplayed());
	}
	


	public void verifyIncidentDetailsPopUpShown() {
		Assert.assertTrue(incidentLoc.mpTrafficIncidentContentPopUpMap.isDisplayed());
	}
	
	public void verifyItemsShownInNewsInfoSearch() {
		List<WebElement> elements = itsDriver.findElements(By.xpath("//*[@id='search_incident_singapore']//li"));
		for (@SuppressWarnings("unused") WebElement ele : elements){
			Assert.assertTrue(incidentLoc.mpIncidentsItemsShown.isDisplayed());
		}
	}
	
	public void searchIncidentItemInTextBox(String ItemToSearch) {
		incidentLoc.mpTrafficIncidentsSearch.sendKeys(ItemToSearch);
	}
	
	public void verifyContentPopUpMatches(String incident) {
		WebElement element = itsDriver.findElement(By.xpath("//*[@id='" + incident + "']/div/div[contains(@class,'item_icon sprite')]//following-sibling::div"));
		String textInfoPanel = element.getText();
		String textContentPopUp = incidentLoc.mpIncidentItemMapInfoContent.getText();
		if (textInfoPanel.contains(textContentPopUp)){
			Log.info("Content Matches");
		}
	}
	

	public void zoomContentImageShown() {
		Assert.assertTrue(incidentLoc.mpTrafficIncidentZoominImage.isDisplayed());
	}

	
	public void clickInfoPanel(String field) {
		switch (field) {
		case LIVE:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpLiveBtn));
			incidentLoc.mpLiveBtn.click();
			break;
		case INCIDENTS:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpIncidentItemInfoPanelContent));
			incidentLoc.mpIncidentItemInfoPanelContent.click();
			break;
		case ACCIDENT:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpAccidentItemInfoPanelContent));
			incidentLoc.mpAccidentItemInfoPanelContent.click();
			break;	
		case HEAVYTRAFFIC:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpTrafficJamItemInfoPanelContent));
			incidentLoc.mpTrafficJamItemInfoPanelContent.click();
			break;	
		case INCIDENTSLINK:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpIncidentContentPopUpLink));
			incidentLoc.mpIncidentContentPopUpLink.click();
			break;	
		case ZOOM_IN:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpTrafficIncidentsContenPupupZoominLink));
			incidentLoc.mpTrafficIncidentsContenPupupZoominLink.click();
			break;
		case INCIDENTSICON:
			wait.until(ExpectedConditions.elementToBeClickable(incidentLoc.mpTrafficIncidentIconOnMap));
			incidentLoc.mpTrafficIncidentIconOnMap.click();
			break;
		default:
			Assert.fail("Given field is not available: " + field);
			break;
		}
	}
}



	

