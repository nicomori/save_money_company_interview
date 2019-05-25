package com.raisin.framework;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class is an abstract class, and created for make the interaction with
 * the class ParentPage.
 */
public abstract class DSL {

	public WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * this method make a mouse over from a web element to other locator, and make
	 * click in the second element.
	 *
	 * @param first web element locator
	 * @param second web element locator
	 */
	protected void mouseOverAndClick(By firstLocator, By secondLocator) {
		waitForAnExplicitElement(firstLocator);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(firstLocator);
		action.moveToElement(we).moveToElement(driver.findElement(secondLocator)).click().build().perform();
	}

	/**
	 * this method make a javascript click
	 *
	 * @param locator
	 */
	protected void clickJS(By locator) {
		System.out.println("Starting to make a javascript click");
		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method select options from a list.
	 * 
	 * @param locator, string to send
	 */
	protected void selectOptionByString(By locator, String identifier) {
		Select dropdown = new Select(driver.findElement(locator));
		dropdown.selectByVisibleText(identifier);
	}

	/**
	 * this method make a double javascript click
	 * 
	 * @param locator
	 */
	protected void clickJSx2(By locator) {
		System.out.println("Starting to make a javascript click X2");

		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		try {
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element);
		}
	}

	/**
	 * this method return the string valur from some locator
	 * 
	 * @param locator
	 * @return string with the gettext content
	 */
	protected String getTextByLocator(By locator) {
		System.out.println("Starting to get the element text inside of some locator.");
		return driver.findElement(locator).getText();
	}

	/**
	 * this method send string to a web element.
	 * 
	 * @param locator
	 * @param string  to send
	 */
	protected void sendStringToLocator(By locator, String stringToSend) {
		System.out.println("Starting to send this String " + stringToSend + " to a webelement");
		driver.findElement(locator).sendKeys(stringToSend);
	}

	/**
	 * this method wait for a exclusive elemente deployed
	 * 
	 * @param locator
	 */
	protected void waitForAnExplicitElement(By locator) {
		System.out.println("Starting to wait for a exclusive element");
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(locator));
		waitSleepingTheTread(200);
	}

	/**
	 * this method make a tread sleep
	 * 
	 * @param int with miliseconds to sleep.
	 */
	protected void waitSleepingTheTread(int milisecondsToSleep) {
		try {
			System.out.println("Starting to sleep the thread " + milisecondsToSleep);
			Thread.sleep(milisecondsToSleep);
		} catch (Exception e) {
			System.out.println("Appear a problem at the moment to wait we can see this error:");
			System.out.println(e);
		}
	}

	/**
	 * this method go to some url
	 * 
	 * @param url
	 */
	protected void accessToAURL(String url) {
		System.out.println("Starting to go to this url: " + url);
		driver.get(url);
	}

	/**
	 * this method wait for a exclusive elemente deployed
	 * 
	 * @param locator
	 */
	protected Map<String, String> integrate2ListInAHashMap(String keys, String values) {
		System.out.println("Starting to get all the elements of a list and return in a map");
		List<WebElement> listOfWebelementsKeys = driver.findElements(By.xpath(keys));
		List<WebElement> listOfWebelementsValues = driver.findElements(By.xpath(values));

		Map<String, String> map = new LinkedHashMap<String, String>();

		for (int i = 0; i < listOfWebelementsKeys.size(); i++) {
			map.put(listOfWebelementsKeys.get(i).getText(), listOfWebelementsValues.get(i).getText());
		}
		return map;
	}
}