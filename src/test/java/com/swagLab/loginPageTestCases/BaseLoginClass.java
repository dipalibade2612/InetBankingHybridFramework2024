package com.swagLab.loginPageTestCases;

import org.testng.annotations.Test;

import com.swagLab.assertionClass.HomePageAssertion;
import com.swagLab.pageOjects.HomePage;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.HomePageConstant;

public class BaseLoginClass extends BaseClass{
	public  static LoginPage loginPage ;
	public static HomePage homePage;
	public static HomePageAssertion homePageAssertion = new HomePageAssertion() ;
	
	@Test
	public void testDataInit() {
	   loginPage = new LoginPage(driver);
    }
	
	@Test(dependsOnMethods = "testDataInit" , description = "Enter UserName")
	public void enterUserName() {
       loginPage.enterUserName(username);
	}
	
	@Test(dependsOnMethods = "enterUserName" , description = "Enter Password" )
	public void enterPassword() 
	{
		loginPage.enterPassword(password);
	}
	
	@Test(dependsOnMethods = "enterPassword" ,description = "Click on login button")
	public void clickOnLoginButton(){
		homePage =loginPage.clickLoginButton();
	}
	
}
