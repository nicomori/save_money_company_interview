package com.raisin;

import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * This is a demo of the interview of Nicolas Mori - nicolas.mori@gmail.com
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources/features", tags = "@wg_get_all", 
		glue = {"com.raisin.steps"})

public class AppTest extends AbstractTestNGCucumberTests {
	@Parameters({ "parallelStatus" })
	public AppTest(String parallelStatus) {
		System.out.println("Reading the parallel status");
		System.out.println(parallelStatus);
	}
}
