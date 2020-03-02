package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to Traffic Tolls Map Viewer
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficTollsLocators {

	@Autowired
	public MapSYNQVerifyTrafficTollsLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_650_vroot']")
	public WebElement mpTollsIconsLoaded;
	
	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_650_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_1348']")
	public WebElement mpClickOnTollsIcon;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']/div/b")
	public WebElement mpTollsPopShown;

	@FindBy(xpath = "//*[@id='news_menu']/div/label[3]/span")
	public WebElement mpTollsBtnInfoPanel;
	
	@FindBy(xpath = "//*[@id='news_menu']")
	public WebElement mpTollsInfoPanel;
	
	@FindBy(xpath = "//*[@id='e6']/a")
	public WebElement mpTollsLinkInfoPanel;
	
	@FindBy(xpath = "//*[@id='searchERPsingapore']/input")
	public WebElement mpSearchTextTollsInfoPanel;
	
	@FindBy(xpath = "//div[contains(@title,'Toll')][@class='erpButtonItemInactive']")
	public WebElement mpTollsBtn;
}