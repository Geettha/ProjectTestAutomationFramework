package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficParkingPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyTrafficParkingStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficParkingStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficParkingPageObject mapSYNQVerifyTrafficParkingPageObject;

    public MapSYNQVerifyTrafficParkingStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficParkingStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficParkingPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficParkingPageObject.class);
    }
   

    @Then("^I verify Parking Slots icon should be displayed$")
    public void i_verify_Parking_Slots_icon_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.verifyParkingSlotsIconDisplayed();
    }

    @Then("^I verify content info pop up should be displayed$")
    public void i_verify_content_info_pop_up_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.verifyContentPopDisplayedOnMap();
    }

    @When("^I click on \"([^\"]*)\" link on Content Pop up$")
    public void i_click_on_link_on_Content_Pop_up(String field) throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.clickIconsParking(field);
    }

    @Then("^I verify Map should be zoomed and show Parking Icons available$")
    public void i_verify_Map_should_be_zoomed_and_show_Parking_Icons_available() throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.verifyParkingSlotsIconDisplayed();
    }
    
    @Then("^I click on the \"([^\"]*)\" icon button on Map app$")
    public void i_click_on_the_icon_button_on_Map_app(String field) throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.clickIconsParking(field);
    }


    @Then("^I verify Map should be zoomed and show Parking Slots Icons displayed$")
    public void i_verify_Map_should_be_zoomed_and_show_Parking_Slots_Icons_displayed() throws Throwable {
    	mapSYNQVerifyTrafficParkingPageObject.verifyParkingSlotsIconDisplayed();
    }

}
