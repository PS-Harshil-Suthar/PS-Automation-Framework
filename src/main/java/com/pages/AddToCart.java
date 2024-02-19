package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartButton;
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartOption;
	
	@FindBy (xpath = "//button[@id='checkout']")
	private WebElement checkOut;
	
	@FindBy (id = "first-name")
	private WebElement fName;
	
	@FindBy (id = "last-name")
	private WebElement lName;
	
	@FindBy (id = "postal-code")
	private WebElement postalCode;
	
	@FindBy (id = "continue")
	private WebElement continueButton;
	
	@FindBy (id = "finish")
	private WebElement finihsButton;
	
	@FindBy (id = "back-to-products")
	private WebElement backToProducts;
	
	public void inputInformation( String fname, String lname, String postalcode) {
		fName.clear();
		fName.sendKeys(fname);
		lName.clear();
		lName.sendKeys(lname);
		postalCode.clear();
		postalCode.sendKeys(postalcode);
	}
	public void finishButton() {
		finihsButton.click();
	}
	
	public void backToProducts() {
		backToProducts.click();
	}
	
	public void addToCartButton() {
		addToCartButton.click();
		cartOption.click();
		checkOut.click();
	}
	
	public void contineButton() {
		continueButton.click();
	}
	
}
