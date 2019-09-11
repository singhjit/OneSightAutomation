package com.os.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.os.qa.base.TestBase;

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
	WebElement roleConfirmationButton;

	public RolesPage() {
		PageFactory.initElements(driver, this);
	}

	public RolesPage clickAddRoles() {

		driver.switchTo().frame("DialogFrame_0");
		addRolesLink.click();
		driver.switchTo().defaultContent();
		return new RolesPage();
	}

	public RolesPage fillAddRoleDetails(String rolename) {

		driver.switchTo().frame("DialogFrame_1");

		roleNameLabel.clear();
		roleNameLabel.sendKeys(rolename);
		addRoleOkButton.click();

		/*
		 * if (isAlertPresent()) { Alert alert = driver.switchTo().alert();
		 * log.info("Alert detected: " + alert.getText()); alert.accept();
		 * driver.switchTo().defaultContent(); }
		 */
		roleConfirmationButton.click();
		return new RolesPage();
	}

	public ConfigurePage clickCloseRoles() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("DialogFrame_0");
		roleCloseButton.click();
		return new ConfigurePage();
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