package com.livetraffic.app.page.functions;

import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficCamerasLocators;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ Incidents Feature objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficCamerasPageObject extends AbstractBasePage {
	final MapSYNQVerifyTrafficCamerasLocators cameraLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;

	@Autowired
	public MapSYNQVerifyTrafficCamerasPageObject(final WebDriver driver) {
		super(driver);
		cameraLoc = PageFactory.initElements(driver, MapSYNQVerifyTrafficCamerasLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}
	
	public void clickCameraBtn() {
		cameraLoc.mpCameraBtnInfoPanel.click();
	}
	
	public void verifySingaporeLiveTrafficCamerasShown() {
		Assert.assertTrue(cameraLoc.mpCameraInfoPanel.isDisplayed());
	}
	


	public void clickOnCameraLinkInfo() {
		cameraLoc.mpCameraLinkInfoPanel.click();
	}
	
	public void verifyCameraPopShowOnMap() {
		Assert.assertTrue(cameraLoc.mpCameraPopShown.isDisplayed());
	}
	
	public void verifyCameraIconsDisplayedOnMap() {
		Assert.assertTrue(cameraLoc.mpCameraIconsLoaded.isDisplayed());
	}
	
	public void clickOnCameraIconImageOnMap() {
		cameraLoc.mpClickOnCameraIcon.click();
		
	}
	
	public void enterSearchTextInfoPanel(String field) {
		cameraLoc.mpSearchTextCameraInfoPanel.sendKeys(field);
	}
	
	public void clickOnCameraIconLink() {
		cameraLoc.mpCameraLinkInfoPanel.click();
	}
}



	

