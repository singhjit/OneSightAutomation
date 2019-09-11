package com.os.qa.runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/main/java/com/os/qa/features",
		glue= {"com/os/qa/stepDefinitions"},
		tags = {"@SmokeTest" , "~@RegressionTest", "~@End2EndTest"},		
		format = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
	    },plugin = "json:target/cucumber-reports/CucumberTestReport.json",
		monochrome = true,      //Display the console output in a proper readable format
		strict = true,          //Checks if any step is not defined in the step definition file
		dryRun = false          //Checks if mapping is proper between feature file and step definition file
		)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
