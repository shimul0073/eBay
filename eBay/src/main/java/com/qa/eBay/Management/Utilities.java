package com.qa.eBay.Management;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class Utilities {

	public static void sendKey(Logger log, WebElement element, String inputText, String TextBoxName) {
		element.clear();
		element.sendKeys(inputText);
		log.info("Input Text Sent to " + TextBoxName + " Successfully");
	}

	public static void clickButton(Logger log, WebElement element, String ButtonName) {
		element.click();
		log.info(ButtonName + " Clicked" + " Successfully");
	}
}
