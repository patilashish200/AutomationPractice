package com.ext.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper {

	static WebDriver driver;
	
	public AlertHelper(WebDriver driver)
 	{
		this.driver = driver;
 	}
	
	public static Alert getAlert()
	{
		return driver.switchTo().alert();
	}
	
	
	public static void acceptAlert()
	{
		getAlert().accept();	
	}
	
	public static void dismiss()
	{
		getAlert().dismiss();
	}
	
	public static String getText()
	{
		String alertMessage = getAlert().getText();
		return alertMessage;
	}
	
	public static void entertTextIntoAlert(String sAlertText)
	{
		getAlert().sendKeys(sAlertText);
		getAlert().accept();
		
		
	}
	
	
}
