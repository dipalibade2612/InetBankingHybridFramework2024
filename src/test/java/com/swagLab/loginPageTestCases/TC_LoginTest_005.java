package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;
//login without username and  with password
public class TC_LoginTest_005 extends BaseClass
{
	public static  LoginPage loginpage;
	  
	   public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
	   
	   @Test
	   public void testDataInit()
	   {
		    loginpage=new LoginPage(driver);
	   }
	   @Test(dependsOnMethods="testDataInit",description="Enter valid password")
	   public void enterPassword()
	   {
		loginpage.enterPassword(password);   
	   }
	   @Test(dependsOnMethods="enterPassword",description="Click on login Button")
	   public void clickOnLoginButton()
	   {
		  loginpage.clickLoginButton();
	   }
	   
	   @Test(dependsOnMethods="clickOnLoginButton",description="Asserting userName is required")
		public void assertUsernameIsRequired()
		{
			loginPageAssertion.setPageMethod(loginpage);
//			loginPageAssertion.assertSwagUserNameFiledIsRequiredMessage(LoginPageConstant.USERNAME_ERROR_MESSAGE);
//			loginPageAssertion.ass
			
		}


}
