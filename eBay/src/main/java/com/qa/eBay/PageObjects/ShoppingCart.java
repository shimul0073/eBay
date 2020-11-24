package com.qa.eBay.PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.eBay.Base.Base;
import com.qa.eBay.Management.*;
import com.qa.eBay.ObjectRepository.OR_LoginPage;
import com.qa.eBay.ObjectRepository.OR_ShoppingCart;

public class ShoppingCart {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	public ShoppingCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = OR_ShoppingCart.OR_SHOPPINGCART_CLICKSTARTSHOPPING)
	WebElement startshopping;

	

	public void StartShopping() {

		
		Utilities.clickButton(log, startshopping, OR_ShoppingCart.S_SHOPPINGCART_CLICKSTARTSHOPPING);

	}

}
