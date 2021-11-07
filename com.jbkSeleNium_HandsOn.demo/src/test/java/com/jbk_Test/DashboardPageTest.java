package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.DashboardPage;
import com.testbase.TestBase;


public class DashboardPageTest extends TestBase {

	WebDriver driver;
	DashboardPage dash;

	@BeforeClass
	public void setUpTest()
	{
		driver=initialization();
		dash=loadLoginPage().navigateTodashboardPage();
	}


	@Test(priority = 1)
	public void checkTitle()
	{
		Assert.assertTrue(dash.verifydashboardTitle());
	}
	@Test(priority = 2)
	public void checkCoursesNamesTest()
	{
		Assert.assertTrue(dash.verifyCoursesNames());
	}

	@Test(priority = 2)
	public void checkCoursestextTest()
	{
		Assert.assertTrue(dash.verifyCoursesText());
	}
	@Test(priority = 3)
	public void checkDashboardCourseFooterTest()
	{
		Assert.assertTrue(dash.verifyDashboardCourseFooter());
	}

	@Test(priority = 4)
	public void checkDashboardFooter1Test()
	{
		Assert.assertTrue(dash.verifyDashboardFooter1());
	}

	@Test(priority = 4)
	public void checkDashboardFooter2Test()
	{
		Assert.assertTrue(dash.verifyDashboardFooter2());
	}

	@AfterClass
	public void tearDownTest()
	{
		driver.close();
		System.out.println(" All Tests run Successfully..");
	}
}
