package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;

public class GroupsPage extends TestBase  {


	@FindBy(xpath="//span[@id='new' and @onclick ='javascript:add()']")
	WebElement addUserGroupsLink;

	@FindBy(xpath="//input[@name='userGroupObj.name']")
	WebElement userGroupNameLabel;

	@FindBy(xpath="//input[@name='userGroupObj.emailAddress']")
	WebElement userGroupEmailAddressLabel;

	@FindBy(xpath="//a[contains(text(),'OK')]")
	WebElement userGroupOkButton;

	@FindBy(xpath="//a[contains(text(),'Close')]")
	WebElement userGroupCloseButton;



	public GroupsPage(){
		PageFactory.initElements(driver, this);
	}


	public GroupsPage clickAddGroups() {

		driver.switchTo().frame("DialogFrame_0");
		addUserGroupsLink.click();
		driver.switchTo().defaultContent();
		return new GroupsPage();
	}


	public GroupsPage fillAddGroupsDetails(String groupname) {

		driver.switchTo().frame("DialogFrame_1");

		userGroupNameLabel.clear();
		userGroupNameLabel.sendKeys(groupname);

		userGroupOkButton.click();
		return new GroupsPage();
	}

	public ConfigurePage clickCloseGroups() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		userGroupCloseButton.click();
		return new ConfigurePage();
	}






}