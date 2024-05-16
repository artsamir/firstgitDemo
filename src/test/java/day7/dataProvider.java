package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	WebDriver driver;
	
	// in @BeforeTest writing all pre condition
	
	@BeforeTest(alwaysRun =  true)
	public void setup() {
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test (dataProvider = "datap")
	public void logintest(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@DataProvider (name = "datap")
	public Object[][] datap() {
		
		return new Object[][] // 2 - D array
				{
			new Object[] { "Admin", "admin123" }, // new objects of 2darray and passing my data from it
			new Object[] { "Admin", "adminpass" },
			new Object[] { "user123", "admin123" },
			new Object[] { "operator", "user123" },
				
			};		
		
		
	}
	
	
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
	}

}
