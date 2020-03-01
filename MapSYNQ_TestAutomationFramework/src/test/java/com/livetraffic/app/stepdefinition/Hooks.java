package com.livetraffic.app.stepdefinition;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.livetraffic.app.lib.WebDriverActions;
import com.livetraffic.app.lib.helper.ScumberException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/** <!-- ========================================================================================================== -->
 * Hook class to ensure that we create a single browser per scenario and clean up the browser instance.
 *
 * After Hook also has case result collection for reporting purpose
 *
 * @lastrev fixXXXXX
 * *@author : Geethanjali
 * <!-- -------------------------------------------------------------------------------------------------------- --> */

public class Hooks
{
	private static final Logger	Log		= Logger.getLogger(Hooks.class.getName());

	private WebDriver itsDriver;
	int	caseId;

	public Hooks()
	{
		Log.info("Constructor: Hooks");
	}

	@Before
	public void before(final Scenario scenario)
		throws ScumberException, MalformedURLException
	{
		Log.info("TEST SCENARIO: Scenario Name is:  " + scenario.getName());
		itsDriver = WebDriverActions.openBrowser(scenario);
	}

	@After
	public void after(final Scenario scenario)
	{
		//itsDriver.close();
		
		try
		{
			
			if (scenario.isFailed()) {
				Log.info("TS: NAME" + scenario.getName());
				Log.info("TS: STATUS" + scenario.getStatus());
				
				Log.info("Called embedScreenShot Name: " + scenario.getName() + " ID: " + scenario.getId());

				try
				{
					scenario.write("Current Page URL is " + itsDriver.getCurrentUrl());

					final byte[] screenshot = ((TakesScreenshot) itsDriver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
				}
				catch (final WebDriverException somePlatformsDontSupportScreenshots)
				{
					Log.warning(somePlatformsDontSupportScreenshots.getMessage());
				}
			}
		} 
		catch (final Exception e)
		{
			e.printStackTrace();
		}
	}
}
