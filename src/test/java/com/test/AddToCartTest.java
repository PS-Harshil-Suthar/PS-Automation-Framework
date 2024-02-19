package com.test;

import java.time.Duration;

import org.testng.annotations.Test;
import com.main.BaseClass;
import com.pages.AddToCart;


public class AddToCartTest extends BaseClass {

	@Test
	public void testCart() {
		AddToCart addToCart = new AddToCart(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		addToCart.addToCartButton();
	}
	
}
