package com.ext.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptOperation {

	private static  WebDriver driver;
	
	public JavaScriptOperation(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public static void clickHiddenElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click();", element);
	
	}
	
	public static void selectDate( String script, WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(script, element);
	}
	
	
	public static void scrollWindowDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500);");
	}
	
	public static void scrollWindowUp()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, -500);");
	}
	
	public static void scrollIntoViewAndClick(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollIntoView(true);",element);
		
		element.click();
	}
	
	
	
	
	
	
	
	
}
