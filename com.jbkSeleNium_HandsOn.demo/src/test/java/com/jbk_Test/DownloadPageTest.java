package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.DownloadPage;
import com.testbase.TestBase;

public class DownloadPageTest extends TestBase {

	WebDriver driver;
	DownloadPage download;
	
	@BeforeClass
	public void setUp()
	{
		driver=initialization();
		download=loadLoginPage().navigateTodashboardPage().navigateToDownloadPage();
	}

	@Test(priority = 2)
	public void checkPageURLTest()
	{
		Assert.assertTrue(download.verifyPageCurrentURL());
	}
	
	@Test(priority = 1)
	public void checkPageTitleTest()
	{
		Assert.assertTrue(download.verifyPageTitle());
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
