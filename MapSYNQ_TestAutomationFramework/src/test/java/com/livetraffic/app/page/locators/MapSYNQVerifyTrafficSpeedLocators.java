package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to Traffic Map Viewer
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficSpeedLocators {

	@Autowired
	public MapSYNQVerifyTrafficSpeedLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@title,'Incidents')][@class='incidentsButtonItemActive']")
	public WebElement mpIncidentsBtn;
	
	@FindBy(xpath = "//*[@id='info_panel']/div/div/a[@class='tab_button directions_tab sprite']")
	public WebElement mpDirectionBtn;
	
	@FindBy(xpath = "//*[@id='info_panel']")
	public WebElement mpInfoPanel;

	@FindBy(xpath = "//div[contains(@title,'Speed')][@class='speedButtonItemInactive']")
	public WebElement mpTrafficSpeedBtn;
	
	@FindBy(xpath = "//*[@id='OpenLayers.Control.Panel_676']")
	public WebElement mpTrafficSpeedPanel;
	
	@FindBy(xpath = "//div/img[contains(@id,'QiPanZoomBar_2_panup_innerImage')]")
	public WebElement mpNorthDirectionIcon;
	
	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_549_vroot']")
	public WebElement mpCurrentLocationIcon;
	
	@FindBy(xpath = "//*[@id='popup_windows_undefined']")
	public WebElement mpCurrentLocationPopUp;

	@FindBy(xpath = "//*[@id='popup_content_undefined']/span[2]/span[1]/a")
	public WebElement mpCurrentLocationFromHereLink;

	@FindBy(xpath = "//*[@id='popup_content_undefined']/span[2]/span[2]/a")
	public WebElement mpCurrentLocationToHereLink;

	@FindBy(xpath = "//*[@id='poi_from']")
	public WebElement mpDirectionFrom;

	@FindBy(xpath = "//*[@id='poi_to']")
	public WebElement mpDirectionTo;
	
	@FindBy(xpath = "//*[@id='popup_content_undefined']/span/span/a[contains(text(),'Zoom in')]")
	public WebElement mpCurrentLocationZoomLink;
	
	@FindBy(xpath = "//div[contains(@id,'OpenLayers.Layer.Vector')][contains(@style,'top: -')]")
	public WebElement mpMapMoved;

	@FindBy(xpath = "//*[@id='popup_content_undefined']/span/span/a[contains(text(),'Street View')]")
	public WebElement mpCurrentLocationStreetViewLink;
	
	@FindBy(xpath = "//*[@id='div_street_view']")
	public WebElement mpCurrentLocationDisplStreetView;
	
	@FindBy(xpath = "//*[@id='popup_content_undefined']/span/span/a[contains(text(),'Calendar')]")
	public WebElement mpCurrentLocationCalendarLink;
	
	@FindBy(xpath = "//*[@id='popup_content_undefined']/span/span/a[contains(text(),'Places')]")
	public WebElement mpCurrentLocationPlacesLink;
	
	@FindBy(xpath = "//*[@id='popup_close']")
	public WebElement mpPopupClose;
	
	@FindBy(xpath = "//*[@id='dialog_login']")
	public WebElement mpLoginDialog;
	
	@FindBy(xpath = "//div[@id='ad_toggle']")
	public WebElement mpGToggle;

}