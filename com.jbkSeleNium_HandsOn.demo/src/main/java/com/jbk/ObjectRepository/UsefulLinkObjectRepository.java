package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinkObjectRepository {

	@FindBy(xpath="//td[2]")
	public List<WebElement> content;
	
	@FindBy(xpath="//li[@class='active']")
	public WebElement usefullinks;
	
}
