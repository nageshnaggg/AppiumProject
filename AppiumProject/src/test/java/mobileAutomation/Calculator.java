package mobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "Redmi Note 12 Pro 5G");
	    desiredCapabilities.setCapability("udid", "nngunzlnrosgsgmf");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "13");
	    desiredCapabilities.setCapability("autoGrantPermissions", "true");
	    desiredCapabilities.setCapability("appPackage", "com.android2.calculator3");
	    desiredCapabilities.setCapability("appActivity", "com.xlythe.calculator.material.CalculatorActivity");
	    desiredCapabilities.setCapability("noReset", "true");
	    desiredCapabilities.setCapability("fullReset", "false");
	    desiredCapabilities.setCapability("ignoreHiddenApiPolicyError", "true");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_7");
	    el1.click();
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android2.calculator3:id/digit_3");
	    el3.click();
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}


