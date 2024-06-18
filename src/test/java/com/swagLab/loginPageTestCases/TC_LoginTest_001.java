package com.swagLab.loginPageTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swagLab.assertionClass.HomePageAssertion;
import com.swagLab.pageOjects.HomePage;
import com.swagLab.pageOjects.LoginPage;
import com.swagLab.pageOjects.constant.HomePageConstant;
// Login Test with Valid User Name and Password
public class TC_LoginTest_001 extends BaseClass
{
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
	
	@Test(dependsOnMethods = "clickOnLoginButton" , description = "Asserting SawgLab Home Page is open")
	public void assertSwagLabPageIsOpen() {
		homePageAssertion.setPageMethod(homePage);
		homePageAssertion.assertSwagHomePageLogoTitle(HomePageConstant.SWAG_LAB_HOME_PAGE_TITLE);
	}
	
}
