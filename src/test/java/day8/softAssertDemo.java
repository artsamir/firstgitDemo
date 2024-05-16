package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertDemo {
	WebDriver driver;
	SoftAssert sa;
	
	/*
	 * @Test public void zerodhatest() { driver = new ChromeDriver();
	 * driver.get("https://zerodha.com/"); driver.manage().window().maximize();
	 * 
	 * String actualtitle = driver.getTitle(); String expectedtitle =
	 * "erodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha"
	 * ;
	 * 
	 * // Soft Assertion for title check sa = new SoftAssert();
	 * sa.assertEquals(actualtitle, expectedtitle);
	 * 
	 * driver.findElement(By.linkText("Signup")).click();
	 * 
	 * sa.assertAll(); // only if use assertAll() then only we can see the assertion
	 * failure message. // assertAll() is a mandatory step in soft assert(). }
	 */
	
	@BeforeClass
	public void rahulshettytest() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Practice Page";
		
		// Soft Assertion for title check
		sa = new SoftAssert();
		sa.assertEquals(actualtitle, expectedtitle);
				
		sa.assertAll(); // only if use assertAll() then only we can see the assertion failure message.
		// assertAll() is a mandatory step in soft assert().
	}
	
	@Test
	public void clicktest() {
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		
		boolean status = checkbox1.isSelected();
		sa = new SoftAssert();
		sa.assertTrue(status);
		
		driver.navigate().refresh();
		
		sa.assertAll();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	

}
