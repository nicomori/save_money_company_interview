package com.raisin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.raisin.framework.ParentPage;

public class HomePage extends ParentPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Variables section
	// Locator section
	By popupOpenOptionList = By.xpath("//*[@name='country_choice']");
	By popupButtonOk = By.xpath("//div[@class='modal-body']/div/form/button");
	By menuOptionOurOffers = By.xpath("//ul[@class='main-nav']//*[contains(@href,'our-offers')]");

	String popupMenuOptionWithParameter = "//*[@name='country_choice']/*[contains(text(),'%s')]";

	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickToOpenTheListOfCountries() {
		System.out.println("Starting to make click in the button login 22222");
		waitForAnExplicitElement(popupOpenOptionList);

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(popupOpenOptionList);
		action.moveToElement(we).moveToElement(driver.findElement(popupOpenOptionList)).click().build().perform();
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void selectPopupOptionMenuWithParameter(String menuOptionText) {
		System.out.println("Starting to select the option of the menu with the text: " + menuOptionText);
		selectOptionByString(popupOpenOptionList,menuOptionText);
		clickJS(popupButtonOk);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void selectOptionMenuOurOffers() {
		System.out.println("Starting to make click in the button login");
		clickJS(menuOptionOurOffers);
	}
}
