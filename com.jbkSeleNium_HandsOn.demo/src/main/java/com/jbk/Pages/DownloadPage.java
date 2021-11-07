package com.jbk.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DownloadObjectRepository;
import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

import java.util.List;

public class DownloadPage extends DownloadObjectRepository{
	WebDriver driver;
	ExcelUtils xl;
	Utils util;
	String actual=null;
	String expected=null;
	List<String> actlist=null;
	List<String> explist=null;

	public DownloadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		xl=new ExcelUtils();
		util=new Utils();
	}

	public boolean verifyPageCurrentURL()
	{
		actual=driver.getCurrentUrl();
		expected="file:///C:/SELENIUM/Offline%20Website/Offline%20Website/pages/examples/downloads.html";
		return util.actTitle_expTitle(actual, expected);
	}
	public boolean verifyPageTitle()
	{
		actual=driver.getTitle();
		expected="JavaByKiran | Downloads";
		return util.actTitle_expTitle(actual, expected);
	}


}