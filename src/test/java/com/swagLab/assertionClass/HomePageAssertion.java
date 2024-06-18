package com.swagLab.assertionClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.asserts.SoftAssert;
import com.swagLab.pageOjects.HomePage;
import com.swagLab.pageOjects.constant.HomePageConstant;
public class HomePageAssertion {
  
	HomePage homePage;
	SoftAssert softAssert = new SoftAssert();
	
	public HomePageAssertion() {
		// TODO Auto-generated constructor stub
	}
	
	public void setPageMethod(HomePage homePage) {
		this.homePage = homePage;
	}
	
	public void assertAll() {
		softAssert.assertAll();
	}
	
	public void assertSwagHomePageLogoTitle(String expectedTitle) {
		softAssert.assertEquals(expectedTitle, homePage.getSwagLogoText(), "Logo text is not matching");

	}
	public void assertProductNameByAscendingOrder(List<String> proudctNames)
	{
	   List<String>productNamesSorted=new ArrayList<>(proudctNames);
	   Collections.sort(productNamesSorted);
	  softAssert.assertEquals(proudctNames,productNamesSorted,"Product names are not sorted By ascending order");  
	}
	public void assertProductNamesByDescendingOrder(List<String> productNames)
	{
		List<String>productNamesSorted=new ArrayList<>(productNames);
		   Collections.sort(productNamesSorted,Collections.reverseOrder());
		  softAssert.assertEquals(productNames,productNamesSorted,"Product names are not sorted by Descending order");  
	}
	public void assertProductPrizeByAscendingOrder(List<String> proudctPrize)
	{
	   List<String>productPrizeSorted=new ArrayList<>(proudctPrize);
	   Collections.sort(productPrizeSorted);
	  softAssert.assertEquals(proudctPrize,productPrizeSorted,"Product names are not sorted By ascending order");  
	}
	public void assertProductPrizeByDescendingOrder(List<String> productPrize)
	{
		List<String>productPrizeSorted=new ArrayList<>(productPrize);
		Collections.sort(productPrizeSorted,Collections.reverseOrder());
		softAssert.assertEquals(productPrize,productPrizeSorted,"Product names are not sorted by Descending order");  
	}
	public void assertDropDownOptionAreSameAfterNavigateToPage(String actualText)
	{
		softAssert.assertEquals(actualText, HomePageConstant.DROP_DOWN_OPTION_Z_TO_A,"Both Options are not same After navigate page");
	}

	public void newAsseration(){

	}
	}
	

