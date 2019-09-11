package com.os.qa.stepDefinitions;


import org.testng.Assert;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.GroupsPage;
import com.os.qa.pages.HomePage;
import com.os.qa.pages.LoginPage;
import com.os.qa.pages.MonitorGroupsPage;
import com.os.qa.pages.RolesPage;
import com.os.qa.pages.UsersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ConfigurePage configurepage;
	MonitorGroupsPage monitorgroupsgage;
	UsersPage userpage;
	GroupsPage grouppage;
	RolesPage rolepage;

	@Given("^user opens a browser$")
	public void user_opens_a_browser() {
		TestBase.initialization();
	}

	@Then("^user is on onesight login page$")
	public void user_is_on_onesight_login_page()   {
		loginpage = new LoginPage();
		String loginpageTitle = loginpage.validateLoginPageTitle();
		log.info("login page title is  --->  " + loginpageTitle);
		Assert.assertEquals("OneSight Login", loginpageTitle);
	}

	@Then("^user enters username and password and logs into onesight$")
	public void user_enters_username_and_password_and_logs_into_onesight()    {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
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






	/*
	 * @Then("^homepage is displayed$") public void homepage_is_displayed() { String
	 * homepageTitle = homepage.verifyHomePageTitle(); Assert.
	 * assertEquals("Empirix OneSight Overview (admin[Default:Administrator])",
	 * homepageTitle);
	 * 
	 * boolean flag = homepage.verifyHomePageEventActivitySection();
	 * Assert.assertTrue(flag); }
	 */

	@Then("^user goes to configure page$")
	public void user_goess_to_configure_page()   {
		configurepage = homepage.clickConfigure();
	}



	@Then("^user clicks on monitor group link$")
	public void user_clicks_on_monitor_group_link() {
		monitorgroupsgage = configurepage.clickMonitorGroupLink();	 
	}


	@Then("^user clicks on add monitor group$")
	public void user_clicks_on_add_monitor_group()  {
		monitorgroupsgage = monitorgroupsgage.clickAddMoitorGroup();
	}


	@Then("^user closes monitor group window$")
	public void user_closes_monitor_group_window()  {
		configurepage = monitorgroupsgage.clickMonitorGroupClose();
	}


	@Then("^user clicks on users link$")
	public void user_clicks_on_users_link()   {
		userpage = configurepage.clickUsersLink();

	}

	@Then("^user clicks on add user link to add a user$")
	public void user_clicks_on_add_user_link_to_add_a_user()   {
		userpage = userpage.clickAddUsers();
	}


	@Then("^user enters add user details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_add_user_details_and_and_and(String username, String password, String confirmpassword )  {
		userpage = userpage.fillAddUserDetails(username, password, confirmpassword );
	}


	@Then("^user closes add user window$")
	public void user_closes_add_user_window()  {
		configurepage = userpage.clickCloseUser();
	}


	@Then("^user clicks on groups link$")
	public void user_clicks_on_groups_link() {
		grouppage = configurepage.clickGroupsLink();
	}

	@Then("^user clicks on add group link to add a group$")
	public void user_clicks_on_add_group_link_to_add_a_group() {
		grouppage = grouppage.clickAddGroups();
	}

	@Then("^user enters add group details \"(.*)\"$")
	public void user_enters_add_group_details(String groupname) {
		grouppage =  grouppage.fillAddGroupsDetails(groupname);
	}

	@Then("^user closes add group window$")
	public void user_closes_add_group_window() {
		configurepage = grouppage.clickCloseGroups();
	}

	@Then("^user clicks on roles link$")
	public void user_clicks_on_roles_link()   {
		rolepage = configurepage.clickRolesLink();
	}

	@Then("^user clicks on add role link to add a role$")
	public void user_clicks_on_add_role_link_to_add_a_role()  {
		rolepage = rolepage.clickAddRoles();
	}

	@Then("^user enters add role details \"(.*)\"$")
	public void user_enters_add_role_details(String rolename)   {
		rolepage = rolepage.fillAddRoleDetails(rolename);
	}

	@Then("^user closes add role window$")
	public void user_closes_add_role_window()  {
		configurepage = rolepage.clickCloseRoles();

	}






}
