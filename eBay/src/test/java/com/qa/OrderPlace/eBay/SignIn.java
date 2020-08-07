package com.qa.OrderPlace.eBay;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.eBay.base.Base;

import pageObjects.HomePage;
import pageObjects.LogInPage;

public class SignIn extends Base {

	@Test

	public void signIn() throws IOException {

		driver = initializeDriver();
		driver.get("https://www.ebay.com/");
		HomePage login = new HomePage(driver);
		login.getLogin().click();
		LogInPage loginpage = new LogInPage(driver);
		loginpage.getUserName().sendKeys("aponperson@gmail.com");
		loginpage.ClickCont().click();
		

	}

}
