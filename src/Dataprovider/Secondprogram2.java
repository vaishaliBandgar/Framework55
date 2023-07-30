package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Secondprogram2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(dataProvider ="Logindata")
	public void Logintest(String Uname,String PWD,String Expected)throws InterruptedException {
		
	driver.get("https://admin-demo.nopcommerce.com/login");
	
	WebElement User = driver.findElement(By.id("Email"));
		User.clear();
		Thread.sleep(2000);
	    User.sendKeys(Uname);
	    
		WebElement Pass = driver.findElement(By.name("password"));
		Pass.clear();
		Thread.sleep(2000);
    	Pass.sendKeys("PWD");
    	
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	Thread.sleep(2000);
    	
    	
    	String Act_title =driver.getTitle();
		String Exp_title = "Dashboard / nopCommerce administration";
    	

    	
    	if(Expected.equals("valid")) {
    		if(Exp_title.equals(Act_title)) {
    		driver.findElement(By.linkText("Logout")).click();
    		Assert.assertTrue(true);  //pass
    	}
    	else {
    		Assert.assertTrue(false);  //fail
    		}
	}
	else if(Expected.equals("Invalid")) {
		
		if(Exp_title.equals(Act_title)) {  //false
			driver.findElement(By.linkText("Logout")).click();
    		Assert.assertTrue(false);
			}
		else {
			Assert.assertTrue(false);  //pass
			}
			}
    	
	}
  @DataProvider(name ="Logindata")
	public String[][] LoginData(){
		
		String Logindata [][]= { {"admin@yourstore.com","admin","valid"},
								 {"admin@yourstore.com","admin1","Invalid"},
								 {"admin@yourstore.com","admin","Invalid"}	,
								 {"admin@yourstore.com","admin2","Invalid"},};
		
		return Logindata;
	}
  @AfterMethod
  public void TearDown() {
	  driver.quit();
  }
	
}