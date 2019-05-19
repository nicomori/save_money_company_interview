package com.raisin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.raisin.framework.ParentPage;
import com.raisin.testdata.TestConstant;

public class LoginPage extends ParentPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Variables section
	// Locator section
	By editfieldUserName = By.xpath("//*[contains(@name,'username')]");
	By editfieldPassword = By.xpath("//*[contains(@name,'password')]");
	By buttonLogin = By.xpath("//input[contains(@type,'submit')]");
	By buttonMyAccount = By.xpath("//*[contains(@href,'/login/')]");

	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void sendValueUserName() {
		clickJSx2(buttonMyAccount);
		System.out.println("Starting to send some value of the username");
		waitForAnExplicitElement(editfieldUserName);
		sendStringToLocator(editfieldUserName, TestConstant.UserData.USERNAME);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void sendValuePassword() {
		System.out.println("Starting to send some value of the password");
		sendStringToLocator(editfieldPassword, TestConstant.UserData.PASSWORD);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInLogin() {
		System.out.println("starting to complete the login");
		clickJS(buttonLogin);
	}

}
