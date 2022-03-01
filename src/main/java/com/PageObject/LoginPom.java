package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	//encapsulation
	WebDriver driver; // instance
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Emailid;
    @FindBy(how=How.XPATH,using="//input[@id='pass']")
    private WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement loginbtn;
		
	public LoginPom(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getEmailid() {
		return Emailid;
	}
	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}	
}
