package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utils.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test(priority =1)
	public void verifyLoginPageTest() {
		
		String LoginTitle = loginpg.getLoginPageTitle();
		Assert.assertEquals(LoginTitle, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority =2)
	public void verifyLoginFunction() {
		loginpg.getLogin(prop.getProperty("username"), prop.getProperty("password"));
		String s =homepg.getUserLoginName();
		//Assert.assertEquals(s, prop.getProperty("UserLogin"));
	}
}
