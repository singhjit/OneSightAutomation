package com.os.qa.pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.os.qa.base.TestBase;




public class MonitorGroupsPage extends TestBase {


	@FindBy(xpath="//span[@id='newMonitorGroup']")
	WebElement addMonitorGroupLink;


	@FindBy(xpath="//input[@name='monitorGroupObj.name']")
	WebElement monitorGroupNameLabel;

	@FindBy(xpath="//a[contains(text(),'OK')]")
	WebElement monitorGroupOkButton;

	@FindBy(xpath="//a[contains(text(),'Close')]")
	WebElement monitorGroupCloseButton;






	public MonitorGroupsPage(){
		PageFactory.initElements(driver, this);
	}



	public MonitorGroupsPage clickAddMoitorGroup() {

		driver.switchTo().frame("DialogFrame_0");
		addMonitorGroupLink.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_1");
		monitorGroupOkButton.click();
		return new MonitorGroupsPage();
	}



	public ConfigurePage clickMonitorGroupClose() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		monitorGroupCloseButton.click();
		return new ConfigurePage();
	}




}
