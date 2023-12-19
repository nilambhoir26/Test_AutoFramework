package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.base.BasePage;

public class LoginPage extends BasePage{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By Username = By.name("email");
	private By Password = By.name("password");
	private By LoginBtn = By.xpath("//button[@type =\"submit\"]");
	
	
	public String getLoginPageTitle() {
		 return driver.getTitle();
	}
	
	public HomePage getLogin(String Un, String Pswd) {
		driver.findElement(Username).sendKeys(Un);
		driver.findElement(Password).sendKeys(Pswd);
		driver.findElement(LoginBtn).click();
		return new HomePage(driver);
		
	}
	
	public void getLoginPageDetailTesting() {
	System.out.println("this page will give details of page");
	}
	
	
	

}
