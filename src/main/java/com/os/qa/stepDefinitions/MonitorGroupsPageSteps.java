package com.os.qa.stepDefinitions;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.MonitorGroupsPage;

import cucumber.api.java.en.Then;

public class MonitorGroupsPageSteps extends TestBase {
	MonitorGroupsPage monitorgroupspage = new MonitorGroupsPage();
	ConfigurePage configurepage = new ConfigurePage();




	@Then("^user clicks on monitor group link$")
	public void user_clicks_on_monitor_group_link() {

		monitorgroupspage = configurepage.clickMonitorGroupLink();
	}

	@Then("^user clicks on add monitor group$")
	public void user_clicks_on_add_monitor_group() {
		monitorgroupspage = monitorgroupspage.clickAddMoitorGroup();
		
	}

	@Then("^user closes monitor group window$")
	public void user_closes_monitor_group_window() {
		configurepage = monitorgroupspage.clickMonitorGroupClose();
	}

	@Then("^user enters add monitor group details \"(.*)\"$")
	public void user_enters_add_monitor_group_details(String monitorgroupname) {
		monitorgroupspage = monitorgroupspage.fillAddMonitorGroupDetails(monitorgroupname);

	}


	@Then("^user goes to monitor group page to delete the group$")
	public void user_goes_to_monitor_group_page_to_delete_the_group() {
		monitorgroupspage = configurepage.clickMonitorGroupLink();
	}



	@Then("^user selects the monitor group and remove the monitor group$")
	public void user_selects_the_monitor_group_and_remove_the_monitor_group() {
		monitorgroupspage = monitorgroupspage.clickRemoveMonitorGroup();

	}




}
