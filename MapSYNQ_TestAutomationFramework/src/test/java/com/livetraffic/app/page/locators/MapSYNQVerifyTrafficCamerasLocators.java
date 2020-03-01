package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to Traffic Cameras Map Viewer
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQVerifyTrafficCamerasLocators {

	@Autowired
	public MapSYNQVerifyTrafficCamerasLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_642_vroot']")
	public WebElement mpCameraIconsLoaded;
	
	@FindBy(xpath = "//*[local-name()='svg']//*[local-name()='g' and @id='OpenLayers.Layer.Vector_642_vroot']//*[local-name()='image' and @id='OpenLayers.Geometry.Point_1092']")
	public WebElement mpClickOnCameraIcon;
	
	@FindBy(xpath = "//*[@id='popup_contentDiv']/div/b")
	public WebElement mpCameraPopShown;

	@FindBy(xpath = "//*[@id='news_menu']/div/label[2]/span")
	public WebElement mpCameraBtnInfoPanel;
	
	@FindBy(xpath = "//*[@id='news_menu']")
	public WebElement mpCameraInfoPanel;
	
	@FindBy(xpath = "//*[@id='c6705']/a")
	public WebElement mpCameraLinkInfoPanel;
	
	@FindBy(xpath = "//*[@id='searchCamerasingapore']/input")
	public WebElement mpSearchTextCameraInfoPanel;
	
	@FindBy(xpath = "//div[contains(@title,'Traffic Camera')][@class='cameraButtonItemInactive']")
	public WebElement mpCameraBtn;
}