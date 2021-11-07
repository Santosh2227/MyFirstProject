package com.jbk_Test;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.LogInPage;
import com.testbase.TestBase;


public class LogInPageTest extends TestBase {
	WebDriver driver=null;
	LogInPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=initialization();
		lp=loadLoginPage();
	}
	
	@Test(priority = 1)
	public void verifyTitleTest()
	{
		Assert.assertTrue(lp.checkTitle());
	}


	@Test(priority = 2)
	public void verifyTitleHeadingTest()
	{
		Assert.assertTrue(lp.verifyTitleHeading());
	}
	
	@Test
	public void logoDisplayTest()
	{
		Assert.assertTrue(lp.logoDisplay(), " Jbk Logo is Displayed..");
	}
	
	
	@Test
	public void checkFooterTest()
	{
		Assert.assertTrue(lp.verifyFootertext(), " Register MemberShip Text");
	}
	/*
	 * @Test(priority = 3) public void navigateToDashboardPage() {
	 * Assert.assertTrue(lp.signInWithValidCredential()); }
	 * 
	 */
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
}
