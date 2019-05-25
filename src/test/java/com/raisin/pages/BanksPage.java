package com.raisin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.raisin.framework.ParentPage;

public class BanksPage extends ParentPage {

	public BanksPage(WebDriver driver) {
		super(driver);
	}

	// Variables section
	// Locator section
	By menuOptionsTab = By.xpath("//*[@id='all-tab']");
	By menuOptionProducts = By.xpath("//*[contains(@href,'Products')]");
	By optionProduct = By.xpath("//*[@id='offer-FIM003']/div[2]/div/div/button/span");

	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void selectTheBackUsingTheParameters(String bankCodeName) {
		System.out.println("Starting to send some value of the username");
		driver.findElement(menuOptionProducts);
		clickJSx2(menuOptionProducts);
		mouseOverAndClick(menuOptionsTab, optionProduct);
	}
}
