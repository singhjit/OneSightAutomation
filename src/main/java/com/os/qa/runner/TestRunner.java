package com.os.qa.runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = {"classpath:com/os/qa/features/login.feature",
				"classpath:com/os/qa/features/monitorgroups.feature",
				"classpath:com/os/qa/features/groups.feature",
				"classpath:com/os/qa/features/roles.feature",
				"classpath:com/os/qa/features/users.feature",
		        "classpath:com/os/qa/features/monitor.feature"},

		//     {"classpath:com/os/qa/features/roles.feature"},
		//		{"classpath:com/os/qa/features"},

		glue= {"classpath:com/os/qa/stepDefinitions"},
		//	tags = {"@SmokeTest" , "@RegressionTest", "~@End2EndTest"},	
		tags = {"@SmokeTest"},	
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

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest





@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
