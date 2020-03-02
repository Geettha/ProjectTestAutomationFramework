package com.livetraffic.app.stepdefinition;

import com.livetraffic.app.lib.helper.ScumberException;
import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.page.functions.MapSYNQVerifyTrafficTollsPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class MapSYNQVerifyTrafficTollsStep {
    private final static Logger Log = Logger.getLogger(MapSYNQVerifyTrafficTollsStep.class.getName());

    private WebDriver itsDriver;
    private MapSYNQVerifyTrafficTollsPageObject mapSYNQVerifyTrafficTollsPageObject;

    public MapSYNQVerifyTrafficTollsStep() {
        Log.info("Constructor: MapSYNQVerifyTrafficTollsStep");
    }

    @Before
    public void before(final Scenario scenario) throws ScumberException, MalformedURLException {
        itsDriver = WebDriverActions.openBrowser(scenario);
        mapSYNQVerifyTrafficTollsPageObject = PageFactory.initElements(itsDriver, MapSYNQVerifyTrafficTollsPageObject.class);
    }
    
    @Then("^I verify toll icons should be loaded in map$")
    public void i_verify_toll_icons_should_be_loaded_in_map() throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.verifyTollsIconsDisplayedOnMap();
    }

    @Then("^I click on the \"([^\"]*)\" icon image displayed on Map app$")
    public void i_click_on_the_icon_image_displayed_on_Map_app(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.clickOnTollsIconImageOnMap();
    }

    @Then("^I verify Tolls Pop up should be displayed on Map$")
    public void i_verify_Tolls_Pop_up_should_be_displayed_on_Map() throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.verifyTollsPopShowOnMap();;
    }

    @When("^I click on the \"([^\"]*)\" icon button displayed on Info Panel$")
    public void i_click_on_the_icon_button_displayed_on_Info_Panel(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.clickTollsBtnOnInfoPanel();
    }

    @Then("^I verify Singapore Tolls should be displayed$")
    public void i_verify_Singapore_Tolls_should_be_displayed() throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.verifySingaporeLiveTrafficTollsShown();
    }

    @When("^I click on \"([^\"]*)\" link displayed in Info Panel$")
    public void i_click_on_link_displayed_in_Info_Panel(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.clickOnTollsLinkInfo();
    }

    @When("^I enter \"([^\"]*)\" tolls search textbox on Info Panel$")
    public void i_enter_tolls_search_textbox_on_Info_Panel(String text) throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.enterSearchTextInfoPanel(text);
    }

    @Then("^I verify the TollLink should display by SearchText$")
    public void i_verify_the_TollLink_should_display_by_SearchText() throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.verifyTollsInfoLinkShown();
    }
    
    @When("^I click on the \"([^\"]*)\" icon button displayed on Map app$")
    public void i_click_on_the_icon_button_displayed_on_Map_app(String arg1) throws Throwable {
    	mapSYNQVerifyTrafficTollsPageObject.clickOnTollsIconBtnOnMap();
    }

}
