package com.os.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.os.qa.base.TestBase;



public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'Event Activity')]")
	WebElement homePageEventActivityLable;


	@FindBy(xpath = "//a[contains(text(),'Configure')]")
	WebElement configureLink;




	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}


	public boolean verifyHomePageEventActivitySection(){
		return homePageEventActivityLable.isDisplayed();
	}

	public ConfigurePage clickConfigure(){


		configureLink.click();		

		return new ConfigurePage();
	}


}
