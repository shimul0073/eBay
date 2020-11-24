package com.qa.OrderPlace.eBay;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.eBay.Base.Base;
import com.qa.eBay.PageObjects.HomePage;
import com.qa.eBay.PageObjects.LoginPage;

public class HomePageLogin extends Base {
	
	public WebDriver driver;
	@BeforeTest

	public void initialize() throws IOException {

		// initializing the driver
		driver = initializeDriver();
		// getting url from data.properties
		driver.get(prop.getProperty("url"));
	}

	@Test

	public void signIn() throws IOException, InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.ClickSignIn();
		Thread.sleep(10000);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.signIn();
	}

	@AfterTest

	public void tearDown() {
		driver.close();
	}

}
