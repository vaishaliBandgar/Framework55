package TestNGFeatures;

import org.testng.annotations.Test;

public class dependsOnMethods1 {
	
	@Test
	public void LoginTest() {
		System.out.println("LoginTest");
		int number=10/0;
		}
	@Test(dependsOnMethods= "LoginTest")
	public void Homepage() {
		System.out.println("Homepage");
		
	}
	@Test(dependsOnMethods= "LoginTest")
	public void Searchpage() {
		System.out.println("Searchpage");
		
	}
	@Test
	public void Refreshpage() {
		System.out.println("Refreshpage");
		
	}
	
	

}
