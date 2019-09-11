package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;



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

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", loginBtn);
		 */

		return new HomePage();
	}

}
