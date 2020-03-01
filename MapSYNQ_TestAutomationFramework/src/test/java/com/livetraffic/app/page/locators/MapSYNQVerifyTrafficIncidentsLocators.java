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
public class MapSYNQVerifyTrafficIncidentsLocators {

	@Autowired
	public MapSYNQVerifyTrafficIncidentsLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=info_panel]/div/div/a[3]")
	public WebElement mpLiveBtn;
	
	@FindBy(xpath = "//*[@id='news_menu']")
	public WebElement mpNewsPanel;
	
	@FindBy(xpath = "//*[@id='Incidents0']/div/div[contains(@class,'item_icon sprite orange_cone_nopin')]")
	public WebElement mpItemIncidentRoadWork;

	@FindBy(xpath = "//*[@id='popup_contentDiv']")
	public WebElement mpIncidentContentPopUp;
	
	@FindBy(xpath = "//ul/li/a[@id='Incidents0']")
	public WebElement mpIncidentItemInfoPanelContent;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']/div/b")
	public WebElement mpIncidentItemMapInfoContent;
	
	@FindBy(xpath = "//*[@id='Incidents1']/div/div[contains(@class,'item_icon sprite red_cross_nopin')]//following::div")
	public WebElement mpAccidentItemInfoPanelContent;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']/div/b[text()='Accident']")
	public WebElement mpAccidentItemMapInfoContent;

	@FindBy(xpath = "//*[contains(@id,'Incidents')]/div/div[contains(@class,'item_icon sprite road_jam_nopin')]")
	public WebElement mpTrafficJamItemInfoPanelContent;

	@FindBy(xpath = "//*[@id='popup_contentDiv']/div/b[text()='Heavy Traffic']")
	public WebElement mpTrafficJamItemMapInfoContent;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']/a[1]")
	public WebElement mpIncidentContentPopUpLink;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']")
	public WebElement mpTrafficIncidentContentPopUpMap;

	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_666_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_758']")
	public WebElement mpTrafficIncidentIconOnMap;

	@FindBy(xpath = "//*[@id='searchIncidentssingapore']/input")
	public WebElement mpTrafficIncidentsSearch;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv]/div/br//following::br")
	public WebElement mpTrafficIncidentZoominContentPopUpMap;

	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_666_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_726']")
	public WebElement mpTrafficIncidentZoominImage;

	@FindBy(xpath = "//*[@id='popup_contentDiv']/a[text()='Zoom in']")
	public WebElement mpTrafficIncidentsContenPupupZoominLink;
	
	@FindBy(xpath = "//ul/li/a[@id='Incidents1']")
	public WebElement mpIncidentsItemsShown;

}