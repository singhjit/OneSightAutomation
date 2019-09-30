package com.os.qa.stepDefinitions;

import com.os.qa.base.TestBase;
import com.os.qa.pages.ConfigurePage;
import com.os.qa.pages.MonitorPage;

import cucumber.api.java.en.Then;

public class MonitorPageSteps extends TestBase {

	MonitorPage monitorpage = new MonitorPage();
	ConfigurePage configurepage = new ConfigurePage();



	@Then("^user clicks on monitor link$")
	public void user_clicks_on_monitor_link() {
		monitorpage = configurepage.clickMonitorsLink();
	}

	@Then("^user clicks on add monitor$")
	public void user_clicks_on_add_monitor() {
		monitorpage = monitorpage.clickAddMoitors();
	}
	
	@Then("^user selects ping monitors$")
	public void user_selects_ping_monitors() {
		monitorpage = monitorpage.clickSelectMoitors();
				
	}

}
