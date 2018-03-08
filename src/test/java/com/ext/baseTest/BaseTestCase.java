package com.ext.baseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ext.config.Config;

public class BaseTestCase {

static WebDriver driver;
public static void openBrowser(String sBrowserName)
{
	System.out.println(System.getProperty("os.name"));
	
	
	if (System.getProperty("os.name").contains("Window"))
	{
		if (sBrowserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		
			driver = new FirefoxDriver();	
		}
		
		else if (sBrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			
			driver = new ChromeDriver();	
		}
		
		else if (sBrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe");
			
			driver = new ChromeDriver();	
		}
		
		driver.manage().window().maximize();
		
	}
	
	
	else  if (System.getProperty("user.os").contains("Mac"))
	{
		if (sBrowserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+"/Drivers/geckodriver");
		
			driver = new FirefoxDriver();	
		}
		
		else if (sBrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
			
			driver = new ChromeDriver();	
		}
		
		else if (sBrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Drivers/IEDriverServer");
			
			driver = new ChromeDriver();	
		}
		
		driver.get(Config.APPURL);
		driver.manage().window().maximize();
		
		
	}
	
}

/*public static Properties loadPropertyFile() throws IOException
{
	Properties pro = new Properties();
	
	FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
	pro.load(fis1);
    return pro;	
}*/


public static void main (String args[]) throws IOException
 {
BaseTestCase.openBrowser("chrome");
	 
//String value =BaseTestCase.loadPropertyFile().getProperty("Col_testCase");

//System.out.println(value);


	  
	 
	 

	
 }

}
