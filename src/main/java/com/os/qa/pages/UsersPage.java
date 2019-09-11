package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;

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

	public UsersPage(){
		PageFactory.initElements(driver, this);
	}


	public UsersPage clickAddUsers() {

		driver.switchTo().frame("DialogFrame_0");
		addUsersLink.click();
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

		addUserOkButton.click();
		return new UsersPage();
	}

	public ConfigurePage clickCloseUser() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		userCloseButton.click();
		return new ConfigurePage();
	}



}
