package com.jbk.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.UserPageObjectRepository;
import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

public class UserPage extends UserPageObjectRepository {

	WebDriver driver;
	ExcelUtils xl;
	Utils util;
	String actual=null;
	String expected=null;
	List<String> actlist=null;
	List<String> explist=null;

	public UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		xl=new ExcelUtils();
		util=new Utils();
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
	public boolean verifyAddUserText()
	{
		actual=adduserbtn.getText();
		expected="Add User";
		return util.actTitle_expTitle(actual, expected);
	}
	
	public boolean verifyUserlistText()
	{
		actual=userList.getText();
		expected="User List";
		return util.actTitle_expTitle(actual, expected);
	}
	
}
