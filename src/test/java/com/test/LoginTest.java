package com.test;

import java.time.Duration;

import org.testng.annotations.Test;

import com.main.BaseClass;
import com.pages.AddToCart;
import com.pages.Constant;
import com.pages.LoginPage;
import com.pages.LogoutPage;
import com.pages.PropertyReader;

import bsh.org.objectweb.asm.Constants;

public class LoginTest extends BaseClass {

	@Test
	public void testLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		AddToCart addToCart = new AddToCart(driver);
		LogoutPage logoutPage = new LogoutPage(driver);
		PropertyReader propertyReader = new PropertyReader();
		driver.get(propertyReader.readProperty(Constant.URL));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginPage.clickButton();
		String username = propertyReader.readProperty(Constant.USERNAME);
		String password = propertyReader.readProperty(Constant.PASSWORD);
		loginPage.loginApplication(username, password);
//		Thread.sleep(2000);
		addToCart.addToCartButton();
//		Thread.sleep(2000);
		String fname = propertyReader.readProperty(Constant.FNAME);
		String lname = propertyReader.readProperty(Constant.LNAME);
		String postalcode = propertyReader.readProperty(Constant.POSTALCODE);
		addToCart.inputInformation(fname, lname, postalcode);
//		Thread.sleep(2000);
		addToCart.contineButton();
//		Thread.sleep(2000);
		addToCart.finishButton();
//		Thread.sleep(2000);
		addToCart.backToProducts();
//		Thread.sleep(2000);
		logoutPage.menuButton();
//		Thread.sleep(2000);
		logoutPage.logoutButton();
//		Thread.sleep(2000);
		killBrowser();

	}

}
