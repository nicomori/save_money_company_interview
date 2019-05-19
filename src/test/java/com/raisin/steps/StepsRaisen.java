package com.raisin.steps;

import com.raisin.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepsRaisen extends ParentScenario {
	
	@Then("select this option \"(.*)?\" from the menu")
	public void selectOptionFromThePopupMenu(String someOptionMenu) {
		homePage.makeClickToOpenTheListOfCountries();
		homePage.selectPopupOptionMenuWithParameter(someOptionMenu);
	}

	@Then("in the option menu, select the option Our-Offers")
	public void selectOurOffersFromTheMenu() {
		homePage.selectOptionMenuOurOffers();
	}

	@Then("in make click in the checkbox Easy Access")
	public void activateCheckobEasyAccess() {
		System.out.println("Starting to make click in the checkbox easy access.");
		Assert.assertTrue(ourOffersPage.makeclickInTheCheckBoxEasyAccessAndReturnTheMessageWithTheTotalOfOffers().length() >= 0);
	}

	@Then("find the offer with the highest Interest rate in the list and click in register")
	public void findHigestInterestAndClickInRegister() {
		ourOffersPage.makeClickInTheRegisterButtonInTheClusterWithBiggerInterest();
	}

	@And("make the login")
	public void makeTheLogin() {
		loginPage.sendValueUserName();
		loginPage.sendValuePassword();
		loginPage.makeClickInLogin();
	}

	@Then("press the button details in the bank \"(.*)?\"")
	public void makeClickIntheButtonDetails(String bankCodeName) {
		banksPage.selectTheBackUsingTheParameters(bankCodeName);
	}

}