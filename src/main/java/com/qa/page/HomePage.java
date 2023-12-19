package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.base.BasePage;

public class HomePage extends BasePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	private By HomeTab = By.xpath(" //a[@href =\"/\"]/i/..");
	private By UserLogin = By.xpath("//*[text() =\" Logged in as \"] /b");
	
	
	public String getHomePageTitle() {
		 return driver.getTitle();
	}

	
	public boolean getHomeTab() {
		return driver.findElement(HomeTab).isDisplayed();
	}
	
	public String getUserLoginName() {
		return driver.findElement(UserLogin).getText();
	}
}
