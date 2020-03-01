package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQCreateNewAccountPageObject;
import com.livetraffic.app.page.functions.MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficSpeedPageObject;

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

public class MapSYNQVerifyTrafficCamerasStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficCamerasStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficSpeedPageObject mapSYNQVerifyTrafficSpeedPageObject;

    public MapSYNQVerifyTrafficCamerasStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficSpeedStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficSpeedPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficSpeedPageObject.class);
    }
    
    @Then("^I verify camera icons should be loaded in map$")
    public void i_verify_camera_icons_should_be_loaded_in_map() throws Throwable {

    }

    @When("^I click on \"([^\"]*)\" link on Camera details Pop up$")
    public void i_click_on_link_on_Camera_details_Pop_up(String arg1) throws Throwable {

    }

    @Then("^I verify Camera Pop up should be displayed on Map$")
    public void i_verify_Camera_Pop_up_should_be_displayed_on_Map() throws Throwable {
 
    }

    @Then("^I verify contents in Camera Pop up$")
    public void i_verify_contents_in_Camera_Pop_up() throws Throwable {

    }

    @When("^I click on \"([^\"]*)\" icon button on Info Panel$")
    public void i_click_on_icon_button_on_Info_Panel(String arg1) throws Throwable {

    }

    @Then("^I verify Singapore Live Traffic Cameras should be displayed$")
    public void i_verify_Singapore_Live_Traffic_Cameras_should_be_displayed() throws Throwable {

    }

    @When("^I click on \"([^\"]*)\" in Info Panel$")
    public void i_click_on_in_Info_Panel(String arg1) throws Throwable {

    }

    @When("^I click on \"([^\"]*)\" on Info Panel$")
    public void i_click_on_on_Info_Panel(String arg1) throws Throwable {

    }


}
