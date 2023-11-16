package org.group;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="Sanity")
	public void tc1() {
		System.out.println("sanity");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("Regression");
	}
	@Test(groups= {"Regression","Sanity"})
	public void tc3() {
		System.out.println("Regression and sanitytc3");
	}
	@Test(groups= {"Regresssion","Smoke"})
	public void tc4() {
		System.out.println("Regression and Smoketc4");
	}
	@Test(groups="Smoke")
	public void tc5() {
		System.out.println("Smoke");
	}
}
