package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardObjectRepository {


	@FindBy(xpath="//h3")
	public List<WebElement> courses;
	
	@FindBy(xpath="//p//following::div[@class='inner']//p")
	public List<WebElement> coursetext;

	@FindBy(xpath="//h3[text()='Selenium']")
	public WebElement selenium;

	@FindBy(xpath="//h3[text()='Java / J2EE']")
	public WebElement j2ee;

	@FindBy(xpath="//h3[text()='Python']")
	public WebElement python;

	@FindBy(xpath="//h3[text()='Php']")
	public WebElement php;

	@FindBy(xpath="//span[@class='logo-lg']")
	public WebElement header;

	@FindBy(xpath="//a[@href='users.html']")
	public WebElement userslink  ;

	@FindBy(xpath="//a[@href='operators.html']")
	public WebElement operatorslink  ;
	
	@FindBy(xpath="//li[5]")
	public WebElement usefulLinks;

	@FindBy(xpath="//a[@href='downloads.html']") 
	public WebElement downloadslink  ;

	@FindBy(xpath="//a[@href='logout.html' or @class='LOGOUT'][span]")
	public WebElement logoutlink  ;

	@FindBy(xpath="//b[text()='Design for Selenium Automation Test']")  
	public WebElement footer1;                

	@FindBy(xpath="//a[text()='JavaByKiran']")  
	public	WebElement Title;              

	@FindBy(xpath="//small[text()='Courses Offered']")  	
	public	WebElement coursefooter;  

	@FindBy(xpath="//strong[text()='Copyright © 2005-2019 ']")
	public	WebElement footer2;                 


	@FindBy(xpath="//tr[@id='tr_2']")  
	public	WebElement sagar;

}
