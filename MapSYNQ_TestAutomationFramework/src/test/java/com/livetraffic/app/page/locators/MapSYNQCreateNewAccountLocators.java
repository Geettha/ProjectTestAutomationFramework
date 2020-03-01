package com.livetraffic.app.page.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <!--
 * ==========================================================================================================
 * --> This Class contains all locators specific to Create New Account
 * mapSYNQ  application
 * 
 * @author Geethanjali
 * @lastrev fixXXXXX - new class <!--
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQCreateNewAccountLocators {

	@Autowired
	public MapSYNQCreateNewAccountLocators(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/a[contains(@class,'header_logo sprite')]")
	public WebElement mpPageLogo;

	@FindBy(xpath = "//*[@id='div_header']/div/div/a[contains(text(),'Register')]")
	public WebElement mpRegisterLink;

	@FindBy(xpath = "//div[contains(@id,'OpenLayers.Layer.Vector.RootContainer')]")
	public WebElement mpContainer;

	@FindBy(xpath = "//*[@id='new_profile']/table/tbody/tr[@class='spaceunder']")
	public WebElement mpTable;

	@FindBy(xpath = "//div/table/tbody/tr/td/div[contains(@class,'signup_form')]/h5[contains(text(),'Create your mapSYNQ account')]")
	public WebElement mpRegisterPage;

	@FindBy(xpath = "//select[@id='profile_country']")
	public WebElement mpSelectCountry;

	@FindBy(xpath = "//input[@id='profile_gender_M']")
	public WebElement mpRadioButtonMale;

	@FindBy(xpath = "//input[@id='profile_gender_F']")
	public WebElement mpRadioButtonFemale;

	@FindBy(xpath = "//input[@id='profile_dob']")
	public WebElement mpClickDateOfBirth;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[7]/a")
	public WebElement mpEnterDateOfBirth;
	
	@FindBy(xpath = "//input[@id='chk_agree']")
	public WebElement mpCheckBox;

	@FindBy(xpath = "//*[@id='new_profile']/table/tbody/tr/td/input[@name='commit']")
	public WebElement mpCreateProfileBtn;
	
	@FindBy(xpath = "//div[@class='error_signup']")
	public WebElement mpSignUp;
}