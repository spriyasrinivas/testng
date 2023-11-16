package org.dataprovider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider extends BaseClass {
	PageManager manager = new PageManager();
	@BeforeClass
	public void beforeClass()
	{
		launchBrowser();
	}
@BeforeMethod
public void beforeMethod()
{
	loadUrl("https://www.facebook.com/");
}
@Test(dataProvider="loginData")
public  void aa(String Username,String Password)
{
	passValue(manager.getfaceBook().getEmail(),Username);
	passValue(manager.getfaceBook().getPassword(),Password);

}
@org.testng.annotations.DataProvider(name="loginData")
private Object[][] data(){

	Object a[] []= new Object[][]{{"priya","123"},{"mithran","123"}};
	return a;
	}

{
	
}
}
