package com.jbk.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.LogInPageObjectRepository;
import com.jbk.utilities.Utils;

public class LogInPage extends LogInPageObjectRepository  {

	WebDriver driver=null;	
	Utils util;

	public LogInPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		util=new Utils();
	}

	
	public boolean checkTitle()
	{
		return util.actTitle_expTitle(driver.getTitle(), "JavaByKiran | Log in");
	}

	public boolean verifyTitleHeading()
	{
		return util.actTitle_expTitle(title.getText(),"Java By Kiran");
	}

	public boolean logoDisplay()
	{
		return JBKlogo.isDisplayed();
	}

	
	public boolean verifyFootertext()
	{
	return util.actTitle_expTitle(footer.getText(), "Register a new membership");
	}
	
	public  DashboardPage navigateTodashboardPage()
	{
		email.clear();
		pass.clear();
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginbtn.click();

		return new DashboardPage(driver); 
	}


}