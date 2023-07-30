package TestNGFeatures;

import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Test1() {
		System.out.println("Hello");
	}
	@Test(groups = {"smoke"})
	public void Test5() {
		System.out.println("Day 1-Test5");
	}

}
