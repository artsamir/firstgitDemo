package day7;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class orangeHRMtestNG {
	
	WebDriver driver;
	
	// in @BeforeTest writing all pre condition
	
	@BeforeTest(alwaysRun =  true)
	public void setup() {
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@org.testng.annotations.Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}	
	
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
	}

}
