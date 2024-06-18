package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;

//login without password and username
public class TC_LoginTest_007 extends BaseClass
{
	public static  LoginPage loginpage;
	  
	   public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
	   
	   @Test
	   public void testDataInit()
	   {
		    loginpage=new LoginPage(driver);
	   }
	   
	   @Test(dependsOnMethods="testDataInit",description="Click on login Button")
	   public void clickOnLoginButton()
	   {
		  loginpage.clickLoginButton();
	   }
	   
	   @Test(dependsOnMethods="clickOnLoginButton",description="Asserting username and password is required")
		public void assertUserNameAndPasswordIsRequired()
		{
			loginPageAssertion.setPageMethod(loginpage);
			loginPageAssertion.assertSwagPasswordFiledIsRequired(LoginPageConstant.USERNAME_ERROR_MESSAGE);	
		}


}
