package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageObjectRepository {



	@FindBy(id="email")
	public WebElement email;

	@FindBy(id="password")
	public WebElement pass;

	@FindBy(xpath="//button")
	public WebElement loginbtn;

	@FindBy(xpath="//img")
	public	WebElement JBKlogo;

	@FindBy(className ="text-center")
	public WebElement footer;
	
	@FindBy(tagName="b")
	public	WebElement title;
}
