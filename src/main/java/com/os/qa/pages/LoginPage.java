package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.os.qa.base.TestBase;
import com.os.qa.util.Common;



public class LoginPage extends TestBase{


	@FindBy(name="name")
	WebElement username;

	@FindBy(name="passwordHashOld")
	WebElement password;

	@FindBy(xpath="//a[contains(text(),'Log In')]")
	WebElement loginBtn;


	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public HomePage OneSightlogin(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		Common.actionClick(loginBtn);
		return new HomePage();
	}

}
