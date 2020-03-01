package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficSpeedPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyTrafficSpeedStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficSpeedStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficSpeedPageObject mapSYNQVerifyTrafficSpeedPageObject;

    public MapSYNQVerifyTrafficSpeedStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficSpeedStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficSpeedPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficSpeedPageObject.class);
    }
    
    @Then("^I click on \"([^\"]*)\" icon button on Map app$")
    public void i_click_on_icon_button_on_Map_app(String field) throws Throwable {
    	
    	mapSYNQVerifyTrafficSpeedPageObject.clickIconsButtons(field);
    }

    @Then("^I verify Info Panel should be displayed$")
    public void i_verify_Info_Panel_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyInfoPanelDisplay();
    }

    @Then("^I verify \"([^\"]*)\" button icon on Map$")
    public void i_verify_button_icon_on_Map(String arg1) throws Throwable {
   	
    }

    @Then("^I verify Live Traffic Panel should be displayed$")
    public void i_verify_Live_Traffic_Panel_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyLiveTrafficDisplay();
    }

    @When("^I right click on Map to select \"([^\"]*)\" from context Menu$")
    public void i_right_click_on_Map_to_select_from_context_Menu(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.performRightClickSetCurrentLoc();
    }

    @Then("^I verify Icon for current location should be displayed$")
    public void i_verify_Icon_for_current_location_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyCurrentLocationIconDisplay();
    }

    @Then("^I verify Current Location details Pop up should be displayed$")
    public void i_verify_Current_Location_details_Pop_up_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyCurrentLocationDetailsPopUpDisplay();
    }

    @When("^I click on \"([^\"]*)\" link on Current Location details Pop up$")
    public void i_click_on_link_on_Current_Location_details_Pop_up(String field) throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.clickIconsButtons(field);
    }

    @Then("^I verify Current Location field on Directions Input screen populated$")
    public void i_verify_Current_Location_field_on_Directions_Input_screen_populated() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyFromLocationFieldInfoPanelPopulated();
    }

    @Then("^I verify To Location field on Directions Input screen populated$")
    public void i_verify_To_Location_field_on_Directions_Input_screen_populated() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyToLocationFieldInfoPanelPopulated();
    }

    @Then("^I verify Street View should be displayed$")
    public void i_verify_Street_View_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyStreetViewDisplay();
    }

    @Then("^I verify Pop up should be displayed on Directions Input screen$")
    public void i_verify_Pop_up_should_be_displayed_on_Directions_Input_screen() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyPopUpInfoPanelDisplay();
    }
    
    @Then("^I verify Icon for current location should not be displayed$")
    public void i_verify_Icon_for_current_location_should_not_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyCurrentLocationIconNotDisplay();
    }
    
    @Then("^I verify Current Location details Pop up should not be displayed$")
    public void i_verify_Current_Location_details_Pop_up_should_not_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficSpeedPageObject.verifyCurrentLocationDetailsPopUpDisplay();
    }


}
