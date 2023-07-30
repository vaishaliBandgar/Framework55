package Annatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annatationtheory {
	
	//Execution sequence of annotations
//	@Beforesuit ---setup system property
//	@BeforeTest--Enter URL
//	@BeforeClass--Launchbrowser
//	@Beforemethod--Login application
//	@test--GoogleTitle1
//	@AfterMethod-->Logoutfrom application
//	@Beforemethod--login application
//	@Test--googleTitles3
//	@AfterMethod---LogoutFrom application
//	@Afterclass-- close browser
	//@AfterTest--Deletecookies
	
//1..........precondition annotation..........
	//1.@BeforeSuit--setup system pro
	
	//In real time project we dont need all these annotations we use only
	//beforeclass @beforemethod
	
	@BeforeSuite
	public void Setup() {
		System.out.println("@BeforeSuite---setup systemProperty");
	}
	
	@BeforeTest
	public void URL() {
		System.out.println("@BeforeSuite---Enter URL");
	}
	
	@BeforeClass
	public void Launchbrowser() {
		System.out.println("@BeforeClass---Launchbrowser");
	}
	
	
	@BeforeMethod
	public void Login() {
		System.out.println("@BeforeMethod-----Login application");
	}
	//2...Test annotation
	
	@Test
	public void googleTitle1() {
		System.out.println("@test---googleTitle1");
	}
	
	@Test
	public void googleTitle2() {
		System.out.println("@test---googleTitle2");
	}
	
	//3.Postcondition annotation
	//@AfterSuite
	
	@AfterMethod
	public void Logout() {
		System.out.println("@AfterMethod---Logoutfrom Application");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("@AfterClass---Close browser");
	}

	@AfterTest
	public void deletecookies() {
		System.out.println("@AfterTest---Deletecookies");
	}


	@AfterSuite
	public void Logout1() {
		System.out.println("@AfterSuite---Logout1");
	}
	@Test
	public void googleTitle3() {
		System.out.println("@test---googleTitle3");
	}




}
