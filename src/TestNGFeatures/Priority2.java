package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority2 {
	
	//test execution order with priority
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority =1)
	public void C(){
		boolean logo1= driver.findElement(By.xpath("//img[@alt=\"orangehrm-logo\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("C");
	}
	@Test(priority =2)
	public void A(){
		boolean logo1= driver.findElement(By.xpath("//img[@alt=\"orangehrm-logo\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("A");
	}
	@Test(priority =0)
	public void B(){
		boolean logo1= driver.findElement(By.xpath("//img[@alt=\"orangehrm-logo\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("B");
	}
	@Test(priority =-1)
	public void D(){
		boolean logo1= driver.findElement(By.xpath("//img[@alt=\"orangehrm-logo\"]")).isDisplayed();
		System.out.println(logo1);
		System.out.println("D");
	}
	@AfterClass
	public void Teardown()throws InterruptedException{
		Thread.sleep(4000);
		driver.quit();
	}
	

}
