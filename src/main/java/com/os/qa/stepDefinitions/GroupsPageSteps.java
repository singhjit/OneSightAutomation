package com.os.qa.stepDefinitions;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.GroupsPage;

import cucumber.api.java.en.Then;

public class GroupsPageSteps extends TestBase {
	
	ConfigurePage configurepage = new ConfigurePage();
	GroupsPage grouppage = new GroupsPage();
	
	
	
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
		grouppage = grouppage.fillAddGroupsDetails(groupname);
	}

	@Then("^user closes add group window$")
	public void user_closes_add_group_window() {
		configurepage = grouppage.clickCloseGroups();
	}
	
	@Then("^user goes to groups page to delete the user group$")
	public void user_goes_to_groups_page_to_delete_the_user_group() {
		grouppage = configurepage.clickGroupsLink();
		
	}

	@Then("^user selects the user group and remove the user group$")
	public void user_selects_the_user_group_and_remove_the_user_group() {
		grouppage = grouppage.clickRemoveGroups();
		
	}
	
	

}
