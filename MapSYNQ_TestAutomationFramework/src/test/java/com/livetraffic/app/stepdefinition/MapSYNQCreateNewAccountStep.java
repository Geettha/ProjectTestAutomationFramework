package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQCreateNewAccountPageObject;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQCreateNewAccountStep {
    private final static Logger Log = Logger.getLogger(MapSYNQCreateNewAccountStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQCreateNewAccountPageObject MapSYNQCreateNewAccount;

    public MapSYNQCreateNewAccountStep() {
        Log.info("Constructor: MapSYNQCreateNewAccountStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        MapSYNQCreateNewAccount = PageFactory.initElements(itsDriver, MapSYNQCreateNewAccountPageObject.class);
    }
    
    @Given("^user navigates to application URL : \"([^\"]*)\" application$")
    public void user_navigates_to_application_URL_application(String trafficAppUrl) throws Throwable {
    	itsDriver.get(trafficAppUrl);
    }

    @Then("^I am on mapSYNQ Landing Page$")
    public void iAmOnMapSYNQLandingPage() {
        MapSYNQCreateNewAccount.verifyMapSYNQPageDisplayed();
    }

    @When("^I click on \"([^\"]*)\" link on Top Menu Bar$")
    public void iClickOnLinkOnTopMenuBar(String arg0) throws Throwable {
        MapSYNQCreateNewAccount.clickOnRegisterLink();
    }

    @Then("^I navigate to mapSYNQ User Profile page$")
    public void i_navigate_to_mapSYNQ_User_Profile_page() throws Throwable {
    	MapSYNQCreateNewAccount.verifyMapSYNQUserProfileDisplayed();
    }


    @Then("^I enter \"([^\"]*)\" in \"([^\"]*)\" Field textBox$")
    public void i_enter_in_Field_textBox(String value, String fieldName) throws Throwable {
    	MapSYNQCreateNewAccount.inputFieldValue(value, fieldName);
    }

    @Then("^I select \"([^\"]*)\" from Country Field dropdown$")
    public void i_select_from_Country_Field_dropdown(String country) throws Throwable {
    	MapSYNQCreateNewAccount.selectCountryDetails(country);
    }

    @Then("^I verify new mapSYNQ account successfully created$")
    public void iVerifyNewMapSYNQAccountSuccessfullyCreated() {
    	MapSYNQCreateNewAccount.newUserCreation();
    }

    @And("^I set value for Gender radiobutton$")
    public void iSetValueForGenderRadiobutton() {
        MapSYNQCreateNewAccount.selectRadioButton();
    }

    @And("^I click on Create button$")
    public void iClickOnCreateButton() {
        MapSYNQCreateNewAccount.clickSubmitButton();
    }

    @And("^I set check value for I agree to terms and conditions checkbox$")
    public void iSetCheckValueForIAgreeToTermsAndConditionsCheckbox() {
    	MapSYNQCreateNewAccount.clickAgreeTermsAndConditions();
    }
    
    @Then("^I set \"([^\"]*)\" in DateOfBirth Field textBox$")
    public void i_set_in_DateOfBirth_Field_textBox(String arg1) throws Throwable {
    	MapSYNQCreateNewAccount.selectDate();
    }
}
