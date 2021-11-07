package com.jbk.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DashboardObjectRepository;
import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

public class DashboardPage extends DashboardObjectRepository {

	WebDriver driver;
	ExcelUtils xl;
	Utils util;
	String actual=null;
	String expected=null;
	List<String> actlist=null;
	List<String> explist=null;

	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		xl=new ExcelUtils();
		util=new Utils();
	}

	public UserPage  navigateToUsersPage()
	{
		userslink.click();
		return new UserPage(driver);
	}

	public OperatorPage navigateToOperatorsPage()
	{
		operatorslink.click();
		return new OperatorPage(driver);
	}

	public DownloadPage navigateToDownloadPage()
	{
		downloadslink.click();
		return new DownloadPage(driver);
	}

	public LogoutLinkPage navigateToLogoutPageTest()
	{
		logoutlink.click();
		return new LogoutLinkPage(driver);
	}
	public UsefulLinkPage navigateToUsefulLinkPage()
	{
		usefulLinks.click();
		return new UsefulLinkPage(driver);
	}
	public boolean verifydashboardTitle()
	{
		String expected = "JavaByKiran | Dashboard";
		return util.actTitle_expTitle(driver.getTitle(), expected);
	}

	public boolean verifyCoursesNames()
	{
		actlist =new ArrayList<String>();
		explist =xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/dashBoard.xlsx", 0, 1);
		for(WebElement course:courses)
		{
			String act=	course.getText();
			actlist.add(act);
		}
		return util.actList_expList(actlist, explist);	
	}

	public boolean verifyCoursesText()
	{
		actlist=new ArrayList<String>();
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/dashBoard.xlsx", 0, 2);
		for(WebElement text:coursetext)
		{
		String list=text.getText();
		actlist.add(list);
		}
		
		return util.actList_expList(actlist, explist);
	}

	public boolean verifyDashboardCourseFooter()
	{
		actual=coursefooter.getText();
		expected="Courses Offered";
		return util.actTitle_expTitle(actual, expected);
	}

	public boolean verifyDashboardFooter1()
	{
		actual=footer1.getText();
		expected="Design for Selenium Automation Test";
		return util.actTitle_expTitle(actual, expected);
	}


	public boolean verifyDashboardFooter2()
	{
		actual=footer2.getText();
		expected="Copyright © 2005-2019 JavaByKiran.";
		return util.actTitle_expTitle(actual, expected);
	}

//System.getProperty("user.dir")+"/src/main/resources/dashBoard.xlsx"
}
//