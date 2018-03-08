package com.ext.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserHelper {

	static WebDriver driver;
	
	
	public BrowserHelper()
	{
		this.driver  = driver;
		
	}
	
	
	public  static void navigateTo(String sAppURL)
	{
		driver.navigate().to(sAppURL);
		
	}

	public  static void navigateForward()
	{
		driver.navigate().forward();
		
	}
	public  static void navigateBack()
	{
		driver.navigate().back();
		
	}
	
	public  static void refresh()
	{
		driver.navigate().refresh();
		
	}
	
	public static  Set<String> getWindowHandles()
	{
		
		Set<String> sAllWindows = driver.getWindowHandles();
		
		return sAllWindows;
	}
	
	public static  String getParentWindowHandle()
	{
		
		String sParentWindow = driver.getWindowHandle();
		
		return sParentWindow;
	}
	
	
	public static void switchToChildWindow()
	{
	
		Set<String> allWin =getWindowHandles();	
		
		Iterator<String> ite= allWin.iterator();
		
		while(ite.hasNext())
		{
		String sWindow=	ite.next();
		
		if (!getParentWindowHandle().equals(sWindow))
		{
			driver.switchTo().window(sWindow);
		}
		
		}
	
	}
	
	public void switchToParentWindow() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandles());
		driver.switchTo().window(windowsId.get(0));
	
	}
	
	public static void switchToFrameByNameOrId(String sNameID)
	{
		driver.switchTo().frame(sNameID);
	}
	
	
	public static void switchToFrameByIndex(int iIndex)
	{
		driver.switchTo().frame(iIndex);
	}
	
	public static void switchToFrameByWebElement(WebElement ele)
	{
		driver.switchTo().frame(ele);
	
	}
	
	public static void switchToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void switchToMainFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	
	
}
