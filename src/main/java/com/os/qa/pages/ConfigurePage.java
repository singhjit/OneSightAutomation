package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;
import com.os.qa.util.Common;


public class ConfigurePage extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Monitor Groups')]")
	WebElement monitorGroupLink; 
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	WebElement monitorsLink; 

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
		Common.actionClick(monitorGroupLink);
		return new MonitorGroupsPage();
	}
	
	
	public MonitorPage clickMonitorsLink() {
		Common.actionClick(monitorsLink);
		return new MonitorPage();
	}
	
	

	public UsersPage clickUsersLink() {
		Common.actionClick(usersLink);
		return new UsersPage();
	}

	public RolesPage clickRolesLink() {
		Common.actionClick(rolesLink);
		return new RolesPage();
	}


	public GroupsPage clickGroupsLink() {
		Common.actionClick(groupsLink);
		return new GroupsPage();
	}

	public void clickLogoutLink() {
		driver.switchTo().defaultContent();
		Common.actionClick(logoutLink);
	}



}
