package BYjus;




	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class counselling_session {
		WebDriver driver;
		
		@BeforeMethod
		
	public void Setup() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkban\\Desktop\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://byjus.com/btc/");
	}
		@Test
		public void Byjus2() throws InterruptedException {
			
			driver.findElement(By.xpath("//button[@id='home-btn']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("name-input")).sendKeys("Vaishali");
			driver.findElement(By.xpath("//div[@class='col-sm-10 col-xs-9 phone-no-col']//input[@id='name-input']")).sendKeys("9970017221");
			driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
			
			//driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
			//button[contains(text(),'×')]
			 Thread.sleep(15000);
			//select[@id='formCity']
	WebElement City=driver.findElement(By.xpath("//select[@id='formCity']"));
			
			Select S1=new Select(City);
			
			S1.selectByVisibleText(" Delhi");
			
			Thread.sleep(5000);
			
			//select[@id='formCenter']
			
	WebElement Center=driver.findElement(By.xpath("//select[@id='formCenter']"));
			
			Select S2=new Select(Center);
			
			S2.selectByVisibleText(" Delhi-Dabri Road");
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//input[@id='class-ten']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
			
			
			Thread.sleep(5000);
			
			
	}


	@AfterMethod

	public void Teardown() {
		
		driver.quit();
	}

	}



