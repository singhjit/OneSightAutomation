package com.os.qa.stepDefinitions;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.UsersPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UsersPageSteps extends TestBase{


	ConfigurePage configurepage = new ConfigurePage();
	UsersPage userpage = new UsersPage();


	@And("^user clicks on users link$")
	public void user_clicks_on_users_link() {
		userpage = configurepage.clickUsersLink();

	}

	@Then("^user clicks on add user link to add a user$")
	public void user_clicks_on_add_user_link_to_add_a_user() {
		userpage = userpage.clickAddUsers();
	}

	@Then("^user enters add user details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_add_user_details_and_and_and(String username, String password, String confirmpassword) {
		userpage = userpage.fillAddUserDetails(username, password, confirmpassword);
	}

	@Then("^user closes add user window$")
	public void user_closes_add_user_window() {
		configurepage = userpage.clickCloseUser();
	}




	@Then("^user goes to user page to delete the user$")
	public void user_goes_to_user_page_to_delete_the_user() {

	//	driver.switchTo().defaultContent();
		userpage = configurepage.clickUsersLink();
	}

	@Then("^user selects the user and remove the user$")
	public void user_selects_the_user_and_remove_the_user() {
		userpage = userpage.clickRemoveUsers();
	}

}
