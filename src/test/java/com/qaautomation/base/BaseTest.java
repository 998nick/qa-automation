package com.qaautomation.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

	protected WebDriver driver;
	
	@BeforeEach
	void abrirNavegador() {
		ChromeOptions options = new ChromeOptions();
		
		if(Boolean.getBoolean("headless")) {
			options.addArguments("--headless=new", "--no-sandbox",
                    "--disable-dev-shm-usage", "--window-size=1920,1080");
		}
		
		driver = new ChromeDriver(options);
	}
	
	@AfterEach
	void fecharNavegador() {
		if(driver != null) {
			driver.quit();
		}
	}
	
}
