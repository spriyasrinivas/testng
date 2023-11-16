package org.group;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups="Sanity")
	public void tc1() {
		System.out.println("sanity");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("Regressiontc2");
	}
	
	@Test(groups="Smoke")
	public void tc5() {
		System.out.println("Smoke");
	}
}
