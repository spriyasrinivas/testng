package org.reports;

import org.dataprovider.BaseClass;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
 @Test
 public void aa()
 {
	 launchBrowser();
	 Reporter.log("the browser should be launched");
	 loadUrl("https://toolsqa.com/testng/testng-dataproviders/");
	 
 }
}
