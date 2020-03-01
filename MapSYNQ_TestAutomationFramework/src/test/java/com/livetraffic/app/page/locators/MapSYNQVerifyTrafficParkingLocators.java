package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to Traffic Parking Viewer
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficParkingLocators {

	@Autowired
	public MapSYNQVerifyTrafficParkingLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@title,'Incidents')][@class='incidentsButtonItemActive']")
	public WebElement mpIncidentBtn;
	
	@FindBy(xpath = "//div[contains(@title,'Parking')][@class='parkingButtonItemInactive']")
	public WebElement mpParkinBtn;
	
	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_666_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_728']")
	public WebElement mpParkingSlotsIconLoadedOnMap;

	@FindBy(xpath = "//*[@id='popup_contentDiv']")
	public WebElement mpParkingContentPopUp;
	
	@FindBy(xpath = "//div[@id='popup_contentDiv']/a[text()='Zoom in']")
	public WebElement mpParkingZoomIn;

}