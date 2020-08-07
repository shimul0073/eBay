package com.qa.eBay.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		// getting file from the properties file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\cool\\eBay\\eBay\\src\\main\\java\\com\\qa\\eBay\\config\\data.properties");
		// loading the properties file
		prop.load(fis);

		// initialize Browser
		String browserName = prop.getProperty("browser");
		// Driver will run by chore driver
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		// using implicitWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Maximizing the screen
		driver.manage().window().maximize();

		return driver;
	}

}
