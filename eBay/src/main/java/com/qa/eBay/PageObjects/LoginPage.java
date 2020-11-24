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

public class LoginPage {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// By ClickContinue=By.xpath("//body/div/div/div/form/div/div/button[1]");

	@FindBy(xpath = OR_LoginPage.OR_LOGINPAGE_USERNAME_TEXTBOX)
	WebElement username;

	@FindBy(xpath = OR_LoginPage.OR_LOGINPAGE_CONTINUE_BUTTON)
	WebElement clickContinue;

	public void signIn() {

		Utilities.sendKey(log, username, "aponperson@gmail.com", OR_LoginPage.S_LOGINPAGE_USERNAME_TEXTBOX);
		Utilities.clickButton(log, clickContinue, OR_LoginPage.S_LOGINPAGE_CONTINUE_BUTTON);

	}

}
