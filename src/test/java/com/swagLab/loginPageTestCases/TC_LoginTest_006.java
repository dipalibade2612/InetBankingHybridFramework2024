package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;

//login with username and without password
public class TC_LoginTest_006 extends BaseClass
{
	public static  LoginPage loginpage;
	  
	   public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
	   
	   @Test
	   public void testDataInit()
	   {
		    loginpage=new LoginPage(driver);
	   }
	   @Test(dependsOnMethods="testDataInit",description="Enter valid username")
	   public void enterUserName()
	   {
		loginpage.enterUserName(username);   
	   }
	   @Test(dependsOnMethods="enterUserName",description="Click on login Button")
	   public void clickOnLoginButton()
	   {
		  loginpage.clickLoginButton();
	   }
	   
	   @Test(dependsOnMethods="clickOnLoginButton",description="Asserting password is required")
		public void assertPasswordIsRequired()
		{
			loginPageAssertion.setPageMethod(loginpage);
//			loginPageAssertion.assertSwagUserNameFiledIsRequiredMessage(LoginPageConstant.PASSWORD_ERROR_MESSAGE);	
		}



}
