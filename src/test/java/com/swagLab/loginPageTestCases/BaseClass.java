package com.swagLab.loginPageTestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.*;

import com.swagLab.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//common methods/things with annotaions  are placed in the base class that have used in all test cases
		//Log4j logging framework can help in debugging applications easily.
		//With different log levels,
		//it becomes easier to sort information based on categories.
		//base class get the data from ReadConfig file here create instance of this file
		
	    ReadConfig readconfig=new ReadConfig();
		public String baseUrl=readconfig.getApplicationUrl();
		public String username=readconfig.getUsername();
		public String password=readconfig.getPassword();
		public String invalidUserName=readconfig.getInvalidUserName();
		public String invalidPassword=readconfig.getInvalidPassword();
	    public static WebDriver driver;
	    public static Logger logger;
	    
	  //  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

       
		@BeforeClass
	    public void setUp()
	    {
			//ChromeOptions chromeOptions = new ChromeOptions()
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		   
		 //Class PropertyConfigurator.Allows the configuration of log4j from an external file
		//log4j.properties specify the root logger, appended, and layout information in the file.
		
		   logger=Logger.getLogger("BaseClass Logger");
		   PropertyConfigurator.configure("Log4j.properties");
		   driver.get(baseUrl);
			
	    }
		
		@AfterClass
		 public void tearDown()
		 {
			 driver.quit();
		 }
}
