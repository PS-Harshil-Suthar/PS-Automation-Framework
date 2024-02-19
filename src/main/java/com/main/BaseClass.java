package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void initSutite() {
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void killBrowser() {
		driver.quit();
	}
	
}
