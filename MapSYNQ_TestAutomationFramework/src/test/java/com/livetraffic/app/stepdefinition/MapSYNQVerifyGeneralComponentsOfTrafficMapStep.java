package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyGeneralComponentsOfTrafficMapStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyGeneralComponentsOfTrafficMapStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject mapSYNQTrafficMapFeaturePageObject;

    public MapSYNQVerifyGeneralComponentsOfTrafficMapStep() {
        Log.info("Constructor: MapSYNQTrafficMadFeatureStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQTrafficMapFeaturePageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyGeneralComponentsOfTrafficMapPageObject.class);
    }


    @Then("^I verify Map should be loaded on page with Incidents selected Default$")
    public void i_verify_Map_should_be_loaded_on_page_with_Incidents_selected_Default() throws Throwable {
		itsDriver.navigate().refresh();
    	mapSYNQTrafficMapFeaturePageObject.verifyMapDisplayedWithIncidentsSelected();
    }

    @Then("^I verify Direction icon on Map$")
    public void i_verify_Direction_icon_on_Map() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyDirectionIconVisibility();
    	
    }

    @When("^I click on Ad Toggle icon$")
    public void i_click_on_Ad_Toggle_icon() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.clickOnAdToggleButton();
    }

    @Then("^I verify Galactio Ad info should not be displayed$")
    public void i_verify_Galactio_Ad_info_should_not_be_displayed() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyGTogglePage();
    }

    @Then("^I click on \"([^\"]*)\" pointing icon on Direction icon on Map$")
    public void i_click_on_pointing_icon_on_Direction_icon_on_Map(String direction) throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.clickIcons(direction);
    }

    @Then("^I verify Zoom Bar icon on Map$")
    public void i_verify_Zoom_Bar_icon_on_Map() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyZoomIconBar();
    }

    @Then("^I verify Zoom Icon should work as expected$")
    public void i_verify_Zoom_Icon_should_work_as_expected() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyMappMoved();
    }

    @Then("^I verify Drag icon on Zoom Bar$")
    public void i_verify_Drag_icon_on_Zoom_Bar() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyZoomDragIcon();
    }

    @Then("^I verify Legend Poup up should be displayed$")
    public void i_verify_Legend_Poup_up_should_be_displayed() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyLegendPopup();
    }


    @Then("^I verify Calendar Poup up should be displayed$")
    public void i_verify_Calendar_Poup_up_should_be_displayed() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyCalendarPopup();
    }

    @When("^I click on SP Toggle icon$")
    public void i_click_on_SP_Toggle_icon() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifySToggleButtonClick();
    }

    @Then("^I verify Left Navigation Panel should not be displayed$")
    public void i_verify_Left_Navigation_Panel_should_not_be_displayed() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyInfoPanelDisplay();
    }
    
    @When("^I click on \"([^\"]*)\" sign on Zoom Bar Icon$")
    public void i_click_on_sign_on_Zoom_Bar_Icon(String arg1) throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyZoomFunctionalityForMinus();
    }

    @When("^I click on \"([^\"]*)\" Icon$")
    public void i_click_on_Icon(String text) throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.clickIcons(text);
    }
    
    @Then("^I verify maps should move according to direction$")
    public void i_verify_maps_should_move_according_to_direction() throws Throwable {
    	mapSYNQTrafficMapFeaturePageObject.verifyMappMoved();
    }

    @Then("^I close browser$")
    public void i_close_browser() throws Throwable {
    	itsDriver.close();
    }
}
