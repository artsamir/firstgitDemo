package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGDemo {
	
	WebDriver driver;
	
	// in @BeforeTest writing all pre condition
	
	@BeforeTest(alwaysRun =  true)
	public void setup() {
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@Test (groups = "smoke", priority = -1) // the lesser the value of priority, it will be executed first
	public void sendkeystest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys("This is Awasome");
	}
		
	
	@Test (groups = "regression", priority = -3)
	public void webtabletest() {		
				
		String num = driver.findElement(By.xpath("(//table)[1]/tbody/tr[9]/td[2]")).getText();
		System.out.println(num);
		
	}
	
	@Test (groups = "smoke", priority = -2)
	public void checkboxtest() {
		
		driver.findElement(By.name("checkBoxOption1")).click();
	}
	
	@Test (groups = "regression",priority = 4) // dependsOnMethods = "webtabletest")
	public void linktest() {
		
		WebElement link1 = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(link1));
		
		link1.click();  //using link test
		
	}
	
	
	// in @AfterTest writing all post condition
	 
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
	}

}
