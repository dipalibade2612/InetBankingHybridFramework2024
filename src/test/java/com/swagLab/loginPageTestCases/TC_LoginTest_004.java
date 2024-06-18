package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;

//enter valid username and invalid password
public class TC_LoginTest_004 extends BaseClass
{
	public static  LoginPage loginpage;
	  
	   public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
	   
	   @Test
	   public void testDataInit()
	   {
		    loginpage=new LoginPage(driver);
	   }
	   @Test(dependsOnMethods="testDataInit",description="Enter valid Username")
	   public void enterUserName()
	   {
		   loginpage.enterUserName(username);
	   }
	   @Test(dependsOnMethods="enterUserName",description="Enter Invalid password")
	   public void enterInvalidPassword()
	   {
		loginpage.enterInvalidPassword(invalidPassword);   
	   }
	   @Test(dependsOnMethods="enterInvalidPassword",description="Click on login Button")
	   public void clickOnLoginButton()
	   {
		  loginpage.clickLoginButton();
	   }
	   
	   @Test(dependsOnMethods="clickOnLoginButton",description="Asserting username and password not match")
		public void assertUsernameAndPasswordIsCorrect()
		{
			loginPageAssertion.setPageMethod(loginpage);
			loginPageAssertion.assertSwagLoginPageUsernameAndPassword(LoginPageConstant.ERROR_MESSAGE);
			
		}

}
