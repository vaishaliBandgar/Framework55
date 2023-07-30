package Dataprovider;

import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.Assert;

	public class secondprogram {
	

		WebDriver driver;
		@BeforeMethod
		public void SetUp() {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\bkban\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		}
		
		@Test(dataProvider = "Logindata")
		public void LoginTest(String Username, String PWD, String Title) throws InterruptedException {
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");	
			WebElement email =driver.findElement(By.xpath("//input[@id=\"Email\"]"));
			WebElement password =driver.findElement(By.xpath("//input[@id=\"Password\"]"));
			WebElement login =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			
			email.clear();
			Thread.sleep(3000);
			email.sendKeys(Username);
			
			password.clear();
			Thread.sleep(3000);
			password.sendKeys(PWD);
			
			login.click();
			String Act_title = driver.getTitle();
			System.out.println(Act_title);
			String Exp_title = "Dashboard / nopCommerce administration";
			
			if(Title.equals("valid")) {
				if(Act_title.equals(Exp_title)) {
					driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
			else if(Title.equals("Invalid")) {
				if(Act_title.equals(Exp_title)) {
					driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();//false
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
				
			}
		
		}
		
		@DataProvider(name="Logindata")
		public String[][] getData() {
			String [][]data = {{"admin@yourstore.com","admin","valid"},{"admin@yourstore.com","admin1","Invalid"},{"admin@yourstore.com1","admin","Invalid"},
					{"admin@yourstore.com1","admin1","Invalid"}};
			
			return data;
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
	}



