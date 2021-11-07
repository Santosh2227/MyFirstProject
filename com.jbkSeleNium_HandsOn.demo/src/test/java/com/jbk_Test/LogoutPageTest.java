package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.LogoutLinkPage;
import com.testbase.TestBase;

public class LogoutPageTest extends TestBase{

	WebDriver driver;
	LogoutLinkPage logout;
	
	@BeforeClass
	public void setUp()
	{
		driver=initialization();
		logout=loadLoginPage().navigateTodashboardPage().navigateToLogoutPageTest();
	}

	@Test
	public void checkPageURLTest()
	{
		Assert.assertTrue(logout.verifyPageCurrentURL());
	}
	
	@Test(dependsOnMethods = "checkPageURLTest")
	public void checkPageTitleTest()
	{
		Assert.assertTrue(logout.verifyPageTitle());
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
