package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement inputEmail;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement inputPassword;
	
	@FindBy (xpath = "//input[@id='login-button']")
	private WebElement submitButton;

	
	public void clickButton() {
		submitButton.click();
	}
	
	public void loginApplication(String username, String password) {
		inputEmail.clear();
		inputEmail.sendKeys(username);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		submitButton.click();
	}
	

}
