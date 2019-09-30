package com.os.qa.util;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	
	
	public void actionMouseHover(WebElement element) {		
		try {
			Actions builder=new Actions(driver);
			builder.moveToElement(element).build().perform();
			Thread.sleep(3000);
			log.info("Successfully hovred over the element"+element);
		} catch (InterruptedException e) {
			log.info("Exception occurred while trying to hover over the element "+element);
		}		
	}

	public void actionMouseHoverClick(WebElement element) {		
		try {
			Actions builder=new Actions(driver);
			builder.moveToElement(element).click().perform();
			Thread.sleep(3000);
			log.info("Successfully clicked over the element "+element);
		} catch (InterruptedException e) {
			log.info("Exception occurred while trying to click over the element "+element);
		}		
	}

	public void dropdownSelectByValue(WebElement element, String value) {
		try {
			new Select(element).selectByValue(value);
			log.info("The data "+value+" has been selected successfully from dropdown field");
		}
		catch(WebDriverException e) {
			log.info("The data "+value+" couldn't be found from the dropdown field");
		}
	}

	public void dropdownSelectByVisibleText(WebElement element, String text) {
		try {
			new Select(element).selectByVisibleText(text);
			log.info("The text "+text+" has been successfully selected from the dropdown field");
		}
		catch(WebDriverException e) {
			log.info("The text "+text+" couldn't be found from the dropdown list");
		}
	}

	public void dropdownSelectByIndex(WebElement element, int index) {
		try {
			Select sel=new Select(element);
			List<WebElement> allOptions=sel.getOptions();
			allOptions.get(index).click();			
			log.info("The value have has been selected from the dropdown with "
					+ "respect to the index value " +index);
		}
		catch(WebDriverException e) {
			log.info("Index number "+index+" couldn't found from the dropdown");
		}
	}

	public String getText(WebElement element) {
		String text="";
		try {
			text= element.getText();
			log.info("Text "+text+" has been extratced successfully from the WebElement "
					+element);
		}
		catch(WebDriverException e) {
			log.info("Couldn't extract the text "+text+" from the filed "+element);
		}
		return text;
	}

	public String getTitle() {
		String title="";
		try {
			title=driver.getTitle();
			log.info("Title of the page is "+title);
		}
		catch(WebDriverException e) {
			log.info("Couldn't extract the title of the page");
		}
		return title;
	}

	public String getAlertText() {
		String alertText="";
		Alert alert=driver.switchTo().alert();
		try {
			alert.getText();
			log.info("Text present in the alert was "+alertText);
		}
		catch(NoAlertPresentException e) {
			log.info("No alerts were present in the webpage to handle");
		}
		catch(WebDriverException e) {
			log.info("Exception occured while handling the alert and getting its text");
		}
		return alertText;
	}

	public void acceptAlert() {
		String alerText="";
		Alert alert=driver.switchTo().alert();
		try {
			alerText=alert.getText();
			alert.accept();
			log.info("Alert "+alerText+" has been successfully accepted");
		}
		catch(NoAlertPresentException e) {
			log.info("No alerts were present on the webpage to handle");
		}
		catch(WebDriverException e) {
			log.info("Exception occured while accepting the alert "+alerText);
		}
	}

	public void dismissAlert() {
		String alerText="";
		Alert alert=driver.switchTo().alert();
		try {
			alerText=alert.getText();
			alert.dismiss();
			log.info("Alert "+alerText+" has been successfully dismissed");
		}
		catch(NoAlertPresentException e) {
			log.info("No alerts were displayed in the page to handle");
		}
		catch(WebDriverException e) {
			log.info("Exception occured while dismissing the alert "+alerText);
		}
	}

	public String getAttribute(WebElement element, String value) {
		String attributeText=" ";
		try {
			attributeText=element.getAttribute(value);
			log.info("Value of the attribute element "+element+" is "+attributeText);
		}
		catch(WebDriverException e) {
			log.info("Could fetch the value for attribute element "+element);
		}		
		return attributeText;
	}

	public void verifyExactText(WebElement element, String expectedText) {
		String actualText=" ";
		try {
			actualText=element.getText();
			if(actualText.equals(expectedText)) {
				log.info("ActualText "+actualText+" matches exactly with the "
						+ "expected text "+expectedText);
			}
			else {
				log.info("ActualText "+actualText+" doesn't matches "
						+ "with the expected text "+expectedText);
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to fetch the text of the webelement"+element);
		}
	}

	public void verifyPartialText(WebElement element, String expectedText) {
		String actualText=" ";
		try {
			actualText=element.getText();
			if(actualText.equalsIgnoreCase(expectedText)||actualText.contains(expectedText)) {
				log.info("ActualText "+actualText+" matches with the "
						+ "expected text "+expectedText);
			}
			else {
				log.info("ActualText "+actualText+" doesn't match with "
						+ "the expected text "+expectedText);
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to fetch the text of the webelement "+element);
		}
	}

	public void verifyExactAttribute(WebElement element, String attributeName, String expectedText) {
		String actualAttribute=" ";
		try {
			actualAttribute=element.getAttribute(attributeName);
			if(actualAttribute.equals(expectedText)) {
				log.info("ActualAttribute "+actualAttribute+" macthes exactly with the expectedAttribute "
						+expectedText);
			}
			else {
				log.info("ActualAttribute "+actualAttribute+" doesn't macthes with the expected attribute "
						+expectedText);
			}
		}
		catch(WebDriverException e) {
			log.info("Expection occured while trying to fetch the value of the attribute "+attributeName);
		}
	}

	public void verifyPartialAttribute(WebElement element, String attributeName, String expectedText) {
		String actualAttribute=" ";
		try {
			actualAttribute=element.getAttribute(attributeName);
			if(actualAttribute.equalsIgnoreCase(expectedText)||actualAttribute.contains(expectedText)) {
				log.info("ActualAttribute "+actualAttribute+" matches with the expectedAttribute "
						+expectedText);
			}
			else {
				log.info("ActualAttribute "+actualAttribute+" doesn't matches with the expectedAttribute"
						+expectedText);
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to fetch the value of the attribute "
					+attributeName);
		}
	}

	public void verifyTitle(String expectedTitle) {
		String actualTitle=" ";
		try {
			actualTitle=driver.getTitle();
			if(actualTitle.equalsIgnoreCase(expectedTitle)||actualTitle.contains(expectedTitle)) {
				log.info("ActualTitle "+actualTitle+" matchex exactly with the expected title"
						+ expectedTitle);
			}
			else {
				log.info("ActaulTitle "+actualTitle+" doesn't matches with the expected title"
						+expectedTitle);
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to grt thr title of the WebPage");	
		}
	}

	public void verifyDisplayed(WebElement element) {
		String text="";
		try {
			if(element.isDisplayed()) {
				log.info("WebElement "+element+" is displayed on the webpage");
			}
			else {
				log.info("WebElement "+element+" is not present on the webpage");
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occured while verifying the element "+element+
					" is displayed on the webpage");
		}
	}

	public void verfiyEnabled(WebElement element) {
		String text="";
		try {
			if(element.isEnabled()) {
				log.info("WebElement "+element+" is enabled on the webpage");
			}
			else {
				log.info("WebElement "+element+" is not in enabled mode in the webpage");
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while verifying the element "+element+
					"is enabled");
		}
	}

	public void verifySelected(WebElement element) {
		String text="";
		try {
			if(element.isSelected()) {
				log.info("WebElement "+element+" is checked(selected) in the webpage");
			}
			else {
				log.info("WebElement "+element+" is not selected(checked) in the webpage");
			}
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to check "
					+ "	the webelement "+element+" is selected or not");
		}
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindows_list=driver.getWindowHandles();
			List<String> allWindows_array=new ArrayList<String>();
			allWindows_array.addAll(allWindows_list);
			driver.switchTo().window(allWindows_array.get(index));
			log.info("Control has been switched to window number "+index);
		}
		catch(NoSuchWindowException e) {
			log.info("Couldn't find the requested window number "+index);
		}
		catch(WebDriverException e) {
			log.info("Exception occurred while trying to switch to the window "+index);
		}
	}

	public void switchToFrameByIndex(int index) {
		try {
			driver.switchTo().frame(index);
			log.info("Control has been successfully switched to the frame number "+index);
		}
		catch(NoSuchFrameException e) {
			log.info("Couldn't find the rquested frame number "+index);
		}
		catch(WebDriverException e) {
			log.info("Exception occured while trying to switch to the frame "+index);
		}
	}

	public void switchToFrameByName(String Name) {
		try {
			driver.switchTo().frame(Name);
			log.info("Control has been successfully switched to the requested frame "+Name);
		}
		catch(NoSuchFrameException e) {
			log.info("Couldn't find the rquested frame name "+Name);
		}
		catch(WebDriverException e) {
			log.info("Exception occured while trying to switch to the frame "+Name);
		}
	}

	public void switchToFrameByWebElement(WebElement element){
		try {
			driver.switchTo().frame(element);
			log.info("Control has been successfully switched to the requested frame "+element);
		}
		catch(NoSuchFrameException e) {
			log.info("Couldn't find the rquested frame "+element);
		}
		catch(WebDriverException e) {
			log.info("Exception occured while trying to switch to the frame "+element);
		}
	}

	/*
	 * public long takeSnap() { number=(long) Math.floor(Math.random() * 900000000L)
	 * + 100000000L; try {
	 * FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new
	 * File("./report/images/" +number+ ".jpg")); }catch(FileNotFoundException e) {
	 * System.out.println("Couldn't locate the given file path"); }catch(IOException
	 * e) { System.out.println("The snapshot could not be taken");
	 * }catch(WebDriverException e) {
	 * System.out.println("The browser has been closed."); } return number; }
	 */

	public void logout(WebElement element) {
		element.click();
	}

	public void closeBrowser() {
		try {
			driver.close();
			log.info("Current browser tab has been successfully closed");
		}
		catch(Exception e) {
			log.info("Couldn't close current window tab");
		}
	}

	public void closeAllBrowser() {
		try {
			driver.quit();
			log.info("All the opened browsers are closed successfully");
		}
		catch(Exception e) {
			log.info("Couldn't close all the opened browsers");
		}
	}
	
	
	
	
	

}
