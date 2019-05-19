package com.raisin.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.raisin.framework.ParentPage;

public class OurOffersPage extends ParentPage {

	public OurOffersPage(WebDriver driver) {
		super(driver);
	}
	
	// Variables section
	// Locator section
	By checkboxEasyAccess = By.xpath("//input[@id='early_termination_cb']");
	By textCounterOffers = By.xpath("//div[@class='prot-listing-count']/span/ng-pluralize");
	
	String listOfInteresRate = "//div[@class='prot-offer-header-interest-rate']/div[1]";
	String buttonRegisterWithParameter = "(//div[contains(@class,'prot-item-')]/div[contains(@id,'prot-item-')])[%s]//*[contains(@class,'product-cta ng-scope')]";

	// Method section

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public String makeclickInTheCheckBoxEasyAccessAndReturnTheMessageWithTheTotalOfOffers() {
		System.out.println("starting to complete the login");
		clickJS(checkboxEasyAccess);
		waitForAnExplicitElement(textCounterOffers);
		return getTextByLocator(textCounterOffers);
	}
	
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public int returnTheIndexOfTheBestInteresRate() {
		System.out.println("starting to complete the login");
		
		List<WebElement> listOfWebElements = new ArrayList<WebElement>();
		
		Double someValueTemp = 0.0;
		Double someValueFinal = 0.0;
		
		int indexWithTheInterestBigger = 0;
		
		listOfWebElements = driver.findElements(By.xpath(listOfInteresRate));
		
		for (int i = 1; i < listOfWebElements.size(); i++) {
			someValueTemp = Double.parseDouble(listOfWebElements.get(i).getText());
			
			if(someValueTemp > someValueFinal) {
				indexWithTheInterestBigger = i;
				someValueFinal = Double.parseDouble(listOfWebElements.get(i).getText());
			}
		}
		
		return indexWithTheInterestBigger;
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInTheRegisterButtonInTheClusterWithBiggerInterest() {
		int indexOfClusterWithHigerInterest = returnTheIndexOfTheBestInteresRate();
		
		System.out.println("starting to complete the login");
		clickJS(By.xpath(String.format(buttonRegisterWithParameter, indexOfClusterWithHigerInterest)));
	}
	
	
}
