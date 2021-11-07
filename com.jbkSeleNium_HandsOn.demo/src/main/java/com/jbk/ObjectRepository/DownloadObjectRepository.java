package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadObjectRepository {


	@FindBy(className="//td[3]")
	public WebElement downldlist;
	
	@FindBy(xpath="box-title")
	public List<WebElement> jars;
	

	@FindBy(className="content-header")
	public WebElement header;
	
	@FindBy(className="active")
	public WebElement pagelink;
	
}
