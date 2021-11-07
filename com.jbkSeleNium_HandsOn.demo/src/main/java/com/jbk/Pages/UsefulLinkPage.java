package com.jbk.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.UsefulLinkObjectRepository;
import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

public class UsefulLinkPage extends UsefulLinkObjectRepository{
	WebDriver driver;
	ExcelUtils xl;
	Utils util;
	String actual=null;
	String expected=null;
	List<String> actlist=null;
	List<String> explist=null;

	public UsefulLinkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		xl=new ExcelUtils();
		util=new Utils();
	}
	
	public boolean verifyPageCurrentURL()
	{
		actual=driver.getCurrentUrl();
		expected="file:///C:/SELENIUM/Offline%20Website/Offline%20Website/pages/examples/links.html";
		return util.actTitle_expTitle(actual, expected);
	}
	public boolean verifyPageTitle()
	{
		actual=driver.getTitle();
		expected="JavaByKiran | Useful Links";
		return util.actTitle_expTitle(actual, expected);
	}
	
	public boolean verifyLinksContent()
	{
		actlist=new ArrayList<String>();
		for(WebElement link:content)
		{
			String list=link.getText();
			actlist.add(list);
		}
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/UsefulLinks.xlsx", 0, 1);
		return util.actList_expList(actlist, explist);
	}
	
	public boolean verifyHeaderText()
	{
		actual=usefullinks.getText();
		expected="Useful Links";
		return util.actTitle_expTitle(actual, expected);
	}
	
}
