package com.os.qa.stepDefinitions;

import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.RolesPage;

import cucumber.api.java.en.Then;

public class RolesPageSteps {

	ConfigurePage configurepage = new ConfigurePage();
	RolesPage rolepage = new RolesPage();

	@Then("^user clicks on roles link$")
	public void user_clicks_on_roles_link() {
		rolepage = configurepage.clickRolesLink();
	}

	@Then("^user clicks on add role link to add a role$")
	public void user_clicks_on_add_role_link_to_add_a_role() {
		rolepage = rolepage.clickAddRoles();
	}

	@Then("^user enters add role details \"(.*)\"$")
	public void user_enters_add_role_details(String rolename) {
		rolepage = rolepage.fillAddRoleDetails(rolename);
	}

	@Then("^user closes add role window$")
	public void user_closes_add_role_window() {
		configurepage = rolepage.clickCloseRoles();
	}

}
