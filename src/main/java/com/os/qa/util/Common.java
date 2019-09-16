package com.os.qa.util;

import java.util.NoSuchElementException;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.os.qa.base.TestBase;


public class Common extends TestBase {
	
	
	public static void actionClick(WebElement element) {
		String text="";
		try {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			text=element.getText();
			element.click();
			log.info("WebElement "+text+" has been clicked successfully");
		}
		catch(InvalidElementStateException e) {
			log.info("WebElment "+text+" is not in clickable mode");
		}
		catch(WebDriverException e) {
			log.info("Exception occured while trying to click the Webelement: "+text);
		}
		catch(NoSuchElementException e) {
			log.info("Not able to locate the WebElement: "+text);
		}
	}
	
	
	
	public void actionInputData(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
			log.info("The data "+value+" has been entered successfully in the field" +element);
		}
		catch(InvalidElementStateException e) {
			log.info("The webelement "+element+" is not in the editable mode to enter the data " +value);
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to type the data "+value+ " in the field "+element);
		}
		catch(NoSuchElementException e) {
			log.info("Not able to locate the WebElement: "+value);
		}
	}
	
	
	
	

}
