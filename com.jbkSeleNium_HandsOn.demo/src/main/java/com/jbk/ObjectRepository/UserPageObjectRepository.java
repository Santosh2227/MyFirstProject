package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjectRepository {

	@FindBy(xpath="//button[text()='Add User']")
	public WebElement adduserbtn;
	
	@FindBy(className="box-title")
	public WebElement userList;
	
	@FindBy(xpath="//b[text()='Design for Selenium Automation Test']")  
	public WebElement footer1;                

	@FindBy(xpath="//strong[text()='Copyright © 2005-2019 ']")
	public	WebElement footer2;      
}
