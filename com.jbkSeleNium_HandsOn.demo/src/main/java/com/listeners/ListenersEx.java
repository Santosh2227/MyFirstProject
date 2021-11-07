package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.testbase.TestBase;

public class ListenersEx extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		log.info("Test Case Starts With Name :"+result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test Case Passed With Name :"+result.getName());
		test.log(Status.PASS, "Testcase paased successfully");

	}

	public void onTestFailure(ITestResult result) {
		log.info("Testcase failed with name: "+result.getName());
		//log.info(result.getThrowable());
		test.log(Status.FAIL, "Testcase failed");
		test.log(Status.FAIL, result.getThrowable());
		String path= takeScreenShot(result.getName());
		test.addScreenCaptureFromPath(path);

	}
	public void onTestSkipped(ITestResult result) {
		log.info("Test Case Skipped With Name :"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info(" percentage ");

	}

	public void onStart(ITestContext context) {
		log.info("Test Suite Is Ready To Start The execution");

	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Suite Is finished To Start The execution");
		report.flush();
	}


}



/*
SimpleDateFormat sdf = new SimpleDateFormat("  dd-MM-yyyy-hh-mm-ss");
TakesScreenshot ts=	(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File destination = new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+sdf.format(  new Date())+".jpg");
try {
	FileUtils.copyFile(source, destination);
	System.out.println(" screenshots captured");
} catch (IOException e) {
	e.printStackTrace();
}
log.info("Test Case Failured With Name :"+result.getName());
//test.log(Status.FAIL, "Testcase failed");
//test.log(Status.FAIL, result.getThrowable());
//test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+result.getName()+sdf.format(  new Date())+".jpg");

*/