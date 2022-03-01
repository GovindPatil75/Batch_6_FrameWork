package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_LoginTest extends BaseClass{

	@Test
	public void verify_loginwithValidCredentials() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getEmailid(), excel.getStringData("Login", 0, 0), "EmailId");
		Library.custom_Sendkeys(login.getPassword(), excel.getStringData("Login", 0, 1), "Password");
		Library.custom_Click(login.getLoginbtn(), "Loginbtn");
		
	}
		
	
}
