package com.livetraffic.app.page.functions;

import java.util.Properties;

import com.livetraffic.app.lib.helper.PropertiesLoader;
import com.livetraffic.app.lib.utils.AbstractBasePage;
import com.livetraffic.app.lib.Constants;
import com.livetraffic.app.page.locators.MapSYNQCreateNewAccountLocators;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * ==========================================================================================================
This class contains mapSYNQ create new account page objects
*@author : Geethanjali
 *          --------------------------------------------------------------------------------------------------------
 *          -->
 */
public class MapSYNQCreateNewAccountPageObject extends AbstractBasePage {
	final MapSYNQCreateNewAccountLocators registerLoc;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	private static final String FIRST_NAME_FIELD = "profile[first_name]";
	private static final String LAST_NAME_FIELD = "profile[last_name]";
	private static final String ADDRESS_FIELD = "profile[address]";
	private static final String CONTACT_FIELD = "profile[contact_no]";
	private static final String EMAIL_FIELD = "profile[email]";
	private static final String PASSWORD_FIELD = "identity[password]";
	private static final String CONFIRM_PASSWORD_FIELD = "identity[password_confirmation]";
	private static final String DATE_OF_BIRTH = "profile[dob]";

	@Autowired
	public MapSYNQCreateNewAccountPageObject(final WebDriver driver) {
		super(driver);
		registerLoc = PageFactory.initElements(driver, MapSYNQCreateNewAccountLocators.class);
		wait = new WebDriverWait(itsDriver, Constants.pageObjectWaitInSecs);
		jsExecutor = (JavascriptExecutor) itsDriver;

	}

	public Properties testProps() {
		return PropertiesLoader.getInstance().load("userdetails.properties");
	}

	public void verifyMapSYNQPageDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(registerLoc.mpContainer));
		Assert.assertTrue(registerLoc.mpPageLogo.isDisplayed());
		Assert.assertTrue(registerLoc.mpRegisterLink.isDisplayed());
		Assert.assertTrue(registerLoc.mpContainer.isDisplayed());

	}

	public void clickOnRegisterLink() {
		wait.until(ExpectedConditions.visibilityOf(registerLoc.mpContainer));
		wait.until(ExpectedConditions.elementToBeClickable(registerLoc.mpRegisterLink));
		registerLoc.mpRegisterLink.click();
	}

	public void verifyMapSYNQUserProfileDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(registerLoc.mpTable));
		Assert.assertTrue(registerLoc.mpTable.isDisplayed());

	}


	public void selectCountryDetails(String country) {
		selectListByVisibleText(registerLoc.mpSelectCountry,country);
	}

	public void selectRadioButton() {
		String mpGender = testProps().getProperty("user.gender");
		if (mpGender.equalsIgnoreCase("F")) {
			registerLoc.mpRadioButtonFemale.click();
		} else {
			registerLoc.mpRadioButtonMale.click();
		}
	}

	public void clickAgreeTermsAndConditions() {
		registerLoc.mpCheckBox.click();
	}

	public void clickSubmitButton() {
		registerLoc.mpCreateProfileBtn.click();
	}


	public void selectDate() {
		registerLoc.mpClickDateOfBirth.click();
		registerLoc.mpEnterDateOfBirth.click();

	}
	
	public void inputFieldValue(String value, String fieldName) {
		switch (fieldName) {
		case FIRST_NAME_FIELD:
			getElementUsingInputName("profile[first_name]").sendKeys(value);
			break;
		case LAST_NAME_FIELD:
			getElementUsingInputName("profile[last_name]").sendKeys(value);
			break;
		case ADDRESS_FIELD:
			getElementUsingInputName("profile[address]").sendKeys(value);
			break;	
		case CONTACT_FIELD:
			getElementUsingInputName("profile[contact_no]").sendKeys(value);
			break;	
		case EMAIL_FIELD:
			getElementUsingInputName("profile[email]").sendKeys(value);
			break;
		case PASSWORD_FIELD:
			getElementUsingInputName("identity[password]").sendKeys(value);
			break;
		case CONFIRM_PASSWORD_FIELD:
			getElementUsingInputName("identity[password_confirmation]").sendKeys(value);
			break;
		case DATE_OF_BIRTH:
			getElementUsingInputName("profile[dob]").sendKeys(value);
			break;	
		default:
			Assert.fail("Given Field name is not available: " + fieldName);
			break;
		}
	}
	
	public void newUserCreation() {
		if (registerLoc.mpSignUp.isDisplayed()) {
			registerLoc.mpRegisterLink.click();
		} else {
					
				}
			}
				
		}



	

