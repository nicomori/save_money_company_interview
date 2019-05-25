package com.raisin.steps;

import com.raisin.framework.ParentScenario;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends ParentScenario {

	@Given("I start the chrome using mobile emulator in \"(.*)?\"")
	public void createTheBrowser(boolean isMobileEmulator) {
		startBrowser(isMobileEmulator);
	}

	@And("navigate to this \"(.*)?\"")
	public void navigateToSomeUrlInTheMobileWeb(String url) {
		System.out.println("Navigate to the url: " + url);
		navigateTo(url);
	}

	@After
	public void afterTestClass() {
		System.out.println("closing the driver");
		driver.close();
	}
}