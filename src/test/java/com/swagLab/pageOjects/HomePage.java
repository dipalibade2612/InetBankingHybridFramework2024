package com.swagLab.pageOjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class HomePage 
{
  WebDriver ldriver;
	Logger logger;
    Select select;
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		logger = Logger.getLogger("LoginPageLogger");
		PropertyConfigurator.configure("Log4j.properties");
	}

	// Text
    @FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement swagLabsLogoText;

	// Action Method

	// Get

	// Button
	@FindBy(xpath="//div[contains(@class, 'inventory_item_name')]//ancestor::div[@id='inventory_container']/div[@class='inventory_list']")
	List<WebElement> productNameList;
	// Drop Down
	
	@FindBy(xpath="//div[contains(@class, 'inventory_item_price')]//ancestor::div[@id='inventory_container']/div[@class='inventory_list']")
	List<WebElement>productPrizeList;
	
	@FindBy(xpath = "//select[contains(@class,'product_sort')]")
	WebElement productSortDropDownMenu;
	
     @FindBy(xpath="//a[text()='About']")
     WebElement aboutUsButton;

/////////////////////// Action Method //////////////////////////////////////
	
	// Click
	
	public void clickOnProductSortDropDownMenu() {
		logger.info("Click on product sort drop down menu");
		productSortDropDownMenu.click();
	}
	
	//select
	 public void selectValueFromTheDropDownProductList(String optionText)
	{
		  select=new Select(productSortDropDownMenu);
		 logger.info("select option from the drop Down");
		 select.selectByVisibleText(optionText);
	}
	
	// GET
	 
	 public String getFirstSelectedOptionFromTheDropDown()
	 {
		 select=new Select(productSortDropDownMenu);
		 WebElement firstSelectedOptionFromTheDroDown=select.getFirstSelectedOption();
		 String FirstSelectedOption=firstSelectedOptionFromTheDroDown.getText();
		 return FirstSelectedOption;

	 }
	 public String getSwagLogoText()
	{
		return swagLabsLogoText.getText();
	}
	public void clickToNavigateAboutUsPage()
	{
		 aboutUsButton.click();
		 
	}
	public  List<String> getProductNameList()
	{
		List<String>productNames=new ArrayList<>();
		logger.info("get all products name");
		for(int i=0;i<productNameList.size();i++)
		{
			String name=productNameList.get(i).getText();
			productNames.add(name);
		}
		return productNames;
	    
	}
	
	public  List<String> getProductPrizeList()
	{
		List<String>productPrize=new ArrayList<>();
		logger.info("get all products prize");
		for(int i=0;i<productPrizeList.size();i++)
		{
			String name=productPrizeList.get(i).getText();
			productPrize.add(name);
		}
		return productPrize;
	    
	}
	
}
