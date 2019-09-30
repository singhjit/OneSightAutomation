package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;

public class RolesPage extends TestBase {

	@FindBy(xpath = "//span[@id='new' and @onclick ='javascript:add()']")
	WebElement addRolesLink;

	@FindBy(xpath = "//input[@id='name' and @name = 'roleObject.name']")
	WebElement roleNameLabel;

	@FindBy(xpath = "//a[@id='save']")
	WebElement addRoleOkButton;

	@FindBy(xpath = "//a[contains(text(),'Close')]")
	WebElement roleCloseButton;

	@FindBy(xpath = "//a[contains(text(),'Yes')]")
	WebElement roleAddWarningButton;


	@FindBy(xpath="//td[contains(text(),'automationrole1')]")
	WebElement removeAutomationRole1;

	@FindBy(xpath="//td[contains(text(),'automationrole2')]")
	WebElement removeAutomationRole2;


	@FindBy(xpath="//span[@id='delete']")
	WebElement removeRole;


	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement removeRoleConfirmation;


	public RolesPage() {
		PageFactory.initElements(driver, this);
	}

	public RolesPage clickAddRoles() {

		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(addRolesLink);
		driver.switchTo().defaultContent();
		return new RolesPage();
	}

	public RolesPage fillAddRoleDetails(String rolename) {

		driver.switchTo().frame("DialogFrame_1");

		roleNameLabel.clear();
		roleNameLabel.sendKeys(rolename);
		Common.actionClick(addRoleOkButton);

		/* if (isAlertPresent()) { Alert alert = driver.switchTo().alert();
		 * log.info("Alert detected: " + alert.getText()); alert.accept();
		 * driver.switchTo().defaultContent(); }
		 */

		Common.actionClick(roleAddWarningButton);
		return new RolesPage();
	}

	public ConfigurePage clickCloseRoles() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(roleCloseButton);
		return new ConfigurePage();
	}


	public RolesPage clickRemoveRoles() {
		driver.switchTo().frame("DialogFrame_0");
		Common.actionClick(removeAutomationRole1);
		Common.actionClick(removeRole);
		Common.actionClick(removeRoleConfirmation);
		return new RolesPage();
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}