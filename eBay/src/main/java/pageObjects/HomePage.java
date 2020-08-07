package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public WebDriver driver;
	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	By signin=By.xpath("//a[contains(text(),'Sign in')]");
		
	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	

}
