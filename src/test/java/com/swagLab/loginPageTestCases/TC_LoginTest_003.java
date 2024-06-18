package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.LoginPageAssertion;
import com.swagLab.pageOjects.HomePage;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.LoginPageConstant;

//login test with invalid username and valid password
public class TC_LoginTest_003  extends BaseClass
{
   public static  LoginPage loginpage;
  
   public static LoginPageAssertion loginPageAssertion=new LoginPageAssertion();
   
   @Test
   public void testDataInit()
   {
	    loginpage=new LoginPage(driver);
   }
   @Test(dependsOnMethods="testDataInit",description="Enter invalid Username")
   public void enterInvalidUserName()
   {
	   loginpage.enterInvalidUserName(invalidUserName);
   }
   @Test(dependsOnMethods="enterInvalidUserName",description="Enter valid password")
   public void enterPassword()
   {
	loginpage.enterPassword(password);   
   }
   @Test(dependsOnMethods="enterPassword",description="Click on login Button")
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
