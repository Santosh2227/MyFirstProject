package com.jbk_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Pages.UserPage;
import com.testbase.TestBase;

public class UserPageTest extends TestBase {

	WebDriver driver;
	UserPage user;

	@BeforeClass
	public void setup() {
		driver=initialization();
		user=loadLoginPage().navigateTodashboardPage().navigateToUsersPage();

	}
	@Test(priority = 2)
	public void checkAddUserTest()
	{
		Assert.assertTrue(user.verifyAddUserText());
	}

	@Test(priority = 3)
	public void checkUserListTest()
	{
		Assert.assertTrue(user.verifyUserlistText());
	}
	@Test(priority = 4)
	public void checkDashboardFooter1Test()
	{
		Assert.assertTrue(user.verifyDashboardFooter1());
	}

	@Test(priority = 5)
	public void checkDashboardFooter2Test()
	{
		Assert.assertTrue(user.verifyDashboardFooter2());
	}


	@AfterClass
	public void tearDown()
	{
		driver.close();
		System.out.println(" All Tests run Successfully..");
	}

}



//driver.get("file:///C:/SELENIUM/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
