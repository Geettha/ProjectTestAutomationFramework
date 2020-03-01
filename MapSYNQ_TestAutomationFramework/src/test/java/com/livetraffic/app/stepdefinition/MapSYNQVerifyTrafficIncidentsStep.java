package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficIncidentsPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyTrafficIncidentsStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficIncidentsStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficIncidentsPageObject mapSYNQVerifyTrafficIncidentsPageObject;

    public MapSYNQVerifyTrafficIncidentsStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficIncidentsStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficIncidentsPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficIncidentsPageObject.class);
    }
   

    @When("^I click on \"([^\"]*)\" item on Info Panel$")
    public void i_click_on_item_on_Info_Panel(String field) throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.clickInfoPanel(field);
    }

    @Then("^I verify Content Pop up should be displayed on Map$")
    public void i_verify_Content_Pop_up_should_be_displayed_on_Map() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyContentPouUpMapDisplay();
    }

    @Then("^I verify contents in Info Panel and Content Pop up matches$")
    public void i_verify_contents_in_Info_Panel_and_Content_Pop_up_matches() throws Throwable {

    }

    @Then("^I click on \"([^\"]*)\" icon image on Map app$")
    public void i_click_on_icon_image_on_Map_app(String field) throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.clickInfoPanel(field);
    }

    @Then("^I verify Incident details Pop up should be displayed$")
    public void i_verify_Incident_details_Pop_up_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyIncidentDetailsPopUpShown();
    }

    @When("^I click on \"([^\"]*)\" link on Incident details Pop up$")
    public void i_click_on_link_on_Incident_details_Pop_up(String field) throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.clickInfoPanel(field);
    }

    @Then("^I verify Incident details Content Pop up should be displayed$")
    public void i_verify_Incident_details_Content_Pop_up_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyContentPouUpMapDisplay();
    	itsDriver.navigate().refresh();
    }

    @Then("^I verify map should be zoomed with Incident Details Content up$")
    public void i_verify_map_should_be_zoomed_with_Incident_Details_Content_up() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyIncidentDetailsPopUpShown();
    }

    @Then("^I verify News Menu Panel should be displayed$")
    public void i_verify_News_Menu_Panel_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyNewsPanelDisplay();
    }

    @Then("^I verify contents in Info Panel and Content Pop up for \"([^\"]*)\" matches$")
    public void i_verify_contents_in_Info_Panel_and_Content_Pop_up_for_matches(String text) throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyContentPopUpMatches(text);
    }

    @When("^I enter \"([^\"]*)\" in Search text box$")
    public void i_enter_in_Search_text_box(String text) throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.searchIncidentItemInTextBox(text);
    }

    @Then("^I verify searched items displayed on News Info Panel$")
    public void i_verify_searched_items_displayed_on_News_Info_Panel() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.verifyItemsShownInNewsInfoSearch();
    }

    @Then("^I verify map should be zoomed with Incident Details Content Pop up$")
    public void i_verify_map_should_be_zoomed_with_Incident_Details_Content_Pop_up() throws Throwable {
    	mapSYNQVerifyTrafficIncidentsPageObject.zoomContentImageShown();
    }


}
