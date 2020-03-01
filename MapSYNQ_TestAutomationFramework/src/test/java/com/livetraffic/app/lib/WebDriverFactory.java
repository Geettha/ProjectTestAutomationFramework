package com.livetraffic.app.lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.livetraffic.app.lib.helper.PropertiesLoader;
import com.livetraffic.app.lib.helper.ScumberException;

/** <!-- ========================================================================================================== -->
 * Factory to create the correct web driver instance based on the environment setup.
 *
 * @lastrev fixXXXXX - new class
 * <!-- -------------------------------------------------------------------------------------------------------- --> */

public final class WebDriverFactory
{
	private final static Logger Log = Logger.getLogger(WebDriverFactory.class.getName());

	private WebDriverFactory()
	{
		// Should not be invoked directly.
	}

	public static WebDriver createWebDriver()
		throws ScumberException, MalformedURLException
	{
		final Properties props = PropertiesLoader.getInstance().load("browser.properties");

		final String browser = System.getProperty("browser", props.getProperty("browser"));

		return createWebDriver(browser);
	}

	public static WebDriver createWebDriver(final String browser)
		throws ScumberException, MalformedURLException
	{
		Log.info("Creating browser instance: " + browser);

		switch (browser)
		{
			case "chrome":
				return createChromeWebDriver();

			case "firefox":
				return createFirefoxWebDriver();
				
			case "appium":
				return createAppiumDriver();
		}

		throw new ScumberException("Unknown browser type: " + browser);
	}

	private static WebDriver createChromeWebDriver()
	{
		final String nativeOS = System.getProperty("os.name").toLowerCase();
		if (nativeOS.indexOf("linux") >= 0)
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/chromedriver");
		}
		else if (nativeOS.indexOf("mac") >= 0)
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/osx/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/chromedriver.exe");
		}

		final ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		options.addArguments("--no-sandbox");
		options.addArguments("--start-maximized");
		// options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

		return new ChromeDriver(options);
	}
	
	private static WebDriver createFirefoxWebDriver()
	{
		final String nativeOS = System.getProperty("os.name").toLowerCase();
		if (nativeOS.indexOf("linux") >= 0)
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/geckodriver");
		}
		else if (nativeOS.indexOf("mac") >= 0)
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/osx/geckodriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "src/test/java/resource/geckodriver.exe");
		}

		final FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--test-type");
		options.addArguments("--no-sandbox");
		options.addArguments("--start-maximized");
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

		return new FirefoxDriver(options);
	}
	
	private static WebDriver createAppiumDriver() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Galaxy A10S");
		capabilities.setCapability("udid","R9BMB0196RJ");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.1.2");
		capabilities.setCapability("appPackage","com.google.android.apps.maps");
		capabilities.setCapability("appActivity","com.google.android.maps.MapsActivity");

		// URL url = new URL("http://127.0.0.1:4723/wd/hub");
		return new AppiumDriver<MobileElement>(capabilities);
	}

}
