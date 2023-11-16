package org.group1;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups="Sanity")
	public void tc1() {
		System.out.println("sanity");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("Regression");
	}
	@Test(groups= {"Regression"})
	public void tc3() {
		System.out.println("Regression ");
	}
	@Test(groups= {"Regresssion","Smoke"})
	public void tc4() {
		System.out.println("Regression and Smoke");
	}
	@Test(groups="Smoke")
	public void tc5() {
		System.out.println("Smoke");
	}
}
