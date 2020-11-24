package com.qa.eBay.PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.eBay.Base.Base;
import com.qa.eBay.Management.Utilities;
import com.qa.eBay.ObjectRepository.OR_HomePage;
import com.qa.eBay.ObjectRepository.OR_LoginPage;

public class HomePage {

	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = OR_HomePage.OR_HOMEPAGE_CLICKBUTTON)
	WebElement clickbutton;

	@FindBy(xpath = OR_HomePage.OR_HOMEPAGE_CLICKCART)
	WebElement clickcart;
	
	public void ClickSignIn() {

		Utilities.clickButton(log, clickbutton, OR_HomePage.S_HOMEPAGE_CLICKBUTTON);

	}
	
	public void ClickCart () throws InterruptedException {
		
		Utilities.clickButton(log, clickcart, OR_HomePage.S_HOMEPAGE_CLICKCART);
		Thread.sleep(10000);
	}

}
