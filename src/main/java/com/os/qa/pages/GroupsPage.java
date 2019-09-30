package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;

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
	
	
	@FindBy(xpath="//td[@id='treeTable_tcNode_1']")
	WebElement removeAutomationGroup1;

	@FindBy(xpath="//td[@id='treeTable_tcNode_2']")
	WebElement removeAutomationGroup2;


	@FindBy(xpath="//span[@id='delete']")
	WebElement removeGroup;


	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement removeGroupConfirmation;
	



	public GroupsPage(){
		PageFactory.initElements(driver, this);
	}


	public GroupsPage clickAddGroups() {

		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(addUserGroupsLink);
		driver.switchTo().defaultContent();
		return new GroupsPage();
	}


	public GroupsPage fillAddGroupsDetails(String groupname) {

		driver.switchTo().frame("DialogFrame_1");
		userGroupNameLabel.clear();
		userGroupNameLabel.sendKeys(groupname);
		Common.actionClick(userGroupOkButton);
		return new GroupsPage();
	}

	public ConfigurePage clickCloseGroups() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(userGroupCloseButton);
		return new ConfigurePage();
	}

	public GroupsPage clickRemoveGroups() {
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(removeAutomationGroup1);
		Common.actionClick(removeGroup);
		Common.actionClick(removeGroupConfirmation);
		return new GroupsPage();
	}




}
