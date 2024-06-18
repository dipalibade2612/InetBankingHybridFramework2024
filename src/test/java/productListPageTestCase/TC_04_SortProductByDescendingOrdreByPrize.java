package productListPageTestCase;

import java.util.List;

import org.testng.annotations.Test;

import com.swagLab.loginPageTestCases.BaseLoginClass;
import com.swagLab.pageOjects.constant.HomePageConstant;

public class TC_04_SortProductByDescendingOrdreByPrize  extends BaseLoginClass
{
 String	dropDownOptionHighToLow;
 @Override
 public void testDataInit() 
	{
	   super.testDataInit();
	   
	   dropDownOptionHighToLow=HomePageConstant.DROP_DOWN_OPTION_HIGH_TO_LOW;
	   
	 }
	
	
	@Test(dependsOnMethods="clickOnLoginButton",description="click on product sort drop down menu")
	public void clickOnProductSortDropDownMenu() 
	{
		homePage.clickOnProductSortDropDownMenu();
	}
	@Test(dependsOnMethods = "clickOnProductSortDropDownMenu",description="select option from the drop down list")
	public void selectOptionByDescendingProductPrize()
	{
		homePage.selectValueFromTheDropDownProductList(dropDownOptionHighToLow);
	}
	@Test(dependsOnMethods="selectOptionByDescendingProductPrize",description = "Asserting product prize by descending order")
	public void assertProductListByDescendingProductPrize()
	{
		List<String>productPrize=homePage.getProductPrizeList();
		homePageAssertion.setPageMethod(homePage);
		homePageAssertion.assertProductPrizeByDescendingOrder(productPrize);
	}
	

}
