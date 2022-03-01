package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	public static void custom_Sendkeys(WebElement element,String value,String fieldname) {
		element.sendKeys(value);
	}
	public static void custom_Click(WebElement element,String fieldname) {
		element.click();
	}
	public static void custom_handle_dropDown(WebElement element,String text,String fielname) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
//	Action _moveto element
//	doubleclick
//	contextclick
//	draganddrop
//	copypaste --key
//	Alert
//	ChildWindow handling 
//	Assert --> String 
//	Screenshot
	
	
	
	
	
	
	

}
