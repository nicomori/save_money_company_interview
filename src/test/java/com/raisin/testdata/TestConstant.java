package com.raisin.testdata;

import org.openqa.selenium.WebDriver;

import com.raisin.framework.ParentPage;

public class TestConstant extends ParentPage {

	public TestConstant(WebDriver driver) {
		super(driver);
	}

	/**
	 * Test Groups
	 */
	public static final class UserData {
		public static final String USERNAME = "nicolas.mori+8@gmail.com";
		public static final String PASSWORD = "A45224610b";
	}

}
