package com.livetraffic.app.page.functions;

import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQVerifyTrafficTollsLocators;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ Tolls feature objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficTollsPageObject extends AbstractBasePage {
	final MapSYNQVerifyTrafficTollsLocators tollsLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;

	@Autowired
	public MapSYNQVerifyTrafficTollsPageObject(final WebDriver driver) {
		super(driver);
		tollsLoc = PageFactory.initElements(driver, MapSYNQVerifyTrafficTollsLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}
	
	public void clickTollsBtnOnInfoPanel() {
		tollsLoc.mpTollsBtnInfoPanel.click();
	}
	
	public void verifySingaporeLiveTrafficTollsShown() {
		wait.until(ExpectedConditions.visibilityOf(tollsLoc.mpTollsInfoPanel));
		Assert.assertTrue(tollsLoc.mpTollsInfoPanel.isDisplayed());
	}
	


	public void clickOnTollsLinkInfo() {
		tollsLoc.mpTollsLinkInfoPanel.click();
	}
	
	public void verifyTollsInfoLinkShown() {
		Assert.assertTrue(tollsLoc.mpTollsLinkInfoPanel.isDisplayed());
	}
	
	public void verifyTollsPopShowOnMap() {
		Assert.assertTrue(tollsLoc.mpTollsPopShown.isDisplayed());
	}
	
	public void verifyTollsIconsDisplayedOnMap() {
		wait.until(ExpectedConditions.visibilityOf(tollsLoc.mpTollsIconsLoaded));
		Assert.assertTrue(tollsLoc.mpTollsIconsLoaded.isDisplayed());
	}
	
	public void clickOnTollsIconImageOnMap() {
		tollsLoc.mpClickOnTollsIcon.click();
		
	}
	
	public void enterSearchTextInfoPanel(String field) {
		wait.until(ExpectedConditions.visibilityOf(tollsLoc.mpSearchTextTollsInfoPanel));
		tollsLoc.mpSearchTextTollsInfoPanel.sendKeys(field);
	}
	
	public void clickOnTollsIconLink() {
		tollsLoc.mpTollsLinkInfoPanel.click();
	}
	
	public void clickOnTollsIconBtnOnMap() {
		tollsLoc.mpTollsBtn.click();
	}
}



	

