package com.raisin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.raisin.framework.ParentPage;

public class BanksPage extends ParentPage {

	public BanksPage(WebDriver driver) {
		super(driver);
	}

	// Variables section
	// Locator section
	By menuOptionsTab = By.xpath("//*[@id='all-tab']");
	By menuOptionProducts = By.xpath("//*[contains(@href,'Products')]");
	
	String buttonDetailsWithParametersOfBankName = "//div[contains(@class,'innerContainer')]/div/img[contains(@src,'%s')]/parent::*/parent::*/following-sibling::div";
	
	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void selectTheBackUsingTheParameters(String bankCodeName) {
		System.out.println("Starting to send some value of the username");
		clickJSx2(menuOptionProducts);		
		
		waitForAnExplicitElement(menuOptionsTab);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(menuOptionsTab);
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='offer-FIM003']/div[2]/div/div/button/span"))).click().build().perform();
		
	}
}
