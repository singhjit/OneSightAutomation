package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;

public class UsersPage extends TestBase {

	@FindBy(xpath="//span[@id='new' and @onclick ='javascript:add()']")
	WebElement addUsersLink;

	@FindBy(xpath="//input[@name='userObj.name']")
	WebElement userNameLabel;

	@FindBy(xpath="//input[@name='userObj.password']")
	WebElement passwordLabel;

	@FindBy(xpath="//input[@name='passwordConfirm']")
	WebElement confirmPasswordLabel;

	@FindBy(xpath="//input[@name='userObj.emailAddress']")
	WebElement emailAddressLabel;


	@FindBy(xpath="//a[contains(text(),'OK')]")
	WebElement addUserOkButton;

	@FindBy(xpath="//a[contains(text(),'Close')]")
	WebElement userCloseButton;

	@FindBy(xpath="//td[contains(text(),'automationuser1')]")
	WebElement removeAutomationUser1;

	@FindBy(xpath="//td[contains(text(),'automationuser2')]")
	WebElement removeAutomationUser2;


	@FindBy(xpath="//span[@id='delete']")
	WebElement removeUser;


	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement removeUserConfirmation;

	public UsersPage(){
		PageFactory.initElements(driver, this);
	}


	public UsersPage clickAddUsers() {

		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(addUsersLink);
		driver.switchTo().defaultContent();
		return new UsersPage();
	}


	public UsersPage fillAddUserDetails(String username, String password, String confirmpassword ) {
		driver.switchTo().frame("DialogFrame_1");
		userNameLabel.clear();
		userNameLabel.sendKeys(username);
		passwordLabel.clear();
		passwordLabel.sendKeys(password);
		confirmPasswordLabel.clear();
		confirmPasswordLabel.sendKeys(confirmpassword);
		Common.actionClick(addUserOkButton);
		return new UsersPage();
	}

	public ConfigurePage clickCloseUser() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(userCloseButton);
		return new ConfigurePage();
	}

	public UsersPage clickRemoveUsers() {
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(removeAutomationUser1);
		Common.actionClick(removeUser);
		Common.actionClick(removeUserConfirmation);
		return new UsersPage();
	}

}
