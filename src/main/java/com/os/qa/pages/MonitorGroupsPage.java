package com.os.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;



public class MonitorGroupsPage extends TestBase {


	@FindBy(xpath="//span[@id='newMonitorGroup']")
	WebElement addMonitorGroupLink;


	@FindBy(xpath="//input[@name='monitorGroupObj.name']")
	WebElement monitorGroupNameLabel;

	@FindBy(xpath="//a[contains(text(),'OK')]")
	WebElement monitorGroupOkButton;

	@FindBy(xpath="//a[contains(text(),'Close')]")
	WebElement monitorGroupCloseButton;
	
	
	@FindBy(xpath="//td[contains(text(),'automationgroup1')]")
	WebElement removeAutomationMonitorGroup1;

	@FindBy(xpath="//td[contains(text(),'automationgroup2')]")
	WebElement removeAutomationMonitorGroup2;


	@FindBy(xpath="//span[@id='deleteMonitorGroup']")
	WebElement removeMonitorGroup;


	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement removeMonitorGroupConfirmation;

	public MonitorGroupsPage(){
		PageFactory.initElements(driver, this);
	}



	public MonitorGroupsPage clickAddMoitorGroup() {

		driver.switchTo().frame("DialogFrame_0");
		addMonitorGroupLink.click();
		driver.switchTo().defaultContent();
		return new MonitorGroupsPage();
	}


	public MonitorGroupsPage fillAddMonitorGroupDetails(String monitorgroupname  ) {
		driver.switchTo().frame("DialogFrame_1");
		monitorGroupNameLabel.clear();
		monitorGroupNameLabel.sendKeys(monitorgroupname);
		Common.actionClick(monitorGroupOkButton);
		return new MonitorGroupsPage();
	}


	public ConfigurePage clickMonitorGroupClose() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		monitorGroupCloseButton.click();
		return new ConfigurePage();
	}
	
	public MonitorGroupsPage clickRemoveMonitorGroup() {
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(removeAutomationMonitorGroup1);
		Common.actionClick(removeMonitorGroup);
		Common.actionClick(removeMonitorGroupConfirmation);
		return new MonitorGroupsPage();
	}




}
