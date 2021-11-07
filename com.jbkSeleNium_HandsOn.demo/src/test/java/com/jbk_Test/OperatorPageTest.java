package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.OperatorPage;
import com.testbase.TestBase;

public class OperatorPageTest extends TestBase 
{

	WebDriver driver;
	OperatorPage operator;

	@BeforeClass
	public void setUpTest()
	{
		driver=initialization();
		operator=loadLoginPage().navigateTodashboardPage().navigateToOperatorsPage();
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

	@Test
	public void checkPageURLTest()
	{
		Assert.assertTrue(operator.verifyPageCurrentURL());
	}
	@Test
	public void checkPageTitleTest()
	{
		Assert.assertTrue(operator.verifyPageTitle());
	}
	@Test
	public void checkPersonNamesTest()
	{
		Assert.assertTrue(operator.verifyPersonNames());
	}

	@Test
	public void checkPersonContactListTest()
	{
		Assert.assertTrue(operator.verifyPersonContactList());
	}

	@Test
	public void checkWay_to_connectTest()
	{
		Assert.assertTrue(operator.verifyWay_to_connect());
	}

	@Test
	public void checkTimingsTest()
	{
		Assert.assertTrue(operator.verifyTiming());
	}




}