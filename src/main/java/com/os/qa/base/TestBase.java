package com.os.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.os.qa.util.TestUtil;
import com.os.qa.util.WebEventListener;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Logger log = Logger.getLogger(TestBase.class);

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/os"
					+ "/qa/config/config.properties");
			prop.load(fis);
			Reporter.log("LOG : INFO - Config File loaded", true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			Reporter.log("LOG : FAIL - Failed to load Config files", true);
		}
	}


	public static void initialization(){
		log.info("****************************** Starting test cases execution  *****************************************");
		String browserName = prop.getProperty("browserName");
		if(browserName.equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if(browserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		} 

		else if(browserName.equalsIgnoreCase("IE")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}	
		else 
		{
			System.out.println("We Support Chrome, Firefox and IE Browsers for testing");
		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		log.info("Entering application URL");
		driver.get(prop.getProperty("appURL"));
	}
}

