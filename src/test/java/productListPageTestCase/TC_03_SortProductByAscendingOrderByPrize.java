package productListPageTestCase;


import java.util.List;

import org.testng.annotations.Test;

import com.swagLab.loginPageTestCases.BaseLoginClass;
import com.swagLab.pageOjects.constant.HomePageConstant;

public class TC_03_SortProductByAscendingOrderByPrize extends BaseLoginClass
{
	String dropDownOptionLowToHigh;
	@Override
	public void testDataInit() 
	{
	   super.testDataInit();
	   dropDownOptionLowToHigh=HomePageConstant.DROP_DOWN_OPTION_LOW_TO_HIGH;
	   
	}
	
	
	@Test(dependsOnMethods="clickOnLoginButton",description="click on product sort drop down menu")
	public void clickOnProductSortDropDownMenu() 
	{
		homePage.clickOnProductSortDropDownMenu();
	}
	@Test(dependsOnMethods = "clickOnProductSortDropDownMenu",description="select option from the drop down list")
	public void selectOptionByAscendingProductPrize()
	{
		homePage.selectValueFromTheDropDownProductList(dropDownOptionLowToHigh);
	}
	@Test(dependsOnMethods="selectOptionByAscendingProductPrize",description = "Asserting product prize by ascending order")
	public void assertProductListByAscendingProductPrize()
	{
		List<String>productPrize=homePage.getProductPrizeList();
		homePageAssertion.setPageMethod(homePage);
		homePageAssertion.assertProductPrizeByAscendingOrder(productPrize);
	}

	@Test(dependsOnMethods = "assertProductListByAscendingProductPrize" , description = "this is test method")
	public void test3(){

	}
  	
}
