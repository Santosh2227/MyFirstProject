package com.jbk.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.OperatorObjectRepository;
import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

public class OperatorPage extends OperatorObjectRepository {

	WebDriver driver;
	ExcelUtils xl;
	Utils util;
	String actual=null;
	String expected=null;
	List<String> actlist=null;
	List<String> explist=null;

	public OperatorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		xl=new ExcelUtils();
		util=new Utils();
	}

	public boolean verifyPageCurrentURL()
	{
		actual=driver.getCurrentUrl();
		expected="file:///C:/SELENIUM/Offline%20Website/Offline%20Website/pages/examples/operators.html";
		return util.actTitle_expTitle(actual, expected);
	}
	public boolean verifyPageTitle()
	{
		actual=driver.getTitle();
		expected="JavaByKiran | Operators";
		return util.actTitle_expTitle(actual, expected);
	}
	
	public boolean verifyPersonNames()
	{
		actlist=new ArrayList<String>();
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/operators.xlsx", 1, 1);
		for(WebElement names: person)
		{
			String list=names.getText();
			actlist.add(list);
			
		}
		return util.actList_expList(actlist, explist);
	}
	
	public boolean verifyPersonContactList()
	{
		actlist=new ArrayList<String>();
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/operators.xlsx", 1, 4);
		for(WebElement names: contact)
		{
			String list=names.getText();
			actlist.add(list);
		}
		return util.actList_expList(actlist, explist);
	}
	public boolean verifyWay_to_connect()
	{
		actlist=new ArrayList<String>();
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/operators.xlsx", 1, 3);
		for(WebElement names: way_to_connect)
		{
			String list=names.getText();
			actlist.add(list);
		}
		return util.actList_expList(actlist, explist);
	}
	
	public boolean verifyTiming()//timings
	{
		actlist=new ArrayList<String>();
		explist=xl.getExcelColumnData(System.getProperty("user.dir")+"/src/main/resources/operators.xlsx", 1, 5);
		for(WebElement time:timings )
		{
			String list=time.getText();
			actlist.add(list);
		}
		return util.actList_expList(actlist, explist);

	}
	
}
