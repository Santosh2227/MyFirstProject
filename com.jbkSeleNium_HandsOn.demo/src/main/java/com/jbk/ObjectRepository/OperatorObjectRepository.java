package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OperatorObjectRepository {

	@FindBy(xpath="//tr[1]")
	public List<WebElement> row1_header;

	@FindBy(xpath="//tr[2]")
	public List<WebElement> row2_kiran;

	@FindBy(xpath="//tr[3]")
	public List<WebElement> row3_nilam;

	@FindBy(xpath="//tr[4]")
	public List<WebElement> row4_seema;

	@FindBy(xpath="//tr[5]")
	public List<WebElement> row5_varsha;

	@FindBy(xpath="//tr[6]")
	public List<WebElement> row6_darshit;

	@FindBy(xpath="//td[2]")
	public List<WebElement> person ;

	@FindBy(xpath="//td[3]")
	public	List<WebElement> For;

	@FindBy(xpath="//td[4]")
	public List<WebElement> way_to_connect ;

	@FindBy(xpath="//td[5]")
	public List<WebElement> contact;

	@FindBy(xpath="//td[6]")
	public List<WebElement> timings;


}
