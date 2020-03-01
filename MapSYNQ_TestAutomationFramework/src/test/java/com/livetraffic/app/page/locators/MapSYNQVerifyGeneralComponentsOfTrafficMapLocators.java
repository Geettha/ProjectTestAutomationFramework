package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to GeneraL Components Map Viewer
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyGeneralComponentsOfTrafficMapLocators {

	@Autowired
	public MapSYNQVerifyGeneralComponentsOfTrafficMapLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='ad_toggle']")
	public WebElement mpGToggle;
	
	@FindBy(xpath = "//div/a[contains(@class,'header_logo sprite')]")
	public WebElement mpPageLogo;

	@FindBy(xpath = "//div[contains(@id,'OpenLayers.Control.Panel')]/div[@class='incidentsButtonItemActive']")
	public WebElement mpMapLoadIncidentSelected;
	
	@FindBy(xpath = "//div[contains(@id,'OpenLayers.Layer.Vector.RootContainer')]")
	public WebElement mpContainer;

	@FindBy(xpath = "//img[contains(@id,'QiPanZoomBar_2_panleft_innerImage')]")
	public WebElement mpDirectionIcon;
	
	@FindBy(xpath = "//div/img[contains(@id,'QiPanZoomBar_2_panup_innerImage')]")
	public WebElement mpNorthDirectionIcon;
	
	@FindBy(xpath = "//div/img[contains(@id,'QiPanZoomBar_2_panright_innerImage')]")
	public WebElement mpEastDirectionIcon;
	
	@FindBy(xpath = "//div/img[contains(@id,'QiPanZoomBar_2_panleft_innerImage')]")
	public WebElement mpWestDirectionIcon;
	
	@FindBy(xpath = "//div/img[contains(@id,'QiPanZoomBar_2_pandown_innerImage')]")
	public WebElement mpSouthDirectionIcon;

	@FindBy(xpath = "//div[contains(@id,'OpenLayers.Layer.Vector')][contains(@style,'top: -')]")
	public WebElement mpMapMoved;

	@FindBy(xpath = "//*[@id='OpenLayers_Control_PanZoomBar_ZoombarOpenLayers.Map_5']")
	public WebElement mpMapZoomBar;

	@FindBy(xpath = "//*[@id='QiPanZoomBar_2_zoomin_innerImage']")
	public WebElement mpZoomPlus;

	@FindBy(xpath = "//*[@id='QiPanZoomBar_2_zoomout_innerImage']")
	public WebElement mpZoomMinus;
	
	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_666_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_758']")
	public WebElement mpIncidentIconNearBoonLay;
	
	@FindBy(xpath = "//div//img[contains(@id,'QiPanZoomBar_2_OpenLayers.Map_5_innerImage')]")
	public WebElement mpZoomBarDragIcon;

	@FindBy(xpath = "//a[text()='Legend']")
	public WebElement mpLegendLink;
	
	@FindBy(xpath = "//div[@id='incidentLegend']")
	public WebElement mpIncidentLegendPopup;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	public WebElement mpCalendarLink;
	
	@FindBy(xpath = "//div[@id='divFltEvents']")
	public WebElement mpCalendarPopup;
	
	@FindBy(xpath = "//*[@id='sp_toggle']")
	public WebElement mpSPToggleBtn;
	
	@FindBy(xpath = "//*[@id='info_panel']")
	public WebElement mpInfoPanel;
}