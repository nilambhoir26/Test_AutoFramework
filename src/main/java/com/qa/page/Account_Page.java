package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account_Page {
	
	public WebDriver driver;
	
	public Account_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	private By Username = By.name("email");

}
