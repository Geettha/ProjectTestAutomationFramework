package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficCamerasPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyTrafficCamerasStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficCamerasStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficCamerasPageObject mapSYNQVerifyTrafficCamerasPageObject;

    public MapSYNQVerifyTrafficCamerasStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficCamerasStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficCamerasPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficCamerasPageObject.class);
    }
    
    @Then("^I verify camera icons should be loaded in map$")
    public void i_verify_camera_icons_should_be_loaded_in_map() throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.verifyCameraIconsDisplayedOnMap();
    }	

    @Then("^I verify Camera Pop up should be displayed on Map$")
    public void i_verify_Camera_Pop_up_should_be_displayed_on_Map() throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.verifyCameraPopShowOnMap();
    }

    @Then("^I verify contents in Camera Pop up$")
    public void i_verify_contents_in_Camera_Pop_up() throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.verifyCameraPopShowOnMap();
    }

    @When("^I click on \"([^\"]*)\" icon button on Info Panel$")
    public void i_click_on_icon_button_on_Info_Panel(String arg1) throws Throwable {

    }

    @Then("^I verify Singapore Live Traffic Cameras should be displayed$")
    public void i_verify_Singapore_Live_Traffic_Cameras_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.verifySingaporeLiveTrafficCamerasShown();
    }

    @Then("^I verify CameraLink should display by SearchText$")
    public void i_verify_CameraLink_should_display_by_SearchText() throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.verifyCameraInfoLinkShown();
    }
    
    @Then("^I click on the \"([^\"]*)\" icon image on Map app$")
    public void i_click_on_the_icon_image_on_Map_app(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.clickOnCameraIconImageOnMap();
    }
    
    @When("^I click on the \"([^\"]*)\" icon button on Info Panel$")
    public void i_click_on_the_icon_button_on_Info_Panel(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.clickCameraBtn();
    }
    
    @When("^I click \"([^\"]*)\" icon button on Map app$")
    public void i_click_icon_button_on_Map_application(String arg1) throws Throwable {
    		
    }

    @When("^I click on \"([^\"]*)\" link in Info Panel$")
    public void i_click_on_link_in_Info_Panel(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.clickOnCameraLinkInfo();
    }

    @When("^I enter \"([^\"]*)\" search textbox on Info Panel$")
    public void i_enter_search_textbox_on_Info_Panel(String text) throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.enterSearchTextInfoPanel(text);
    }


    @When("^I click the \"([^\"]*)\" icon button on Map app$")
    public void i_click_the_icon_button_on_Map_app(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficCamerasPageObject.clickOnCameraIconBtnOnMap();
    }


}
