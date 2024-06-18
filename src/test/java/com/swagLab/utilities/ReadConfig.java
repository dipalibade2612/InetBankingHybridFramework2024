package com.swagLab.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	 // ReadConfig is a simple utility class this class read variable/data from is stored utilities package
		//config.properties file and provides this data to the base class.this file stored in configuration folder in project
	    
		Properties pro;//properties is a class have some methods to read value from config file
		public ReadConfig() 
		{
			File src=new File("./Configuration/config.properties");
		try 
		{
	       FileInputStream fis=new FileInputStream(src);
	       pro=new Properties();
	       pro.load(fis);//first load this file runtime 
	    		   
		}
		catch(Exception e)//sometimes occurs exception handle this exception
		{
			System.out.println("Exception is"+e.getMessage());
		}
		}
		
		public String getApplicationUrl()
		{
			String url=pro.getProperty("baseUrl");
			return url;
		}
		public String getUsername() 
		{
			String username=pro.getProperty("username");
			return username;
		}
		public String getPassword()
		{
			String password=pro.getProperty("password");
			return password;
		}
		public String getInvalidUserName() 
		{
			String invalidUserName=pro.getProperty("invalidUserName");
			return invalidUserName;
		}
		public String getInvalidPassword() 
		{
			String invalidPassword=pro.getProperty("invalidPassword");
			return invalidPassword;
		}

}
