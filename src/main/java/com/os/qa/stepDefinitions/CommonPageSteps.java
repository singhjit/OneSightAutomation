package com.os.qa.stepDefinitions;


import org.testng.Assert;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.HomePage;
import com.os.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonPageSteps extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ConfigurePage configurepage;

/*
	@Before
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

	@After
	public void tearDown(){
		System.out.println("close the browser");
	}

*/

	@Given("^user opens a browser and launch the OneSight url$$")
	public void user_opens_a_browser_and_launch_the_OneSight_url()  {
		TestBase.initialization();
	}

	@When("^user is on onesight login page$")
	public void user_is_on_onesight_login_page()   {
		loginpage = new LoginPage();
		String loginpageTitle = loginpage.validateLoginPageTitle();
		log.info("login page title is  --->  " + loginpageTitle);
		Assert.assertEquals("OneSight Login", loginpageTitle);
	}

	@Then("^user enters username and password and logs into onesight$")
	public void user_enters_username_and_password_and_logs_into_onesight()    {
		homepage = loginpage.OneSightlogin(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^user logs out from onesight$")
	public void user_logs_out_from_onesight() {
		log.info("****************************** Logging out from OneSight ****************************************");
		configurepage.clickLogoutLink();
	}


	@Then("^user closes the browser$")
	public void user_closes_the_browser()  {
		log.info("****************************** Browser is closed *****************************************");
		driver.close();
	}

	@Then("^user goes to configure page$")
	public void user_goess_to_configure_page()   {
		configurepage = homepage.clickConfigure();
	}


}
