package productListPageTestCase;

import org.testng.annotations.Test;

import com.swagLab.loginPageTestCases.BaseLoginClass;
import com.swagLab.pageOjects.constant.HomePageConstant;


public class TC_05_PersistenceOfSortingChoice extends BaseLoginClass
{
	String dropDownOptionAtoZ,dropDownOptionZtoA,dropDownOptionLowToHigh,dropDownOptionHighToLow;
	@Override
	public void testDataInit() 
	{
	   super.testDataInit();
	   dropDownOptionAtoZ = HomePageConstant.DROP_DOWN_OPTION_A_TO_Z;
	   dropDownOptionZtoA = HomePageConstant.DROP_DOWN_OPTION_Z_TO_A;
	   dropDownOptionLowToHigh=HomePageConstant.DROP_DOWN_OPTION_LOW_TO_HIGH;
	   dropDownOptionHighToLow=HomePageConstant.DROP_DOWN_OPTION_HIGH_TO_LOW;

	 }
	@Test(dependsOnMethods="clickOnLoginButton",description="Click on product sort drop down menu")
	public void clickOnProductSortDropDownMenu() 
	{
		homePage.clickOnProductSortDropDownMenu();
	}
	@Test(dependsOnMethods = "clickOnProductSortDropDownMenu",description="select one option from the drop down")
	public void selectOptionFromTheDropDownMenu()
	{
		homePage.selectValueFromTheDropDownProductList(dropDownOptionZtoA);
	}
	@Test(dependsOnMethods="selectOptionFromTheDropDownMenu",description="navigate to another page")
	public void clickOnAboutUsPageOfProductListPage()
	{
		
		homePage.clickToNavigateAboutUsPage();
	}
	@Test(dependsOnMethods = "clickOnAnyWebElementOfProductListPage",description="Asserting Selected option is same as after navigate to page")
	public void AssertSelectedOptionIsSameAsAfterNavigateToPage()
	{
		driver.navigate().back();
		String actualText=homePage.getFirstSelectedOptionFromTheDropDown();
      homePageAssertion.assertDropDownOptionAreSameAfterNavigateToPage(actualText);
	}
	
}
