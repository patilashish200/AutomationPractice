package com.ext.helper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	private static WebDriver driver;

	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public static void elementTobeVisible(WebElement element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void elementTobeVisible(List<WebElement> element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public static void elementTobeInvisible(List<WebElement> element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
	}
	public static void elementTobeClickable(WebElement element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void elementTobeSelectable(WebElement element, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void textTobePresentInElement(WebElement element,String text, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	
	public static void isTitleMatched(String sTitle, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(sTitle));
		
	}
	
	public static void  alertIsPresent(int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static void implicitlyWait(int timeOut)
	{
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		
		
	}
	
	
	
}
