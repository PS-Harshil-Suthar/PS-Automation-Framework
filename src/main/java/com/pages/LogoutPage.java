package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public LogoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement menuButtom;
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	
	public void menuButton() {
		menuButtom.click();
	}
	
	public void logoutButton() {
		logoutButton.click();
	}
	
}
