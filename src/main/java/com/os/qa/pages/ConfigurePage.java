package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;


public class ConfigurePage extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Monitor Groups')]")
	WebElement monitorGroupLink; 

	@FindBy(xpath="//a[@id='lnk1']")
	WebElement logoutLink; 

	@FindBy(xpath="//a[contains(text(),'Users')]")
	WebElement usersLink; 

	@FindBy(xpath="//a[contains(text(),'Roles')]")
	WebElement rolesLink; 

	@FindBy(linkText="Groups")
	WebElement groupsLink; 


	public ConfigurePage(){
		PageFactory.initElements(driver, this);
	}

	public MonitorGroupsPage clickMonitorGroupLink() {
		monitorGroupLink.click();		
		return new MonitorGroupsPage();
	}

	public UsersPage clickUsersLink() {
		usersLink.click();		
		return new UsersPage();
	}
	
	
	public RolesPage clickRolesLink() {
		rolesLink.click();		
		return new RolesPage();
	}

	
	public GroupsPage clickGroupsLink() {
		groupsLink.click();		
		return new GroupsPage();
	}

	public void clickLogoutLink() {
		driver.switchTo().defaultContent();
		logoutLink.click();		
	}



}
