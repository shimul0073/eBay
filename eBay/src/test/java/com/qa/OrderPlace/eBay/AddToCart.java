package com.qa.OrderPlace.eBay;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.eBay.Base.Base;
import com.qa.eBay.PageObjects.HomePage;
import com.qa.eBay.PageObjects.LoginPage;
import com.qa.eBay.PageObjects.ShoppingCart;

public class AddToCart extends Base {
	public WebDriver driver;
	
	
	@BeforeTest

	public void initialize() throws IOException {

		// initializing the driver
		driver = initializeDriver();
		// getting url from data.properties
		driver.get(prop.getProperty("url"));
	}

	@Test

	public void addCart() throws InterruptedException {
		

		HomePage homePage = new HomePage(driver);
		homePage.ClickCart();
		
		ShoppingCart shoppingCart = new ShoppingCart(driver);
		shoppingCart.StartShopping();

		
	}

	@AfterTest

	public void tearDown() {
		driver.close();
	}

}
