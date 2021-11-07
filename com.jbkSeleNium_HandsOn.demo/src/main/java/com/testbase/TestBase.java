package com.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.jbk.Pages.LogInPage;

public class TestBase {

	public WebDriver driver =null;
	Properties prop  =null;
	FileInputStream  fis =null;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	

	public Logger log=Logger.getLogger("TestBase.class");

	public String readproperty(String key)
	{
		log.info(" Reading Property From Propert File ");
		prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(" check correct key in config.properties ");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.info(" value Found In The Property File For :"+key);
		return prop.getProperty(key);		
	}
	
	
	public WebDriver initialization()
	{
		String browserName =	readproperty("browser");	
		log.info(" Initializing Browser With Name " +browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			log.info(" Chromedriver initializes");
		}
		else if(browserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecho.driver", "C:/gechodriver.exe");
			driver = new FirefoxDriver();
			log.info(" Firefoxdriver initializes");
		}
		else if(browserName.equals("Internet"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new InternetExplorerDriver();
			log.info(" Internetdriver initializes");
		}
			driver.get(prop.getProperty("url"));
			log.info(" Maximizing Browser Window ");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			log.info(" Applying Common Waits Over Browser ");
			driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		return driver;

	}

	public LogInPage loadLoginPage()
	{
		LogInPage lp = new LogInPage(driver);
		reportInit();
		return lp;	
	}
	
	public void reportInit() {
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Reports/ExtentReport.html");
		report = new ExtentReports();
		report.setSystemInfo("Host Name"," Kiran-JBK");
		report.setSystemInfo("Platform","Windows");
		report.setSystemInfo("Enviornment","Test Automation");
		report.attachReporter(spark);
	}
	
	public String takeScreenShot(String name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/target/screenshots/"+name+".jpg";
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}

