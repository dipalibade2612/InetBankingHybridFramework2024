package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;


import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;

// Login Test with invalid username and password

public class TC_LoginTest_002 extends BaseClass
{
     public static LoginPage loginpage;
     public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
     
	
	@Test
	public void testDataInit()
	{
		loginpage=new LoginPage(driver);
	}
	@Test(dependsOnMethods="testDataInit",description="Enter Invalid UserName")
	 public void enterUserName()
	 {
		loginpage.enterUserName(invalidUserName);
	 }
	@Test(dependsOnMethods="enterUserName",description="Enter Invalid Password")
	public void enterPassword()
	{
	    loginpage.enterPassword(invalidPassword);
	
	}
	@Test(dependsOnMethods="enterPassword",description="Click On Login Button")
	public void clickOnLoginButton()
	{
		loginpage.clickLoginButton();
		
	}
	@Test(dependsOnMethods="clickOnLoginButton",description="Asserting username and password not match")
	public void assertUsernameAndPasswordIsCorrect()
	{
		loginPageAssertion.setPageMethod(loginpage);
		loginPageAssertion.assertSwagLoginPageUsernameAndPassword(LoginPageConstant.ERROR_MESSAGE);
		loginPageAssertion.assertAll();
		
	}
	
}
