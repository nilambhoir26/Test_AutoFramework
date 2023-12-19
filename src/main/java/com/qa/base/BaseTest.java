package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.page.HomePage;
import com.qa.page.LoginPage;

public class BaseTest {	
	
	public Properties prop;
	public BasePage basepage;
	public WebDriver driver;
	public LoginPage loginpg;
	public HomePage homepg;
	
	@BeforeTest
	public void setup() {
		basepage = new BasePage();
		prop = basepage.init_Properties();
		String BrowserName = prop.getProperty("Browser");
		driver = basepage.init_driver(BrowserName);
		loginpg = new LoginPage(driver);
		//homepg = new HomePage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	

}
