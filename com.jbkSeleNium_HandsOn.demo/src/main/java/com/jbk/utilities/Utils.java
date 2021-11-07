package com.jbk.utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class Utils {

	WebDriver driver;
	public boolean actTitle_expTitle(String actTitle, String expTitle)
	{
		System.out.println(" Actual.. TitleText is   :"+actTitle);
		System.out.println(" Expected TitleText is :"+expTitle);

		if(actTitle.equals(expTitle)) {
			System.out.println(" Title Is Matched");
			System.out.println("---------------------------------");
			return true;
		}else {
			System.out.println(" Title Is Not matched");
			System.out.println("-----------------------------");
			return false;
		}
	}

	public boolean actList_expList(List<String> actual, List<String> expected)
	{
		System.out.println("Actual List :"+actual);
		System.out.println("Expect List :"+expected);
		
		if(actual.equals(expected))
		{
			System.out.println("List of WebElement Found equals and Matched");
			System.out.println("--------------------------------");
			return true;
		}else
		{
			System.out.println("List of WebElwment Found Different");
			System.out.println("--------------------------------");
			return false;
		}
	}

}
