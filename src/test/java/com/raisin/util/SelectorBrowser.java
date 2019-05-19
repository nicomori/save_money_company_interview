package com.raisin.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectorBrowser {

	public static DesiredCapabilities capabilities;

	public static WebDriver createDriverWithoutCapabilities(boolean isMobileEmulator, WebDriver driver) {
		if (isMobileEmulator) {
			driver = OpenBrowserChrome.openBowserWithOutCapabilitiesForEmulateMobile(driver, true);
		} else {
			driver = OpenBrowserChrome.openBowserWithOutCapabilities(driver);
		}
		return driver;
	}
}
