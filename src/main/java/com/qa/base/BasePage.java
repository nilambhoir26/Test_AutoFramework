package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String Browser) {

		System.out.println("Test will get executed on " + Browser);

		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please check your Browser name");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		return driver;
	}

	public Properties init_Properties() {

		prop = new Properties();
		try {
			FileInputStream fp = new FileInputStream("./src/main/java/com/qa/config/config.properties");
			prop.load(fp);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}
}
