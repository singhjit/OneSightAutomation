package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;

import cucumber.api.java.en.Then;

public class MonitorPage extends TestBase{
	
	
@FindBy(xpath="//span[@id='new']")
WebElement addMonitorsLink;


@FindBy(xpath="//td[@id='treeTable_tcNode_14']")
WebElement pingMonitorNameLabel;

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

public MonitorPage(){
	PageFactory.initElements(driver, this);
}



public MonitorPage clickAddMoitors() {

	driver.switchTo().frame("DialogFrame_0");
	addMonitorsLink.click();
	driver.switchTo().defaultContent();
	return new MonitorPage();
}


public MonitorPage clickSelectMoitors() {

	driver.switchTo().frame("DialogFrame_0");
	pingMonitorNameLabel.click();
	driver.switchTo().defaultContent();
	return new MonitorPage();
}



public ConfigurePage clickMonitorClose() {

	driver.switchTo().defaultContent();
	driver.switchTo().frame("DialogFrame_0");
	monitorGroupCloseButton.click();
	return new ConfigurePage();
}

public MonitorPage clickRemoveMonitorGroup() {
	driver.switchTo().frame("DialogFrame_0");
	Common.actionClick(removeAutomationMonitorGroup1);
	Common.actionClick(removeMonitorGroup);
	Common.actionClick(removeMonitorGroupConfirmation);
	return new MonitorPage();
}




}
