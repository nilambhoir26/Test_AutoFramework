package com.qa.tests;

import org. testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utils.Constants;

public class HomePageTest extends BaseTest {
	
	@BeforeClass
	public void HomePageSetup() {
		homepg = loginpg.getLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyHomePageTitle() {
	String HomePgTitle=	homepg.getHomePageTitle();
	Assert.assertEquals(HomePgTitle, Constants.HOME_PAGE_TITLE);
	}
	 
	@Test
	public void verifyHomeTabDisplay() {
		Assert.assertTrue(homepg.getHomeTab());
	}

	@Test
	public void verifyUserLoginName() {
		String username = homepg.getUserLoginName();
		Assert.assertEquals(username, prop.getProperty("UserLogin"));
	}
}
