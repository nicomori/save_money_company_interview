package com.raisin.framework;

import org.openqa.selenium.WebDriver;

import com.raisin.pages.BanksPage;
import com.raisin.pages.HomePage;
import com.raisin.pages.LoginPage;
import com.raisin.pages.OurOffersPage;
import com.raisin.steps.StepsHelper;
import com.raisin.util.SelectorBrowser;

import cucumber.api.java.After;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario extends StepsHelper {

	protected static WebDriver driver;

	protected static HomePage homePage;
	protected static BanksPage banksPage;
	protected static LoginPage loginPage;
	protected static OurOffersPage ourOffersPage;

	public void startBrowser(boolean isMobileEmulator) {
		System.out.println("Starting driver for Browser Chrome");
		driver = SelectorBrowser.createDriverWithoutCapabilities(isMobileEmulator, driver);

		homePage = new HomePage(driver);
		banksPage = new BanksPage(driver);
		loginPage = new LoginPage(driver);
		ourOffersPage = new OurOffersPage(driver);

	}

	protected void navigateTo(String url) {
		System.out.println("Starting to go to the url: " + url);
		driver.navigate().to(url);
	}

	public void closeDriver() {
		driver.quit();
	}
	
	
	
}
