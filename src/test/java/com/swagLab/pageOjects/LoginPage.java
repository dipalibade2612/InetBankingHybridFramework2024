package com.swagLab.pageOjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public static Logger logger;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		logger = Logger.getLogger("LoginPageLogger");
		PropertyConfigurator.configure("Log4j.properties");
	}

	// InputBox

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement usernameInputBox;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInputBox;

	// Button

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginButton;

	// Text
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement errorMessage;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement usernameRequiredMessage;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement passwordRequiredMessage;
	// action methods

	// Enter
	public void enterUserName(String userName) {
		logger.info("Enter user name");
		usernameInputBox.sendKeys(userName);
		logger.info("Enter Username as : " + userName);
	}

	public void enterPassword(String password) {
		logger.info("Enter Password");
		passwordInputBox.sendKeys(password);
		logger.info("Enter Password As : " + password);
	}

	public void enterInvalidUserName(String invalidUserName) {
		logger.info("Enter invalid name");
		usernameInputBox.sendKeys(invalidUserName);
		logger.info("Enter invalidUserName As:" + invalidUserName);
	}

	public void enterInvalidPassword(String invalidPassword) {

		logger.info("Enter invalid password");
		usernameInputBox.sendKeys(invalidPassword);
		logger.info("Enter InvalidPassword As:" + invalidPassword);

	}

	// Click
	public HomePage clickLoginButton() {
		logger.info("Clicking on login button");
		loginButton.click();
		logger.info("Clicked on login button");
		return new HomePage(ldriver);
	}

	// Get
	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public String getUsernameErrorMessage() {
		return usernameRequiredMessage.getText();
	}

	public String getPasswordErrorMessage() {
		return passwordRequiredMessage.getText();
	}

	public String getUsernameAndPasswordErrorMessage() {
		return usernameRequiredMessage.getText();
	}
	// Select

}
