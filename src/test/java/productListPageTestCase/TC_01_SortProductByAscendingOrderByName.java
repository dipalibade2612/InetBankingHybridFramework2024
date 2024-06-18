package productListPageTestCase;
import java.util.List;

import org.testng.annotations.Test;
import com.swagLab.loginPageTestCases.BaseLoginClass;
//import com.swagLab.pageOjects.HomePage;
import com.swagLab.pageOjects.constant.HomePageConstant;

public class TC_01_SortProductByAscendingOrderByName extends BaseLoginClass{

	String dropDownOptionAToZ, dropDownOptionZtoA;
	@Override
	public void testDataInit() 
	{
	   super.testDataInit();
	   dropDownOptionAToZ = HomePageConstant.DROP_DOWN_OPTION_A_TO_Z;
	   dropDownOptionZtoA = HomePageConstant.DROP_DOWN_OPTION_Z_TO_A;
	}
  	
	@Test(dependsOnMethods="clickOnLoginButton",description="Click on product sort drop down menu")
	public void clickOnProductSortDropDownMenu() 
	{
		homePage.clickOnProductSortDropDownMenu();
	}
	@Test(dependsOnMethods="clickOnProductSortDropDownMenu",description="select one option from the product list")
	public void selectOptionByAscendingProductName()
	{
		homePage.selectValueFromTheDropDownProductList(dropDownOptionZtoA);
		homePage.selectValueFromTheDropDownProductList(dropDownOptionAToZ);
		
	}
	@Test(dependsOnMethods = "selectOptionByAscendingProductName" ,description = "Assert product names are sorted By ascending order")
	public void AssertProductListByAscendingOrder()
	{
	  List<String> productList = homePage.getProductNameList();
	  homePageAssertion.setPageMethod(homePage);
	  homePageAssertion.assertProductNameByAscendingOrder(productList);
	   
	}
	

}
