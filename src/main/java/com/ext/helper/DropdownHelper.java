package com.ext.helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	
	static WebDriver driver;
	
	public DropdownHelper(WebDriver driver)
	{
		this.driver= driver;
	}
	 public static void selectByIndex(WebElement ele, int iIndex)
	 {
		 Select se =new Select(ele);
		 se.selectByIndex(iIndex); 
	 }
	 public static void selectByVisibleText(WebElement ele, String sVisibleValue)
	 {
		 Select se =new Select(ele);
		 se.selectByVisibleText(sVisibleValue); 
	 }
	 public static void selectByValue(WebElement ele, String sValue)
	 {
		 Select se =new Select(ele);
		 se.selectByValue(sValue); 
	 }
	 
	 public static List<WebElement> getOptions(WebElement ele)
	 {
		 Select se =new Select(ele);
		 return se.getOptions();
	}
	 
	 
	 public static List<WebElement> getAllSelectedOptions(WebElement ele)
	 {
		 Select se =new Select(ele);
		 return se.getAllSelectedOptions();
	 }
	
	 public static WebElement getFirstSelectedOption(WebElement ele)
	 {
		 Select se =new Select(ele);
		 return se.getFirstSelectedOption();
	 }
	 
	 public static void deSelectAll(WebElement ele)
	 {
		 Select se =new Select(ele);
		 se.deselectAll();
	 }
	 
	 public static void deselectByIndex(WebElement ele, int iIndex)
	 {
		 Select se =new Select(ele);
		 se.deselectByIndex(iIndex); 
	 }
	 public static void deselectByVisibleText(WebElement ele, String sVisibleValue)
	 {
		 Select se =new Select(ele);
		 se.deselectByVisibleText(sVisibleValue); 
	 }
	 public static void deselectByValue(WebElement ele, String sValue)
	 {
		 Select se =new Select(ele);
		 se.deselectByValue(sValue); 
	 }
	  
	 public static void selectMultipleValues( String sValues, String sAttribute, List<WebElement> ele)
	 {
		 String [] allValues = sValues.split(",");
		 
		 for (String value : allValues)
		 {
			 for(WebElement element: ele)
			 {
				 
				 String ddValue = element.getAttribute(sAttribute);
				 
				 if(ddValue.equalsIgnoreCase(value))
				 {
					if (!element.isSelected())
					{
						element.click();
					}
				 }
				 
			 }
		
			 
			 
		 }
		 
	 }
	 
	 
	 
	 
	 
}
