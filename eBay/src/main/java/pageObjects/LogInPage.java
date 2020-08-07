package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	
	public WebDriver driver;
	public LogInPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	By userName=By.xpath("//body//div//div//div//div[1]//div[1]//div[1]//input[1]");
	By ClickContinue=By.xpath("//body/div/div/div/form/div/div/button[1]");
		
	public WebElement getUserName() {
		return driver.findElement(userName);
	}

	public WebElement ClickCont() {
		return driver.findElement(ClickContinue);
	}

	
}
