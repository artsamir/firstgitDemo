package day7;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jUnitDemo {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	}
	
	
	@org.junit.Test
	public void test1() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("This batch is Awesome!");
		
		
	}
	
	@org.junit.Test
	public void test2() throws InterruptedException {
		
		String num = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[9]/td[2]")).getText();
		
		System.out.println(num);	
		
		Thread.sleep(2000);
		
	}
	
	
	
	@After
	public void teardown() {
		
		driver.quit();
		
	}
	

}
