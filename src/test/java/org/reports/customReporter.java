package org.reports;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class customReporter implements ITestListener {
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
public void onTestSuccess(ITestResult result)
{
	System.out.println("test is successfully completed");
}
public void onTestFailure(ITestResult result) {
	System.out.println("failed");
}
}
