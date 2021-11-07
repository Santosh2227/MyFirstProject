package com.jbk.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.utilities.ExcelUtils;
import com.jbk.utilities.Utils;

public class LogoutLinkPage{
	
		WebDriver driver;
		ExcelUtils xl;
		Utils util;
		String actual=null;
		String expected=null;
		List<String> actlist=null;
		List<String> explist=null;

		public LogoutLinkPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			xl=new ExcelUtils();
			util=new Utils();
		}
		
		public boolean verifyPageCurrentURL()
		{
			actual=driver.getCurrentUrl();
			expected="file:///C:/SELENIUM/Offline%20Website/Offline%20Website/pages/examples/logout.html";
			return util.actTitle_expTitle(actual, expected);
		}
		public boolean verifyPageTitle()
		{
			actual=driver.getTitle();
			expected="JavaByKiran | Logout";
			return util.actTitle_expTitle(actual, expected);
		}	
	
}
