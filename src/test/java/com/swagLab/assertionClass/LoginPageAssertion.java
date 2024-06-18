package com.swagLab.assertionClass;

import org.testng.asserts.SoftAssert;

import com.swagLab.pageOjects.LoginPage;

public class LoginPageAssertion 
{
  LoginPage loginPage;
  SoftAssert softassert=new SoftAssert();
  public LoginPageAssertion()
  {
	  
  }
  public void setPageMethod(LoginPage loginPage)
  {
	  this.loginPage=loginPage;
  }
  public void assertAll()
  {
	  softassert.assertAll();
  }
  public void assertSwagLoginPageUsernameAndPassword(String expectedMessage )
  {
	  softassert.assertEquals(expectedMessage, loginPage.getErrorMessage(),"username and password not match");
  }
  public void assertSwagUserNameFiledIsRequiredMessage(String expectedMessage)
  {
	  softassert.assertEquals(expectedMessage, loginPage.getUsernameErrorMessage(),"username is not there");
  }
  public void assertSwagPasswordFiledIsRequired(String expectedMessage)
  {
	  softassert.assertEquals(expectedMessage, loginPage.getPasswordErrorMessage(),"password is not there");
  }
}
