package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.UsefulLinkPage;
import com.testbase.TestBase;

public class UsefulLinkPageTest extends TestBase {

	WebDriver driver;
	UsefulLinkPage uselink;
	
	@BeforeClass
	public void setUp()
	{
		driver=initialization();
		uselink=loadLoginPage().navigateTodashboardPage().navigateToUsefulLinkPage();
	}
	
	@Test
	public void checkPageURLTest()
	{
		Assert.assertTrue(uselink.verifyPageCurrentURL());
	}
	@Test
	public void checkPageTitleTest()
	{
		Assert.assertTrue(uselink.verifyPageTitle());
	}
	@Test
	public void checkLinksContentTest()
	{
		Assert.assertTrue(uselink.verifyLinksContent());
	}
	@Test
	public void checkPageHeaderTest()
	{
		Assert.assertTrue(uselink.verifyHeaderText());
	}
	

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
