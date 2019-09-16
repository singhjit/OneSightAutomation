package com.os.qa.stepDefinitions;

import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.MonitorGroupsPage;

import cucumber.api.java.en.Then;

public class MonitorGroupsPageSteps {
	MonitorGroupsPage monitorgroupsgage = new MonitorGroupsPage();
	ConfigurePage configurepage = new ConfigurePage();


	@Then("^user clicks on monitor group link$")
	public void user_clicks_on_monitor_group_link() {
		//	monitorgroupsgage = new MonitorGroupsPage();
		monitorgroupsgage = configurepage.clickMonitorGroupLink();
	}

	@Then("^user clicks on add monitor group$")
	public void user_clicks_on_add_monitor_group() {
		monitorgroupsgage = monitorgroupsgage.clickAddMoitorGroup();
	}

	@Then("^user closes monitor group window$")
	public void user_closes_monitor_group_window() {
		configurepage = monitorgroupsgage.clickMonitorGroupClose();
	}

}
