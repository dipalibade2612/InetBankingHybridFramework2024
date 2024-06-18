package productListPageTestCase;

import java.util.List;

import org.testng.annotations.Test;

import com.swagLab.loginPageTestCases.BaseLoginClass;
import com.swagLab.pageOjects.constant.HomePageConstant;

public class TC_02_SortProductByDescendingOrderByName extends BaseLoginClass
{
	String dropDownOptionAToZ, dropDownOptionZtoA;
	@Override
	public void testDataInit() 
	{
	   super.testDataInit();
	   dropDownOptionAToZ = HomePageConstant.DROP_DOWN_OPTION_A_TO_Z;
	   dropDownOptionZtoA = HomePageConstant.DROP_DOWN_OPTION_Z_TO_A;
	}
	
	@Test(dependsOnMethods = "clickOnLoginButton",description = "click on proudct sort Drop down Menu")
	public void clickOnProductSortDropDownMenu()
	{
		homePage.clickOnProductSortDropDownMenu();
	}
	
	@Test(dependsOnMethods="clickOnProductSortDropDownMenu",description = "select option from the drop down menu")
	public void selectOptionByDescendingProuctName()
	{
		homePage.selectValueFromTheDropDownProductList(dropDownOptionZtoA);
	}
	
	@Test(dependsOnMethods = "selectOptionByDescendingProuctName",description = "Asserting product names By descending order")
	public void asseertProductListByDescendingOrder()
	{
		List<String> productList = homePage.getProductNameList();
		  homePageAssertion.setPageMethod(homePage);
		  homePageAssertion.assertProductNamesByDescendingOrder(productList);
		   
	}

}
